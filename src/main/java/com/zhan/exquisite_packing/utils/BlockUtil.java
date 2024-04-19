package com.zhan.exquisite_packing.utils;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockUtil {
    private static final float unbreakableHardness = -1f;
    private static final float unbreakableResistance = 3600000f;

    public static class Property {
        private final BlockBehaviour.Properties properties;
        private final Material material;

        public Property(Material material, MaterialColor color) {
            this.properties = BlockBehaviour.Properties.of(material, color).requiresCorrectToolForDrops();
            this.material = material;

            sound();
        }

        public BlockBehaviour.Properties get() {
            return this.properties;
        }

        public Property light(int light) {
            this.properties.lightLevel(state -> light);
            return this;
        }

        public Property dynamicShape() {
            this.properties.dynamicShape();
            return this;
        }

        public Property strength(float hardness, float resistance) {
            this.properties.strength(hardness, resistance);
            return this;
        }

        public Property noOcclusion() {
            this.properties.noOcclusion();
            return this;
        }

        private void sound() {
            if (material == Material.METAL) {
                this.properties.sound(SoundType.METAL);
            } else if (material == Material.GLASS) {
                this.properties.sound(SoundType.GLASS);
            } else if (material == Material.WOOD) {
                this.properties.sound(SoundType.WOOD);
            } else if (material == Material.SNOW) {
                this.properties.sound(SoundType.SNOW);
            } else if (material == Material.PLANT) {
                this.properties.sound(SoundType.GRASS);
            } else if (material == Material.WOOL) {
                this.properties.sound(SoundType.WOOL);
            } else if (material == Material.AMETHYST) {
                this.properties.sound(SoundType.AMETHYST);
            } else if (material == Material.BAMBOO) {
                this.properties.sound(SoundType.BAMBOO);
            } else if (material == Material.POWDER_SNOW) {
                this.properties.sound(SoundType.POWDER_SNOW);
            }else if(material == Material.EGG){
                this.properties.sound(SoundType.GRASS);
            } else {
                this.properties.sound(SoundType.STONE);
            }
        }
    }
}
