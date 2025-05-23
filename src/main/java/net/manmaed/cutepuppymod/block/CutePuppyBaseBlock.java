package net.manmaed.cutepuppymod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class CutePuppyBaseBlock extends Block {
    public CutePuppyBaseBlock(MapColor mapColor) {
        super(Properties.of().mapColor(mapColor).strength(3.0F, 5.0F).requiresCorrectToolForDrops());
    }
}
