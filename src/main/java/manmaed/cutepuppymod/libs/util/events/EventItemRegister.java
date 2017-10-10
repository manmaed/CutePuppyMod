package manmaed.cutepuppymod.libs.util.events;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventItemRegister
{
    public EventItemRegister()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        for (Block block : CutePuppyMod.getRegistryHelper().getRegisteredBlocks()) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
        for (Item item : CutePuppyMod.getRegistryHelper().getRegisteredItems()) {
            //LogHelper.info("Registering: " + item.getUnlocalizedName());
            event.getRegistry().register(item);
        }
    }
}