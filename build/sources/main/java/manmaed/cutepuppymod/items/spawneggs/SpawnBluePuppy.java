package manmaed.cutepuppymod.items.spawneggs;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.entity.EntityBluePuppy;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

import static net.minecraft.item.ItemMonsterPlacer.getEntityIdFromItem;

public class SpawnBluePuppy extends Item {

	private static String name = "SpawnBluePuppy";

	public static String getName() {

		return name;
	}

	public SpawnBluePuppy() {
		super();
		setUnlocalizedName(name);
		setCreativeTab(CutePuppyMod.tabsCMP);
	}

	/*	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
        {
                EntityJodPuppy par1EntityJodPuppy = new EntityJodPuppy(world);
                world.spawnEntityInWorld(par1EntityJodPuppy);
                System.out.println("True");
                return  itemstack;
         
            
        }
        */
	/**
	 * Called when a Block is right-clicked with this Item
	 */
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (worldIn.isRemote)
		{
			return EnumActionResult.SUCCESS;
		}
		else if (!playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
		{
			return EnumActionResult.FAIL;
		}
		else
		{
			IBlockState iblockstate = worldIn.getBlockState(pos);

			if (iblockstate.getBlock() == Blocks.MOB_SPAWNER)
			{
				TileEntity tileentity = worldIn.getTileEntity(pos);

				if (tileentity instanceof TileEntityMobSpawner)
				{
					MobSpawnerBaseLogic mobspawnerbaselogic = ((TileEntityMobSpawner)tileentity).getSpawnerBaseLogic();
					mobspawnerbaselogic.setEntityName(getEntityIdFromItem(stack));
					tileentity.markDirty();
					worldIn.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);

					if (!playerIn.capabilities.isCreativeMode)
					{
						--stack.stackSize;
						worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

					}

					return EnumActionResult.SUCCESS;
				}
			}

			pos = pos.offset(facing);
			double d0 = 0.0D;

			if (facing == EnumFacing.UP && iblockstate.getBlock() instanceof BlockFence) //Forge: Fix Vanilla bug comparing state instead of block
			{
				d0 = 0.5D;
			}

			Entity entity = spawnCreature(worldIn, getEntityIdFromItem(stack), (double)pos.getX() + 0.5D, (double)pos.getY() + d0, (double)pos.getZ() + 0.5D);

			if (entity != null)
			{
				if (entity instanceof EntityLivingBase && stack.hasDisplayName())
				{
					entity.setCustomNameTag(stack.getDisplayName());
				}

				applyItemEntityDataToEntity(worldIn, playerIn, stack, entity);

				if (!playerIn.capabilities.isCreativeMode)
				{
					--stack.stackSize;
				}
			}

			return EnumActionResult.SUCCESS;
		}
	}

	/**
	 * Applies the data in the EntityTag tag of the given ItemStack to the given Entity.
	 */
	public static void applyItemEntityDataToEntity(World entityWorld, @Nullable EntityPlayer player, ItemStack stack, @Nullable Entity targetEntity)
	{
		MinecraftServer minecraftserver = entityWorld.getMinecraftServer();

		if (minecraftserver != null && targetEntity != null)
		{
			NBTTagCompound nbttagcompound = stack.getTagCompound();

			if (nbttagcompound != null && nbttagcompound.hasKey("EntityTag", 10))
			{
				if (!entityWorld.isRemote && targetEntity.ignoreItemEntityData() && (player == null || !minecraftserver.getPlayerList().canSendCommands(player.getGameProfile())))
				{
					return;
				}

				NBTTagCompound nbttagcompound1 = targetEntity.writeToNBT(new NBTTagCompound());
				UUID uuid = targetEntity.getUniqueID();
				nbttagcompound1.merge(nbttagcompound.getCompoundTag("EntityTag"));
				targetEntity.setUniqueId(uuid);
				targetEntity.readFromNBT(nbttagcompound1);
			}
		}
	}

	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	{
		if (worldIn.isRemote)
		{
			return new ActionResult(EnumActionResult.PASS, itemStackIn);
		}
		else
		{
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

			if (raytraceresult != null && raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!(worldIn.getBlockState(blockpos).getBlock() instanceof BlockLiquid))
				{
					return new ActionResult(EnumActionResult.PASS, itemStackIn);
				}
				else if (worldIn.isBlockModifiable(playerIn, blockpos) && playerIn.canPlayerEdit(blockpos, raytraceresult.sideHit, itemStackIn))
				{
					Entity entity = spawnCreature(worldIn, getEntityIdFromItem(itemStackIn), (double)blockpos.getX() + 0.5D, (double)blockpos.getY() + 0.5D, (double)blockpos.getZ() + 0.5D);

					if (entity == null)
					{
						return new ActionResult(EnumActionResult.PASS, itemStackIn);
					}
					else
					{
						if (entity instanceof EntityLivingBase && itemStackIn.hasDisplayName())
						{
							entity.setCustomNameTag(itemStackIn.getDisplayName());
						}

						applyItemEntityDataToEntity(worldIn, playerIn, itemStackIn, entity);

						if (!playerIn.capabilities.isCreativeMode)
						{
							--itemStackIn.stackSize;
						}

						playerIn.addStat(StatList.getObjectUseStats(this));
						return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
					}
				}
				else
				{
					return new ActionResult(EnumActionResult.FAIL, itemStackIn);
				}
			}
			else
			{
				return new ActionResult(EnumActionResult.PASS, itemStackIn);
			}
		}
	}

	/**
	 * Spawns the creature specified by the egg's type in the location specified by the last three parameters.
	 * Parameters: world, entityID, x, y, z.
	 */
	@Nullable
	public static Entity spawnCreature(World worldIn, @Nullable String entityID, double x, double y, double z)
	{
		if (entityID != null && EntityList.ENTITY_EGGS.containsKey(entityID))
		{
			Entity entity = null;

			for (int i = 0; i < 1; ++i)
			{
				entity = EntityList.createEntityByIDFromName(entityID, worldIn);

				if (entity instanceof EntityLivingBase)
				{
					EntityBluePuppy entityliving = (EntityBluePuppy)entity;
					entity.setLocationAndAngles(x, y, z, MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
					entityliving.rotationYawHead = entityliving.rotationYaw;
					entityliving.renderYawOffset = entityliving.rotationYaw;
					entityliving.onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entityliving)), (IEntityLivingData)null);
					worldIn.spawnEntityInWorld(entity);
					entityliving.playLivingSound();
				}
			}

			return entity;
		}
		else
		{
			return null;
		}
	}
}
	/*	EntityBluePuppy ent = new EntityBluePuppy(worldIn); //change to whatever entity you're trying to spawn
		LogHelper.info("Ro Yaw: " + playerIn.rotationYaw + " Roo Pitch: " + playerIn.rotationPitch);
		ent.setLocationAndAngles(worldIn..posX , playerIn.posY, playerIn.posZ +5 , MathHelper.wrapDegrees(worldIn.rand.nextFloat() * 360.0F), 0.0F);
		//ent.initCreature();
		worldIn.spawnEntityInWorld(ent);
	*/
/*
		public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet)
		{

			if (!world.isRemote)
			{
				EntityBluePuppy ent = new EntityBluePuppy(world); //change to whatever entity you're trying to spawn
				ent.setLocationAndAngles(x, y + 1, z, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
				//ent.initCreature();
				world.spawnEntityInWorld(ent);
				item.stackSize--;
			}
			return true;
		}
	}
	worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
*/
