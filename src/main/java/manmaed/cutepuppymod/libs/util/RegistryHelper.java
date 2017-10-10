package manmaed.cutepuppymod.libs.util;

import manmaed.cutepuppymod.libs.util.events.EventRegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;

public class RegistryHelper {

	private final ArrayList<Block> blocks = new ArrayList<>();
	private final ArrayList<Item> items = new ArrayList<>();
	private final ArrayList<Entity> entitys = new ArrayList<>();

	private final EventRegisterHelper eventRegisterHelper;

	public RegistryHelper(FMLPreInitializationEvent event)
	{
		this.eventRegisterHelper = new EventRegisterHelper(event);

	}

	public ArrayList<Block> getRegisteredBlocks()

	{
		return blocks;
	}

	public void registerBlock(Block block)
	{
		blocks.add(block);
	}
	public ArrayList<Item> getRegisteredItems()
	{
		return items;
	}
	public void registerItem(Item item)
	{
		this.items.add(item);
	}
}
