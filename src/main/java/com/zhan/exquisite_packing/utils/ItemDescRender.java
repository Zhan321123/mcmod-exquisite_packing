package com.zhan.exquisite_packing.utils;

import com.zhan.exquisite_packing.registries.ExquisitePackingBlocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemDescRender {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void changeItemDescRender(RenderTooltipEvent.Color color) {
        Item item = color.getItemStack().getItem();
        if (item == ExquisitePackingBlocks.pileWitherSkeletonSkull.get().asItem()) {
            color.setBackground(0xf0ABABAB);
            color.setBorderStart(0xf08c8c8c);
            color.setBorderEnd(0xf05e5e5e);

        }
    }

}
