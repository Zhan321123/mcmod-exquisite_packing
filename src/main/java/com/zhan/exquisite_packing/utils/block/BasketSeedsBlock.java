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

public class BasketSeedsBlock extends Block {
    VoxelShape shape = Block.box(1, 0, 1, 15, 10, 15);

    public BasketSeedsBlock() {
        super(new BlockUtil.Property(Material.PLANT, MaterialColor.PLANT)
                .strength(0.8f, 1.6f)
                .noOcclusion()
                .dynamicShape()
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
