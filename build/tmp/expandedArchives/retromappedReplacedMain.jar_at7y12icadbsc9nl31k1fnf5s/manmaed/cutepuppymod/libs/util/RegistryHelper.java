package manmaed.cutepuppymod.libs.util;

import manmaed.cutepuppymod.libs.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RegistryHelper {

	public static void RegisterBlock (Block block, String name, String oreDictionaryName)
	{
		block.setRegistryName(name);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block), block.getRegistryName());
		OreDictionary.registerOre(oreDictionaryName, new ItemStack(block, 1, 0));
	}

	public static void RegisterBlock (Block block, String name)
	{
		block.setRegistryName(name);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block), block.getRegistryName());
	}

	public static void RegisterItem (Item item, String name) {

		item.setRegistryName(name);
		GameRegistry.register(item);
	}
	public static void RegisterItem (Item item, String name, String oreDictionaryName) {

		item.setRegistryName(name);
		GameRegistry.register(item);
		OreDictionary.registerOre(oreDictionaryName, new ItemStack(item, 1, 0));
	}

	public static void RenderItem(Item item, String name)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
	}
	public static void RenderBlock(Block block, String name)
	{
		ModelLoader.setCustomModelResourceLocation(Item.func_150898_a(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + name));
	}

	//Old Way
	/*public static void registerItem(Item item) {
		GameRegistry.registerItem(item, Reference.MOD_ID + "_"
				+ item.getUnlocalizedName().substring(5));
	}

	public static void registerBlock(Block block) {
		GameRegistry.registerBlock(block, Reference.MOD_ID + "_"
				+ block.getUnlocalizedName().substring(5));
	}*/
}
