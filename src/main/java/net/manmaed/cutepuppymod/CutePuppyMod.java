package net.manmaed.cutepuppymod;


import net.manmaed.cutepuppymod.block.CutePuppyBlocks;
import net.manmaed.cutepuppymod.entity.*;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.manmaed.cutepuppymod.item.CutePuppySpawnEggs;
import net.manmaed.cutepuppymod.tab.CutePuppyTabs;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;

/**
 * Created by manmaed on 09/04/2021.
 */

@Mod(CutePuppyMod.MOD_ID)
public class CutePuppyMod {
    public static final String MOD_ID = "cutepuppymod";

    public CutePuppyMod(IEventBus event) {
        CutePuppyItems.ITEMS.register(event);
        CutePuppySpawnEggs.ITEMS.register(event);
        CutePuppyBlocks.BLOCKS.register(event);
        CutePuppyEntityTypes.ENTITY_TYPES.register(event);
        CutePuppyTabs.CREATIVE_TABS.register(event);
        event.addListener(this::AttributeCreation);
        event.addListener(CutePuppyModClient::doEntityRendering);
        event.addListener(CutePuppyModClient::registerLayerDefinitions);
        event.addListener(this::registerSpawnPlacements);
    }

    private void AttributeCreation(EntityAttributeCreationEvent event) {
        event.put(CutePuppyEntityTypes.PUPPY.get(), PuppyEntity.createAttributes().build());
        event.put(CutePuppyEntityTypes.HEROBRINE.get(), HerobrinePuppyEntity.createAttributes().build());
        event.put(CutePuppyEntityTypes.HUMAN_PUPPY.get(), HumanPuppyEntity.createAttributes().build());
        event.put(CutePuppyEntityTypes.ENDER.get(), EnderPuppyEntity.createAttributes().build());
        event.put(CutePuppyEntityTypes.SIX.get(), SixEntity.createAttributes().build());
        event.put(CutePuppyEntityTypes.ENDER_BOSS.get(), EnderBossEntity.createAttributes().build());
        event.put(CutePuppyEntityTypes.BOSS.get(), BossEntity.createAttributes().build());
    }

    /*public void init(final FMLCommonSetupEvent event) {
        if (CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            LogHelper.info("Minecraft Changelog: - Herobrine Removed!");
        }
    }*/

    public void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(CutePuppyEntityTypes.PUPPY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(CutePuppyEntityTypes.HUMAN_PUPPY.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(CutePuppyEntityTypes.HEROBRINE.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(CutePuppyEntityTypes.SIX.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMobSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(CutePuppyEntityTypes.ENDER.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMobSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }
}
