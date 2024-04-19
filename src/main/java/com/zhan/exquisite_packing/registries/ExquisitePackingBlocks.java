package com.zhan.exquisite_packing.registries;

import com.zhan.exquisite_packing.ExquisitePacking;
import com.zhan.exquisite_packing.utils.*;
import com.zhan.exquisite_packing.utils.block.*;
import com.zhan.exquisite_packing.utils.item.ChainPlantItem;
import com.zhan.exquisite_packing.utils.item.ChainSowItem;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

import static com.zhan.exquisite_packing.registries.ExquisitePackingCreativeTab.modTab;
import static com.zhan.exquisite_packing.registries.ExquisitePackingItems.modItems;

public class ExquisitePackingBlocks {

    public static final DeferredRegister<Block> modBlocks = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ExquisitePacking.MODID);

    //cube block
    public static final RegistryObject<Block> cactusBlock = registry("cactus_block", () -> new Block(new BlockUtil.Property(Material.BAMBOO, MaterialColor.COLOR_GREEN).strength(0.8f, 1.6f).get()));
    public static final RegistryObject<Block> bonesBlock = registry("bones_block", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.TERRACOTTA_WHITE).strength(1.2f, 2.0f).get()));
    public static final RegistryObject<Block> totemBlock = registry("totem_block", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.COLOR_ORANGE).strength(1.0f, 1.8f).get()));
    public static final RegistryObject<Block> sugarCaneBlock = registry("sugar_cane_block", () -> new Block(new BlockUtil.Property(Material.BAMBOO, MaterialColor.COLOR_GREEN).strength(0.8f, 1.6f).get()));
    public static final RegistryObject<Block> amethystShardBlock = registry("amethyst_shard_block", () -> new Block(new BlockUtil.Property(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.2f, 2.0f).get()));
    public static final RegistryObject<Block> charcoal_block = registry("charcoal_block", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.COLOR_BLACK).strength(1.2f, 2.0f).get()), true, 1600 * 8);
    public static final RegistryObject<Block> bricksBlock = registry("bricks_block", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.COLOR_ORANGE).strength(1.2f, 2.0f).get()));
    public static final RegistryObject<Block> leatherBlock = registry("leather_block", () -> new Block(new BlockUtil.Property(Material.WOOL, MaterialColor.COLOR_ORANGE).strength(0.8f, 1.6f).get()));
    public static final RegistryObject<Block> basketCropGoldenApple = registry("basket_crop_golden_apple", () -> new Block(new BlockUtil.Property(Material.METAL, MaterialColor.GOLD).strength(1.6f, 3.0f).get()));
    public static final RegistryObject<Block> goldenMelonBlock = registry("golden_melon_block", () -> new Block(new BlockUtil.Property(Material.METAL, MaterialColor.GOLD).strength(1.3f, 2.4f).get()));
    public static final RegistryObject<Block> rabbitHideBlock = registry("rabbit_hide_block", () -> new Block(new BlockUtil.Property(Material.WOOL, MaterialColor.SAND).strength(0.7f, 1.3f).get()));
    public static final RegistryObject<Block> netherBrickBlock = registry("nether_brick_block", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.STONE).strength(1.2f, 2.0f).get()));
    public static final RegistryObject<Block> seaPickleBlock = registry("sea_pickle_block", () -> new Block(new BlockUtil.Property(Material.BAMBOO, MaterialColor.PLANT).strength(0.8f, 1.6f).light(8).get()));
    public static final RegistryObject<Block> blazeRodBlock = registry("blaze_rod_block", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.FIRE).strength(0.8f, 1.6f).light(8).get()));
    public static final RegistryObject<Block> bambooBlock = registry("bamboo_block", () -> new Block(new BlockUtil.Property(Material.BAMBOO, MaterialColor.PLANT).strength(0.8f, 1.6f).get()));

    public static final RegistryObject<Block> sackGlowInkSac = registry("sack_glow_ink_sac", () -> new SackBlock(8));
    public static final RegistryObject<Block> sackSugar = registry("sack_sugar", SackBlock::new);
    public static final RegistryObject<Block> sackCocoaBeans = registry("sack_cocoa_beans", SackBlock::new);
    public static final RegistryObject<Block> sackGunpowder = registry("sack_gunpowder", SackBlock::new);
    public static final RegistryObject<Block> sackNetherWart = registry("sack_nether_wart", SackBlock::new, true);
    public static final RegistryObject<Block> sackFeather = registry("sack_feather", SackBlock::new);
    public static final RegistryObject<Block> sackFlint = registry("sack_flint", SackBlock::new);
    public static final RegistryObject<Block> sackPhantomMembrane = registry("sack_phantom_membrane", SackBlock::new);
    public static final RegistryObject<Block> sackInkSac = registry("sack_ink_sac", SackBlock::new);
    public static final RegistryObject<Block> sackSpiderEye = registry("sack_spider_eye", SackBlock::new);
    public static final RegistryObject<Block> sackMagmaCream = registry("sack_magma_cream", SackBlock::new);
    public static final RegistryObject<Block> sackRabbitFoot = registry("sack_rabbit_foot", SackBlock::new);
    public static final RegistryObject<Block> sackScute = registry("sack_scute", SackBlock::new);
    public static final RegistryObject<Block> sackFermentedSpiderEye = registry("sack_fermented_spider_eye", SackBlock::new);
    public static final RegistryObject<Block> sackEnderPearl = registry("sack_ender_pearl", () -> new SackBlock(6));
    public static final RegistryObject<Block> sackBlazePowder = registry("sack_blaze_powder", () -> new SackBlock(4));
    public static final RegistryObject<Block> sackGlowstoneDust = registry("sack_glowstone_dust", () -> new SackBlock(14));
    public static final RegistryObject<Block> sackEnderEye = registry("sack_ender_eye", () -> new SackBlock(8));

    public static final RegistryObject<Block> basketPointedDripstone = registry("basket_pointed_dripstone", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.STONE).strength(1.5f, 2.8f).get()));
    public static final RegistryObject<Block> basketCropApple = registry("basket_crop_apple", BasketBlock::new);
    public static final RegistryObject<Block> basketCropBeetroot = registry("basket_crop_beetroot", BasketBlock::new);
    public static final RegistryObject<Block> basketCropBerry = registry("basket_crop_berry", BasketBlock::new);
    public static final RegistryObject<Block> basketCropChorusFruit = registry("basket_crop_chorus_fruit", BasketBlock::new);
    public static final RegistryObject<Block> blockRegistryObject = registry("basket_wither_rose", BasketBlock::new);
    public static final RegistryObject<Block> basketPoisonousPotato = registry("basket_poisonous_potato", BasketBlock::new);
    public static final RegistryObject<Block> basketHoneycomb = registry("basket_honeycomb", BasketBlock::new);
    public static final RegistryObject<Block> basketKelp = registry("basket_kelp", BasketBlock::new);
    public static final RegistryObject<Block> basketLilyPad = registry("basket_lily_pad", BasketBlock::new);
    public static final RegistryObject<Block> basketGoldenCarrot = registry("basket_golden_carrot", () -> new Block(new BlockUtil.Property(Material.METAL, MaterialColor.COLOR_ORANGE).strength(1.2f, 2.0f).get()));
    public static final RegistryObject<Block> basketCropGlowberry = registry("basket_crop_glowberry", () -> new BasketBlock(10));
    public static final RegistryObject<Block> basketNautilusShell = registry("basket_nautilus_shell", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.STONE).strength(1.2f, 2.0f).get()));
    public static final RegistryObject<Block> basketShulkerShell = registry("basket_shulker_shell", () -> new Block(new BlockUtil.Property(Material.STONE, MaterialColor.STONE).strength(1.2f, 2.0f).get()));

    public static final RegistryObject<Block> basketCropCarrot = registry("basket_crop_carrot", BasketBlock::new, 0, Blocks.CARROTS);
    public static final RegistryObject<Block> basketCropPotato = registry("basket_crop_potato", BasketBlock::new, 0, Blocks.POTATOES);

    public static final RegistryObject<Block> basketSeedsBeetroot = registry("basket_seeds_beetroot", BasketSeedsBlock::new, 0, Blocks.BEETROOTS);
    public static final RegistryObject<Block> basketSeedsPumpkin = registry("basket_seeds_pumpkin", BasketSeedsBlock::new, 0, Blocks.PUMPKIN_STEM);
    public static final RegistryObject<Block> basketSeedsMelon = registry("basket_seeds_melon", BasketSeedsBlock::new, 0, Blocks.MELON_STEM);
    public static final RegistryObject<Block> basketSeedsWheat = registry("basket_seeds_wheat", BasketSeedsBlock::new, 0, Blocks.WHEAT);

    public static final RegistryObject<Block> basketOakSapling = registry("basket_oak_sapling", BasketSeedsBlock::new, 1, Blocks.OAK_SAPLING);
    public static final RegistryObject<Block> basketSpruceSapling = registry("basket_spruce_sapling", BasketSeedsBlock::new, 1, Blocks.SPRUCE_SAPLING);
    public static final RegistryObject<Block> basketBirchSapling = registry("basket_birch_sapling", BasketSeedsBlock::new, 1, Blocks.BIRCH_SAPLING);
    public static final RegistryObject<Block> basketJungleSapling = registry("basket_jungle_sapling", BasketSeedsBlock::new, 1, Blocks.JUNGLE_SAPLING);
    public static final RegistryObject<Block> basketAcaciaSapling = registry("basket_acacia_sapling", BasketSeedsBlock::new, 1, Blocks.ACACIA_SAPLING);
    public static final RegistryObject<Block> basketDarkOakSapling = registry("basket_dark_oak_sapling", BasketSeedsBlock::new, 1, Blocks.DARK_OAK_SAPLING);

    public static final RegistryObject<Block> barrelCod = registry("barrel_cod", BarrelBlock::new);
    public static final RegistryObject<Block> barrelSalmon = registry("barrel_salmon", BarrelBlock::new);
    public static final RegistryObject<Block> barrelPufferfish = registry("barrel_pufferfish", BarrelBlock::new);
    public static final RegistryObject<Block> barrelTropicalFish = registry("barrel_tropical_fish", BarrelBlock::new);

    public static final RegistryObject<Block> potCookedCod = registry("pot_cooked_cod", PotBlock::new);
    public static final RegistryObject<Block> potCookedSalmon = registry("pot_cooked_salmon", PotBlock::new);
    public static final RegistryObject<Block> potPoppedChorusFruit = registry("pot_popped_chorus_fruit", PotBlock::new);
    public static final RegistryObject<Block> potCookedBeef = registry("pot_cooked_beef", PotBlock::new);
    public static final RegistryObject<Block> potCookedChicken = registry("pot_cooked_chicken", PotBlock::new);
    public static final RegistryObject<Block> potCookedMutton = registry("pot_cooked_mutton", PotBlock::new);
    public static final RegistryObject<Block> potCookedPorkchop = registry("pot_cooked_porkchop", PotBlock::new);
    public static final RegistryObject<Block> potCookedRabbit = registry("pot_cooked_rabbit", PotBlock::new);
    public static final RegistryObject<Block> potCookie = registry("pot_cookie", PotBlock::new);
    public static final RegistryObject<Block> potBakedPotato = registry("pot_baked_potato", PotBlock::new);
    public static final RegistryObject<Block> potBread = registry("pot_bread", PotBlock::new);
    public static final RegistryObject<Block> potPumpkinPie = registry("pot_pumpkin_pie", PotBlock::new);

    public static final RegistryObject<Block> cartonExperienceBottle = registry("carton_experience_bottle", () -> new CartonBlock(Material.GLASS, 4));
    public static final RegistryObject<Block> cartonPotion = registry("carton_egg", () -> new CartonBlock(Material.EGG));
    public static final RegistryObject<Block> cartonTurtleEgg = registry("carton_turtle_egg", () -> new CartonBlock(Material.EGG));
    public static final RegistryObject<Block> cartonPaper = registry("carton_paper", () -> new CartonBlock(Material.WOOD));
    public static final RegistryObject<Block> cartonString = registry("carton_string", () -> new CartonBlock(Material.WOOL));
    public static final RegistryObject<Block> cartonBook = registry("carton_book", () -> new CartonBlock(Material.WOOD));
    public static final RegistryObject<Block> cartonPrismarineCrystals = registry("carton_prismarine_crystals", () -> new CartonBlock(Material.GLASS));
    public static final RegistryObject<Block> cartonFireCharge = registry("carton_fire_charge", () -> new CartonBlock(Material.WOOL));
    public static final RegistryObject<Block> cartonQuartz = registry("carton_quartz", () -> new CartonBlock(Material.STONE));

    public static final RegistryObject<Block> pileSkeletonSkull = registry("pile_skeleton_skull", PileBlock::new);
    public static final RegistryObject<Block> pileWitherSkeletonSkull = registry("pile_wither_skeleton_skull", PileBlock::new, true);
    public static final RegistryObject<Block> pileZombieHead = registry("pile_zombie_head", PileBlock::new);
    public static final RegistryObject<Block> pileCreeperHead = registry("pile_creeper_head", PileBlock::new);

    public static final RegistryObject<Block> cauldronRawBeef = registry("cauldron_raw_beef", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronRawChicken = registry("cauldron_raw_chicken", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronRawMutton = registry("cauldron_raw_mutton", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronRawRabbit = registry("cauldron_raw_rabbit", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronRawPorkchop = registry("cauldron_raw_porkchop", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronRedMushroom = registry("cauldron_red_mushroom", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronBrownMushroom = registry("cauldron_brown_mushroom", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronSnowball = registry("cauldron_snowball", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronRottenFlesh = registry("cauldron_rotten_flesh", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronWarpedFungus = registry("cauldron_warped_fungus", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronCrimsonFungus = registry("cauldron_crimson_fungus", CauldronBlock::new);
    public static final RegistryObject<Block> cauldronGhastTear = registry("cauldron_ghast_tear", () -> new CauldronBlock(4));
    public static final RegistryObject<Block> cauldronDragonBreath = registry("cauldron_dragon_breath", () -> new CauldronBlock(4), true);


    public static RegistryObject<Block> registry(String name, Supplier<Block> supplier) {
        return registry(name, supplier, false);
    }

    public static RegistryObject<Block> registry(String name, Supplier<Block> supplier, boolean tooltip) {
        return registry(name, supplier, tooltip, -1);
    }

    public static RegistryObject<Block> registry(String name, Supplier<Block> supplier, boolean tooltip, int burnTime) {
        RegistryObject<Block> block = modBlocks.register(name, supplier);
        modItems.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(modTab)) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                if (burnTime > 0) {
                    return burnTime;
                } else {
                    return super.getBurnTime(itemStack, recipeType);
                }
            }

            @Override
            public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> componentList, @NotNull TooltipFlag flag) {
                if (tooltip) {
                    componentList.add(new TranslatableComponent(I18n.get("block." + ExquisitePacking.MODID + "." + name + ".desc")));
                }
                super.appendHoverText(stack, level, componentList, flag);
            }
        });
        return block;
    }

    public static RegistryObject<Block> registry(String name, Supplier<Block> supplier, int type, Block plantBlock) {
        RegistryObject<Block> block = modBlocks.register(name, supplier);
        switch (type) {
            case 0 -> modItems.register(name, () -> new ChainSowItem(block.get(), plantBlock));
            case 1 -> modItems.register(name, () -> new ChainPlantItem(block.get(), plantBlock));
        }
        return block;
    }

}
