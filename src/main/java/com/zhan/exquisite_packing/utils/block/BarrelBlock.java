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

public class BarrelBlock extends Block {
    VoxelShape shape = Block.box(0, 0, 0, 16, 15, 16);

    public BarrelBlock() {
        super(new BlockUtil.Property(Material.WOOD, MaterialColor.WOOD)
                .strength(1.0f, 1.8f)
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
