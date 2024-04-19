package com.zhan.exquisite_packing.registries;

import com.zhan.exquisite_packing.ExquisitePacking;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ExquisitePackingItems {

    public static final DeferredRegister<Item> modItems = DeferredRegister.create(ForgeRegistries.ITEMS,
            ExquisitePacking.MODID);

    public static final RegistryObject<Item> largeClayBall = registry("large_clay_ball");
    public static final RegistryObject<Item> bundleStick = registry("bundle_stick", 100 * 9);
    public static final RegistryObject<Item> bundleArrow = registry("bundle_arrow");
    public static final RegistryObject<Item> bundleSpectralArrow = registry("bundle_spectral_arrow");
    public static final RegistryObject<Item> stackSaddle = registry("stack_saddle");
    public static final RegistryObject<Item> bundleLead = registry("bundle_lead");
    public static final RegistryObject<Item> bundleNameTag = registry("bundle_name_tag");


    public static RegistryObject<Item> registry(String name) {
        return modItems.register(name, () -> new Item(new Item.Properties().tab(ExquisitePackingCreativeTab.modTab)));
    }

    public static RegistryObject<Item> registry(String name, int burnTime) {
        return modItems.register(name, () -> new Item(new Item.Properties().tab(ExquisitePackingCreativeTab.modTab)) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }

        });
    }

    public static RegistryObject<Item> registry(String name, boolean tooltip) {
        return modItems.register(name, () -> new Item(new Item.Properties().tab(ExquisitePackingCreativeTab.modTab)) {
            @Override
            public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> componentList, @NotNull TooltipFlag flag) {
                if (tooltip) {
                    componentList.add(new TranslatableComponent(I18n.get("item." + ExquisitePacking.MODID + "." + name + ".desc")));
                }
                super.appendHoverText(stack, level, componentList, flag);
            }

        });
    }

}
