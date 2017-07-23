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
        //LogHelper.info("Starting ItemBlock registering for " + Reference.MOD_ID + "...");
        for (Block block : CutePuppyMod.getRegistryHelper().getRegisteredBlocks()) {
            //LogHelper.debug("Registering ItemBlock... " + block.getUnlocalizedName());
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
        //LogHelper.info("Finished ItemBlock registering for " + Reference.MOD_ID);
        for (Item item : CutePuppyMod.getRegistryHelper().getRegisteredItems()) {
            //event.getRegistry().register(new Item().setRegistryName(item.getRegistryName()));
            event.getRegistry().register(item);
        }
    }
}