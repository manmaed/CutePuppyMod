package net.manmaed.cutepuppymod.tab;

import net.manmaed.cutepuppymod.CutePuppyMod;
import net.manmaed.cutepuppymod.item.CutePuppyItems;
import net.manmaed.cutepuppymod.item.CutePuppySpawnEggs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Arrays;
import java.util.List;

public class CutePuppyTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CutePuppyMod.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUTEPUPPY_TAB = CREATIVE_TABS.register(CutePuppyMod.MOD_ID, () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(CutePuppyItems.TAB_ICON.get()))
            .title(Component.translatable("itemGroup." + CutePuppyMod.MOD_ID ))
            .displayItems((parameters, output) -> {
                List<DeferredRegister<Item>> myItems = Arrays.asList(
                        CutePuppyItems.ITEMS
                );
                for (DeferredRegister<Item> register: myItems) {
                    register.getEntries().forEach(entry -> output.accept(entry.get()));
                }
            })
            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CUTEPUPPY_SPAWNEGG_TAB = CREATIVE_TABS.register(CutePuppyMod.MOD_ID + "_spawn_eggs", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(CutePuppySpawnEggs.GREEN_SPAWN_EGG.get()))
            .title(Component.translatable("itemGroup." + CutePuppyMod.MOD_ID + ".spawn_eggs" ))
            .displayItems((parameters, output) -> {
                List<DeferredRegister<Item>> myItems = Arrays.asList(
                        CutePuppySpawnEggs.ITEMS
                );
                for (DeferredRegister<Item> register: myItems) {
                    register.getEntries().forEach(entry -> output.accept(entry.get()));
                }
                output.accept(CutePuppyItems.ENDER_SPAWN_EGG);
                output.accept(CutePuppyItems.HEROBRINE_SPAWN_EGG);
                output.accept(CutePuppyItems.PUPPY_SPAWN_EGG);
                output.accept(CutePuppyItems.HUMAN_PUPPY_SPAWN_EGG);
            })
            .build());

}
