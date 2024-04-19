package com.zhan.exquisite_packing;

import com.zhan.exquisite_packing.registries.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Registries {

    public static void init() {
        ExquisitePackingBlocks.modBlocks.register(FMLJavaModLoadingContext.get().getModEventBus());
        ExquisitePackingItems.modItems.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
