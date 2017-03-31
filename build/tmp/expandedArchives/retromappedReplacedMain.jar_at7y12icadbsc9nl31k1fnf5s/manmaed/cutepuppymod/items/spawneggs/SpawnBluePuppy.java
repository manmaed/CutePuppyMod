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
		func_77655_b(name);
		func_77637_a(CutePuppyMod.tabsCMP);
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
	public EnumActionResult func_180614_a(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (worldIn.field_72995_K)
		{
			return EnumActionResult.SUCCESS;
		}
		else if (!playerIn.func_175151_a(pos.func_177972_a(facing), facing, stack))
		{
			return EnumActionResult.FAIL;
		}
		else
		{
			IBlockState iblockstate = worldIn.func_180495_p(pos);

			if (iblockstate.func_177230_c() == Blocks.field_150474_ac)
			{
				TileEntity tileentity = worldIn.func_175625_s(pos);

				if (tileentity instanceof TileEntityMobSpawner)
				{
					MobSpawnerBaseLogic mobspawnerbaselogic = ((TileEntityMobSpawner)tileentity).func_145881_a();
					mobspawnerbaselogic.func_98272_a(func_185080_h(stack));
					tileentity.func_70296_d();
					worldIn.func_184138_a(pos, iblockstate, iblockstate, 3);

					if (!playerIn.field_71075_bZ.field_75098_d)
					{
						--stack.field_77994_a;
						worldIn.func_184148_a((EntityPlayer)null, playerIn.field_70165_t, playerIn.field_70163_u, playerIn.field_70161_v, SoundEvents.field_187604_bf, SoundCategory.NEUTRAL, 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));

					}

					return EnumActionResult.SUCCESS;
				}
			}

			pos = pos.func_177972_a(facing);
			double d0 = 0.0D;

			if (facing == EnumFacing.UP && iblockstate.func_177230_c() instanceof BlockFence) //Forge: Fix Vanilla bug comparing state instead of block
			{
				d0 = 0.5D;
			}

			Entity entity = spawnCreature(worldIn, func_185080_h(stack), (double)pos.func_177958_n() + 0.5D, (double)pos.func_177956_o() + d0, (double)pos.func_177952_p() + 0.5D);

			if (entity != null)
			{
				if (entity instanceof EntityLivingBase && stack.func_82837_s())
				{
					entity.func_96094_a(stack.func_82833_r());
				}

				applyItemEntityDataToEntity(worldIn, playerIn, stack, entity);

				if (!playerIn.field_71075_bZ.field_75098_d)
				{
					--stack.field_77994_a;
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
		MinecraftServer minecraftserver = entityWorld.func_73046_m();

		if (minecraftserver != null && targetEntity != null)
		{
			NBTTagCompound nbttagcompound = stack.func_77978_p();

			if (nbttagcompound != null && nbttagcompound.func_150297_b("EntityTag", 10))
			{
				if (!entityWorld.field_72995_K && targetEntity.func_184213_bq() && (player == null || !minecraftserver.func_184103_al().func_152596_g(player.func_146103_bH())))
				{
					return;
				}

				NBTTagCompound nbttagcompound1 = targetEntity.func_189511_e(new NBTTagCompound());
				UUID uuid = targetEntity.func_110124_au();
				nbttagcompound1.func_179237_a(nbttagcompound.func_74775_l("EntityTag"));
				targetEntity.func_184221_a(uuid);
				targetEntity.func_70020_e(nbttagcompound1);
			}
		}
	}

	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	{
		if (worldIn.field_72995_K)
		{
			return new ActionResult(EnumActionResult.PASS, itemStackIn);
		}
		else
		{
			RayTraceResult raytraceresult = this.func_77621_a(worldIn, playerIn, true);

			if (raytraceresult != null && raytraceresult.field_72313_a == RayTraceResult.Type.BLOCK)
			{
				BlockPos blockpos = raytraceresult.func_178782_a();

				if (!(worldIn.func_180495_p(blockpos).func_177230_c() instanceof BlockLiquid))
				{
					return new ActionResult(EnumActionResult.PASS, itemStackIn);
				}
				else if (worldIn.func_175660_a(playerIn, blockpos) && playerIn.func_175151_a(blockpos, raytraceresult.field_178784_b, itemStackIn))
				{
					Entity entity = spawnCreature(worldIn, func_185080_h(itemStackIn), (double)blockpos.func_177958_n() + 0.5D, (double)blockpos.func_177956_o() + 0.5D, (double)blockpos.func_177952_p() + 0.5D);

					if (entity == null)
					{
						return new ActionResult(EnumActionResult.PASS, itemStackIn);
					}
					else
					{
						if (entity instanceof EntityLivingBase && itemStackIn.func_82837_s())
						{
							entity.func_96094_a(itemStackIn.func_82833_r());
						}

						applyItemEntityDataToEntity(worldIn, playerIn, itemStackIn, entity);

						if (!playerIn.field_71075_bZ.field_75098_d)
						{
							--itemStackIn.field_77994_a;
						}

						playerIn.func_71029_a(StatList.func_188057_b(this));
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
		if (entityID != null && EntityList.field_75627_a.containsKey(entityID))
		{
			Entity entity = null;

			for (int i = 0; i < 1; ++i)
			{
				entity = EntityList.func_188429_b(entityID, worldIn);

				if (entity instanceof EntityLivingBase)
				{
					EntityBluePuppy entityliving = (EntityBluePuppy)entity;
					entity.func_70012_b(x, y, z, MathHelper.func_76142_g(worldIn.field_73012_v.nextFloat() * 360.0F), 0.0F);
					entityliving.field_70759_as = entityliving.field_70177_z;
					entityliving.field_70761_aq = entityliving.field_70177_z;
					entityliving.func_180482_a(worldIn.func_175649_E(new BlockPos(entityliving)), (IEntityLivingData)null);
					worldIn.func_72838_d(entity);
					entityliving.func_70642_aH();
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
