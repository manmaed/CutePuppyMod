package net.manmaed.cutepuppymod.datagen;

import net.manmaed.cutepuppymod.block.CutePuppyBlocks;
import net.manmaed.cutepuppymod.entity.CutePuppyEntityTypes;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.advancements.*;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class CutePuppyAdvancementProvider extends AdvancementProvider {
    public CutePuppyAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookup, ExistingFileHelper existingFileHelper) {
        super(output, lookup, existingFileHelper, List.of(new CutePuppyAdvancementGenerator()));
    }

    public static class CutePuppyAdvancementGenerator implements AdvancementGenerator {

        @Override
        public void generate(HolderLookup.Provider registries, Consumer<AdvancementHolder> saver, ExistingFileHelper existingFileHelper) {

            //Root Advancement
            AdvancementHolder root = Advancement.Builder.advancement()
                    .display(makeRootInfo(CutePuppyItems.TAB_ICON.get(), "stone", true))
                    .addCriterion("iron_tools", inventoryChangedTrigger(Items.IRON_PICKAXE))
                    .save(saver, getSaveLoc("root"));

            //Kill a Puppy
            AdvancementHolder kill_puppy = Advancement.Builder.advancement()
                    .display(info(Items.IRON_SWORD, "kill_puppy", AdvancementType.TASK, true, true, false))
                    .parent(root)
                    .addCriterion("puppy", killEntityTrigger(CutePuppyEntityTypes.PUPPY.get()))
                    .addCriterion("human_puppy", killEntityTrigger(CutePuppyEntityTypes.HUMAN_PUPPY.get()))
                    .requirements(AdvancementRequirements.Strategy.OR)
                    .save(saver, getSaveLoc("kill_puppy"));

            //Core Of Core Blocks
            AdvancementHolder craft_core_of_cores = Advancement.Builder.advancement()
                    .display(info(CutePuppyBlocks.THE_CORE_BLOCK.asItem(), "craft_core_of_cores", AdvancementType.TASK, true, true, false))
                    .parent(kill_puppy)
                    .addCriterion("craft_core_of_cores", inventoryChangedTrigger(CutePuppyBlocks.THE_CORE_BLOCK.asItem()))
                    .save(saver, getSaveLoc("craft_core_of_cores"));

            //Summon The Boss
            AdvancementHolder summon_boss_puppy = Advancement.Builder.advancement()
                    .display(info(CutePuppyBlocks.THE_CORE_BLOCK.asItem(), "summon_boss_puppy", AdvancementType.GOAL, true, true,true))
                    .parent(craft_core_of_cores)
                    .addCriterion("summon_boss_puppy", summonEntity(CutePuppyEntityTypes.BOSS.get()))
                    .save(saver, getSaveLoc("summon_boss_puppy"));

            //Kill The Boss
            AdvancementHolder kill_boss_puppy = Advancement.Builder.advancement()
                    .display(info(CutePuppyBlocks.THE_CORE_BLOCK.asItem(), "kill_boss_puppy", AdvancementType.CHALLENGE, true, true,true))
                    .parent(summon_boss_puppy)
                    .addCriterion("kill_boss_puppy", killEntityTrigger(CutePuppyEntityTypes.BOSS.get()))
                    .save(saver, getSaveLoc("kill_boss_puppy"));

            //Kill Herobrine
            AdvancementHolder kill_herobrine = Advancement.Builder.advancement()
                    .display(info(Items.BARRIER, "kill_herobrine", AdvancementType.TASK, true, true, false))
                    .parent(kill_puppy)
                    .addCriterion("kill_herobrine", killEntityTrigger(CutePuppyEntityTypes.HEROBRINE.get()))
                    .save(saver, getSaveLoc("kill_herobrine"));


            //Kill Ender Puppy
            AdvancementHolder kill_ender_puppy = Advancement.Builder.advancement()
                    .display(info(Items.ENDER_PEARL, "kill_ender_puppy", AdvancementType.TASK, true, true, false))
                    .parent(kill_puppy)
                    .addCriterion("kill_ender_puppy", killEntityTrigger(CutePuppyEntityTypes.ENDER.get()))
                    .save(saver, getSaveLoc("kill_ender_puppy"));

            //Kill Ender Boss
            AdvancementHolder kill_ender_boss_puppy = Advancement.Builder.advancement()
                    .display(info(Items.ENDER_PEARL, "kill_ender_boss_puppy", AdvancementType.TASK, true, true, false))
                    .parent(kill_ender_puppy)
                    .addCriterion("kill_ender_boss_puppy", killEntityTrigger(CutePuppyEntityTypes.ENDER_BOSS.get()))
                    .save(saver, getSaveLoc("kill_ender_boss_puppy"));

            //Kill Six
            AdvancementHolder kill_six = Advancement.Builder.advancement()
                    .display(info(CutePuppyItems.BAN_HAMMER.get(), "kill_six_puppy", AdvancementType.TASK, true, true, false))
                    .parent(kill_puppy)
                    .addCriterion("kill_six_puppy", killEntityTrigger(CutePuppyEntityTypes.SIX.get()))
                    .save(saver, getSaveLoc("kill_six_puppy"));
        }

        protected static DisplayInfo makeRootInfo(Item icon, String blockToDisplay, Boolean isMineCraft) {
            return new DisplayInfo(new ItemStack(icon),
                    Component.translatable(title("root")),
                    Component.translatable(desc("root")),
                    Optional.of(getBackground(isMineCraft, blockToDisplay)),
                    AdvancementType.TASK, false ,false ,false);
        }

        protected static DisplayInfo info(Item icon, String advancemntName, AdvancementType advancementType, Boolean showToast, Boolean announceChat, Boolean shouldBeHidden) {
            return new DisplayInfo(new ItemStack(icon),
                    Component.translatable(title(advancemntName)),
                    Component.translatable(desc(advancemntName)),
                    Optional.empty(),
                    advancementType, showToast ,announceChat ,shouldBeHidden);
        }

        protected static Criterion<InventoryChangeTrigger.TriggerInstance> inventoryChangedTrigger(Item item) {
            return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(item).build());
        }

        protected static Criterion<KilledTrigger.TriggerInstance> killEntityTrigger(EntityType entity) {
            return KilledTrigger.TriggerInstance.playerKilledEntity(EntityPredicate.Builder.entity().of(entity));
        }

        protected static Criterion<SummonedEntityTrigger.TriggerInstance> summonEntity(EntityType entity) {
            return SummonedEntityTrigger.TriggerInstance.summonedEntity(EntityPredicate.Builder.entity().of(entity));
        }


        private static String getSaveLoc(String saveLoc) {
            return RLHelper.location(saveLoc).toString();
        }
        private static String title(String name) {
            return "advancements.cutepuppymod." + name + ".title";
        }
        private static String desc(String name) {
            return "advancements.cutepuppymod." + name + ".description";
        }

        private static ResourceLocation getBackground(Boolean isMCBackground, String backgroundName) {
            if (isMCBackground) {
                return ResourceLocation.withDefaultNamespace("textures/block/" + backgroundName + ".png");
            }
            return RLHelper.location("textures/block/" + backgroundName + ".png");
        }
    }
}
