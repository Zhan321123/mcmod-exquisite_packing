package com.zhan.exquisite_packing.utils.block;

import com.zhan.exquisite_packing.utils.BlockUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class CauldronBlock extends Block {
    //    VoxelShape shape = Block.box(0, 0, 0, 16, 15, 16);
    public CauldronBlock() {
        super(new BlockUtil.Property(Material.METAL, MaterialColor.METAL)
                .strength(1.2f, 2.0f)
                .dynamicShape()
                .noOcclusion()
                .get());
    }

    public CauldronBlock(int light) {
        super(new BlockUtil.Property(Material.METAL, MaterialColor.METAL)
                .strength(1.2f, 2.0f)
                .dynamicShape()
                .noOcclusion()
                .light(light)
                .get());
    }
}
