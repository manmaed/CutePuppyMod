package net.manmaed.cutepuppymod.tag;

import net.manmaed.cutepuppymod.libs.RLHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CutePuppyTags {

    public static class ItemTag {
        public static final TagKey<Item> CORES = createItemTag("cores");
    }

    public static class BlockTag {
        public static final TagKey<Block> INCORRECT_FOR_RED_CORES = createBlockTag("incorrect_for_red_cores");
        public static final TagKey<Block> INCORRECT_FOR_BLUE_CORES = createBlockTag("incorrect_for_blue_cores");
        public static final TagKey<Block> INCORRECT_FOR_YELLOW_CORES = createBlockTag("incorrect_for_yellow_cores");
        public static final TagKey<Block> INCORRECT_FOR_PURPLE_CORES = createBlockTag("incorrect_for_purple_cores");
        public static final TagKey<Block> INCORRECT_FOR_GREEN_CORES = createBlockTag("incorrect_for_green_cores");
    }

    private static TagKey<Block> createBlockTag(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), RLHelper.location(name));
    }

    private static TagKey<Item> createItemTag(String name) {
        return TagKey.create(BuiltInRegistries.ITEM.key(), RLHelper.location(name));
    }
}
