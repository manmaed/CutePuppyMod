package manmaed.cutepuppymod.items.spawneggs;

import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.entity.EntityYellowPuppy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SpawnYellowPuppy extends Item {
	private static String name = "SpawnYellowPuppy";
	public static String getName() {

		return name;
	}
	public SpawnYellowPuppy(){
		super();
		setUnlocalizedName(name);
		setCreativeTab(CutePuppyMod.tabsCMP);
	}
/*	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
            EntityHazardPuppy par1EntityHazardPuppy = new EntityHazardPuppy(world);
            world.spawnEntityInWorld(par1EntityHazardPuppy);
            System.out.println("True");
            return  itemstack;
         
            
    }
	*/
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet)
	{
	
			if (!world.isRemote)
			{
				EntityYellowPuppy ent = new EntityYellowPuppy(world); //change to whatever entity you're trying to spawn
				ent.setLocationAndAngles(x, y + 1, z, MathHelper.wrapDegrees(world.rand.nextFloat() * 360.0F), 0.0F);
				//ent.initCreature();
				world.spawnEntityInWorld(ent);
				item.stackSize--;
			}
		return true;
	}
}
