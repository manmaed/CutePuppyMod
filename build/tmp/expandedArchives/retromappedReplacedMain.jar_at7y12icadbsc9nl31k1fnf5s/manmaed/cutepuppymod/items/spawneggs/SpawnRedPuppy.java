package manmaed.cutepuppymod.items.spawneggs;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.entity.EntityRedPuppy;
import manmaed.cutepuppymod.libs.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class SpawnRedPuppy extends Item {
	private static String name = "SpawnRedPuppy";
	public static String getName() {

		return name;
	}
	public SpawnRedPuppy(){
		super();
		func_77655_b(name);
		func_77637_a(CutePuppyMod.tabsCMP);

	}
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	{
		EntityRedPuppy entity = new EntityRedPuppy(worldIn);
				entity.func_70107_b(playerIn.func_70040_Z().field_72450_a, playerIn.func_70040_Z().field_72448_b + 1, playerIn.func_70040_Z().field_72449_c);
		LogHelper.info(playerIn.func_70040_Z().field_72450_a +" "+ playerIn.func_70040_Z().field_72448_b +" " + playerIn.func_70040_Z().field_72449_c);
		worldIn.func_72838_d(entity);
		LogHelper.info("1");
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	/*public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
	{
		EntityRedPuppy entity = new EntityRedPuppy(world);
		world.spawnEntityInWorld(entity);
		System.out.println("True");
		return  itemstack;


	}

	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet)
	{

			if (!world.isRemote)
			{
				EntityRedPuppy ent = new EntityRedPuppy(world); //change to whatever entity you're trying to spawn
				ent.setLocationAndAngles(x, y + 1, z, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
				//ent.initCreature();
				world.spawnEntityInWorld(ent);
				item.stackSize--;
			}
		return true;
	}*/
}
