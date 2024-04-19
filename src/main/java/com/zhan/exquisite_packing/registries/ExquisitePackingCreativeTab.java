package com.zhan.exquisite_packing.registries;

import com.zhan.exquisite_packing.ExquisitePacking;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ExquisitePackingCreativeTab {

    public static final CreativeModeTab modTab = new CreativeModeTab(ExquisitePacking.MODID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ExquisitePackingBlocks.pileWitherSkeletonSkull.get());
        }
    };
}
