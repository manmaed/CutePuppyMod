package net.manmaed.cutepuppymod;

import net.manmaed.cutepuppymod.blocks.CPBlocks;
import net.manmaed.cutepuppymod.config.CPConfig;
import net.manmaed.cutepuppymod.data.GenerateDataFiles;
import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.manmaed.cutepuppymod.items.CPSpawnEggs;
import net.manmaed.cutepuppymod.items.CPWeapons;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.libs.Reference;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 09/04/2021.
 */

@Mod(Reference.MOD_ID)
public class CutePuppyMod {
    /*
     * TODO: Items Blocks Entitys!
     */

    public static final CreativeModeTab itemGroup = new CreativeModeTab(Reference.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CPItems.TAB_ICON.get());
        }
    };

    public CutePuppyMod() {
        IEventBus modEventBusus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBusus.addListener(this::init);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CPConfig.COMMON_CONFIG);
        modEventBusus.addListener(GenerateDataFiles::makeDataFiles);

        //Item Deferred Registers
        CPItems.ITEMS.register(modEventBusus);
        CPPuppyDrops.ITEMS.register(modEventBusus);
        CPSpawnEggs.ITEMS.register(modEventBusus);
        CPWeapons.ITEMS.register(modEventBusus);

        //Block Deferred Registers
        CPBlocks.BLOCKS.register(modEventBusus);
    }

    /*FMLJavaModLoadingContext.get().getModEventBus().addListener(CutePuppyModClient::doClientStuff);
        CPEntityTypes.ENTITY_TYPES.register(modbus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CPConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CPConfig.SERVER_CONFIG);
        MinecraftForge.EVENT_BUS.addListener(this::serverLoad);
        MinecraftForge.EVENT_BUS.addListener(this::onBiomeLoad);
        MinecraftForge.EVENT_BUS.register(this);*/

    private void init(final FMLCommonSetupEvent event) {
        // some preinit code;
        if (CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            LogHelper.info("Minecraft Changelog: - Herobrine Removed!");
        }
        /*DeferredWorkQueue.runLater(CPEntity::load);*/
        /*event.enqueueWork(CPEntity::new);*/

        //World Gen
        /*event.enqueueWork(WorldGenHandler::registerConfiguredFeatures);*/
    }

    /*@SubscribeEvent(priority = EventPriority.HIGHEST)*/
    /*public void onBiomeLoad(BiomeLoadingEvent event) {
        if (!CPConfig.DISABLE_NATUARL_SPAWNS.get()) {
            if (event.getCategory() == Biome.BiomeCategory.THEEND) {
                WorldGenMobs.withEndMobs(event);
            } else if (event.getCategory() == Biome.BiomeCategory.NETHER) {
                WorldGenMobs.withNetherMobs(event);
            } else {
                if (event.getCategory() != Biome.BiomeCategory.OCEAN || event.getCategory() != Biome.BiomeCategory.RIVER || event.getCategory() != Biome.BiomeCategory.MUSHROOM) {
                    WorldGenMobs.withPassiveMobs(event);
                    WorldGenMobs.withHostileMobs(event);
                }
            }
        }
    }*/
    //Commands
    /*private void serverLoad(FMLServerStartingEvent event) {
        if (!CPConfig.RANDOM_SERVER_BOL.get()) {
        LogHelper.warn("So according to the server config, this isn't a server!?");
        } else {
            LogHelper.info("So according to the server config, this is a server! Wooo");
        }
    }*/
}
