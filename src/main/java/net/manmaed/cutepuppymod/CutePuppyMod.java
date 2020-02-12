package net.manmaed.cutepuppymod;

import net.manmaed.cutepuppymod.blocks.CPMBlocks;
import net.manmaed.cutepuppymod.entitys.CPMEntitys;
import net.manmaed.cutepuppymod.entitys.EntityRedPup;
import net.manmaed.cutepuppymod.items.CPMItems;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.ArrayList;

/**
 * Created by manmaed on 05/01/2020.
 */
@Mod(Reference.id)
public class CutePuppyMod {

    private static RegisteryHandler registeryHandler;
    public static final ItemGroup itemGroup = new ItemGroup(Reference.id) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CPMItems.itemfortab);
        }
    };

    public CutePuppyMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        registeryHandler = new RegisteryHandler();
        MinecraftForge.EVENT_BUS.addListener(this::serverLoad);
    }

    public static RegisteryHandler getRegisteryHandler() {
        return registeryHandler;
    }

    private void init(final FMLCommonSetupEvent event) {
        //Do things
    }

    private void doClientStuff(FMLClientSetupEvent event) {
        //Do Client Stuff
    }

    private void serverLoad(FMLServerStartingEvent event) {
        //Stuff for servers
    }

    public static class RegisteryHandler {
        private final ArrayList<Block> blocks = new ArrayList<>();
        private final ArrayList<Item> items = new ArrayList<>();
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

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> event) {
            event.getRegistry().register(EntityType.Builder.create(EntityRedPup::new, EntityClassification.AMBIENT).size(0.5F, 0.5F).build("red_puppy").setRegistryName("red_puppy"));
        }

        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            CPMBlocks.load();
            for (Block block : CutePuppyMod.getRegisteryHandler().getRegisteredBlocks()) {
                event.getRegistry().registerAll(block);
            }
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            CPMItems.load();
            for (Block block : CutePuppyMod.getRegisteryHandler().getRegisteredBlocks()) {
                event.getRegistry().register(new BlockItem(block, new Item.Properties().group(CutePuppyMod.itemGroup)).setRegistryName(block.getRegistryName()));
            }
            for (Item item : CutePuppyMod.getRegisteryHandler().getRegisteredItems()) {
                event.getRegistry().register(item);
            }
        }
    }
}
