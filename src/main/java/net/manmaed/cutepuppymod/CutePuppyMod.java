package net.manmaed.cutepuppymod;


import net.manmaed.cutepuppymod.block.CutePuppyBlocks;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.manmaed.cutepuppymod.tab.CutePuppyTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

/**
 * Created by manmaed on 09/04/2021.
 */

@Mod(CutePuppyMod.MOD_ID)
public class CutePuppyMod {
    /*
     *  TODO: Make Alex Puppy (LP)
     */
    public static final String MOD_ID = "cutepuppymod";

    public CutePuppyMod(IEventBus event) {
        CutePuppyItems.ITEMS.register(event);
        CutePuppyBlocks.BLOCKS.register(event);
        CutePuppyTabs.CREATIVE_TABS.register(event);
    }

    /*public void init(final FMLCommonSetupEvent event) {
        if (CPConfig.DISABLE_HEROBRINE_SPAWN.get()) {
            LogHelper.info("Minecraft Changelog: - Herobrine Removed!");
        }
    }*/

    /*private void AttributeCreation(EntityAttributeCreationEvent event) {
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
    }*/

    /*@SubscribeEvent
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
    }*/
}
