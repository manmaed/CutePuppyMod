package manmaed.cutepuppymod.items.spawneggs;


import manmaed.cutepuppymod.CutePuppyMod;
import manmaed.cutepuppymod.entity.EntityStevePuppy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SpawnStevePuppy extends Item {
	private static String name = "SpawnStevePuppy";
	public static String getName() {

		return name;
	}
	public SpawnStevePuppy(){
		super();
		func_77655_b(name);
		func_77637_a(CutePuppyMod.tabsCMP);
	}
/*	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
            EntityKikiPuppy par1EntityKikiPuppy = new EntityKikiPuppy(world);
            world.spawnEntityInWorld(par1EntityKikiPuppy);
            System.out.println("True");
            return  itemstack;
         
            
    }
	*/
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float xOffset, float yOffset, float zOffSet)
	{
	
			if (!world.field_72995_K)
			{
				EntityStevePuppy ent = new EntityStevePuppy(world); //change to whatever entity you're trying to spawn
				ent.func_70012_b(x, y + 1, z, MathHelper.func_76142_g(world.field_73012_v.nextFloat() * 360.0F), 0.0F);
				//ent.initCreature();
				world.func_72838_d(ent);
				item.field_77994_a--;
			}
		return true;
	}
}
