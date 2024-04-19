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

public class CartonBlock extends Block {
    VoxelShape shape = Block.box(0, 0, 0, 16, 15, 16);

    public CartonBlock(Material material) {
        super(new BlockUtil.Property(material, MaterialColor.COLOR_ORANGE)
                .strength(0.8f, 1.6f)
                .dynamicShape()
                .noOcclusion()
                .get());
    }

    public CartonBlock(Material material, int light) {
        super(new BlockUtil.Property(material, MaterialColor.COLOR_ORANGE)
                .strength(0.8f, 1.6f)
                .dynamicShape()
                .noOcclusion()
                .light(light)
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
