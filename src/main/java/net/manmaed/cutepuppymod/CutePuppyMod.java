package net.manmaed.cutepuppymod;


import net.manmaed.cutepuppymod.blocks.CPBlocks;
import net.manmaed.cutepuppymod.config.CPConfig;
import net.manmaed.cutepuppymod.entitys.*;
import net.manmaed.cutepuppymod.items.CPItems;
import net.manmaed.cutepuppymod.items.CPPuppyDrops;
import net.manmaed.cutepuppymod.items.CPSpawnEggs;
import net.manmaed.cutepuppymod.items.CPWeapons;
import net.manmaed.cutepuppymod.libs.LogHelper;
import net.manmaed.cutepuppymod.world.WorldGenMobs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
     *  TODO: Make Alex Puppy (LP)
     */
    public static final String MOD_ID = "cutepuppymod";
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
        MinecraftForge.EVENT_BUS.addListener(this::onBiomeLoad);
        event.addListener(this::init);
    }

    public void init(final FMLCommonSetupEvent event) {
        if (CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            LogHelper.info("Minecraft Changelog: - Herobrine Removed!");
        }
    }

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

    @SubscribeEvent
    public void onBiomeLoad(BiomeLoadingEvent event) {
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
    }
}
