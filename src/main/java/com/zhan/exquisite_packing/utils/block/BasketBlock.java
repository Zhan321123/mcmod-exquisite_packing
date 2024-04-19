package com.zhan.exquisite_packing.utils.block;

import com.zhan.exquisite_packing.utils.BlockUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;


public class BasketBlock extends Block {
//    VoxelShape shape = Block.box(0, 0, 0, 16, 15, 16);

    public BasketBlock() {
        super(new BlockUtil.Property(Material.PLANT, MaterialColor.WOOD)
                .strength(0.8f, 1.6f)
                .noOcclusion()
                .dynamicShape()
                .get());
    }

    public BasketBlock(int light) {
        super(new BlockUtil.Property(Material.PLANT, MaterialColor.WOOD)
                .strength(0.8f, 1.6f)
                .noOcclusion()
                .dynamicShape()
                .light(light)
                .get());
    }

//    @Override
//    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
//        return shape;
//    }
//
//    @Override
//    public VoxelShape getCollisionShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
//        return shape;
//    }
}