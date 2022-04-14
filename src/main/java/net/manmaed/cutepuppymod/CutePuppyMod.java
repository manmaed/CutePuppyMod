package net.manmaed.cutepuppymod;


import net.manmaed.cutepuppymod.blocks.CPBlocks;
import net.manmaed.cutepuppymod.config.CPConfig;
import net.manmaed.cutepuppymod.entitys.*;
import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.manmaed.cutepuppymod.items.CPSpawnEggs;
import net.manmaed.cutepuppymod.items.CPWeapons;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Created by manmaed on 09/04/2021.
 */

@Mod(CutePuppyMod.MOD_ID)
public class CutePuppyMod {
    /*
    * TODO: PORT MOD to 1.18.2
    */

    /*
    *  TODO: Make Alex Puppy (LP)
    *  TODO: World Gen Puppys (MP)
    *  TODO: Blocks That spawn mobs (MP)
    */
    public static final String  MOD_ID = "cutepuppymod";
    public static final CreativeModeTab itemGroup = new CreativeModeTab(CutePuppyMod.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CPItems.TAB_ICON.get());
        }
    };

    public CutePuppyMod() {
        IEventBus event = FMLJavaModLoadingContext.get().getModEventBus();
        CPItems.ITEMS.register(event);
        CPPuppyDrops.ITEMS.register(event);
        CPSpawnEggs.ITEMS.register(event);
        CPWeapons.ITEMS.register(event);
        CPBlocks.BLOCKS.register(event);
        CPBlocks.ITEMS.register(event);
        CPEntityTypes.ENTITY_TYPES.register(event);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CPConfig.COMMON_CONFIG);
        event.addListener(this::AttributeCreation);
        event.addListener(CutePuppyModClient::doEntityRendering);
        event.addListener(CutePuppyModClient::registerLayerDefinitions);
        event.addListener(CutePuppyModClient::doClientStuff);
    }

    public void init(final  FMLCommonSetupEvent event) {

    }

    //TODO: FIX
    private void AttributeCreation(EntityAttributeCreationEvent event) {
        event.put(CPEntityTypes.RED.get(), EntityRed.createAttributes().build());
        event.put(CPEntityTypes.BLUE.get(), EntityBlue.createAttributes().build());
        event.put(CPEntityTypes.GREEN.get(), EntityGreen.createAttributes().build());
        event.put(CPEntityTypes.YELLOW.get(), EntityYellow.createAttributes().build());
        event.put(CPEntityTypes.PURPLE.get(), EntityPurple.createAttributes().build());
        event.put(CPEntityTypes.STEVE.get(), EntitySteve.createAttributes().build());
        event.put(CPEntityTypes.HEROBRINE.get(), EntityHerobrine.createAttributes().build());
        event.put(CPEntityTypes.ENDER.get(), EntityEnder.createAttributes().build());
        event.put(CPEntityTypes.BOSS.get(), EntityBoss.createAttributes().build());
        event.put(CPEntityTypes.SIX.get(), EntitySix.createAttributes().build());
        event.put(CPEntityTypes.ENDER_BOSS.get(), EntityEnderBoss.createAttributes().build());
    }
  /*  private static RegisterHandler registeryHandler;
    public static final ItemGroup itemGroup = new ItemGroup(Refs.id) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CPItems.tabicon);
        }
    };

    public CutePuppyMod() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(CutePuppyModClient::doClientStuff);
        registeryHandler = new RegisterHandler();
        CPEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CPConfig.COMMON_CONFIG);
        *//*ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CPConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CPConfig.SERVER_CONFIG);*//*
        *//*MinecraftForge.EVENT_BUS.addListener(this::serverLoad);*//*
        MinecraftForge.EVENT_BUS.addListener(this::onBiomeLoad);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static RegisterHandler getRegisteryHandler() {
        return registeryHandler;
    }

    private void init(final FMLCommonSetupEvent event) {
        // some preinit code;
        if (CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            LogHelper.info("Minecraft Changelog: - Herobrine Removed!");
        }
        DeferredWorkQueue.runLater(CPEntity::load);

        //World Gen
        *//*event.enqueueWork(WorldGenHandler::registerConfiguredFeatures);*//*
    }

    *//*@SubscribeEvent(priority = EventPriority.HIGHEST)*//*
    public void onBiomeLoad(BiomeLoadingEvent event) {
        if (!CPConfig.DISABLE_NATUARL_SPAWNS.get()) {
            if (event.getCategory() == Biome.Category.THEEND) {
                WorldGenMobs.withEndMobs(event);
            } else if (event.getCategory() == Biome.Category.NETHER) {
                WorldGenMobs.withNetherMobs(event);
            } else {
                if (event.getCategory() != Biome.Category.OCEAN || event.getCategory() != Biome.Category.RIVER || event.getCategory() != Biome.Category.MUSHROOM) {
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
