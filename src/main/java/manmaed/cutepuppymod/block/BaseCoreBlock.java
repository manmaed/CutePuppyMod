package manmaed.cutepuppymod.block;

import manmaed.cutepuppymod.CutePuppyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by manmaed on 14/04/2018.
 */
public class BaseCoreBlock extends Block {
    public BaseCoreBlock() {
        super(Material.ROCK);
        setCreativeTab(CutePuppyMod.tabsCMP);
        setHarvestLevel("pickaxe", 2);
        setHardness(3.0F);
        setResistance(5.0F);
    }
}