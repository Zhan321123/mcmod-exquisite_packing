package com.zhan.exquisite_packing.utils.block;

import com.zhan.exquisite_packing.utils.BlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PotBlock extends Block {
    VoxelShape shape = Block.box(2, 0, 2, 14, 10, 14);
    ;

    public PotBlock() {
        super(new BlockUtil.Property(Material.HEAVY_METAL, MaterialColor.METAL)
                .strength(0.8f, 1.6f)
                .dynamicShape()
                .noOcclusion()
                .get());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return shape;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return shape;
    }
}
