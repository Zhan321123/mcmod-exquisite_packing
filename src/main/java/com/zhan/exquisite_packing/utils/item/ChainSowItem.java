package com.zhan.exquisite_packing.utils.item;

import com.zhan.exquisite_packing.ExquisitePacking;
import com.zhan.exquisite_packing.registries.ExquisitePackingCreativeTab;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ChainSowItem extends BlockItem {
    Block sowBlock;

    public ChainSowItem(Block block, Block sowBlock) {
        super(block, new Properties().tab(ExquisitePackingCreativeTab.modTab));
        this.sowBlock = sowBlock;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> componentList, @NotNull TooltipFlag flag) {

        componentList.add(new TranslatableComponent(I18n.get(ExquisitePacking.MODID + ".chain_sowing.desc")));

        super.appendHoverText(stack, level, componentList, flag);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext uoc) {
        BlockPos pos = uoc.getClickedPos();
        Level level = uoc.getLevel();
        Player player = uoc.getPlayer();

        if (level.getBlockState(pos).getBlock() == Blocks.FARMLAND &&
                uoc.getClickedFace() == Direction.UP) {

            if (chainPlant(level, getChainPlantPos(level, pos))) {

                uoc.getItemInHand().shrink(1);
                if (player instanceof ServerPlayer) {
                    CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, pos, new ItemStack(this));
                }

                level.gameEvent(player, GameEvent.BLOCK_PLACE, pos);
                SoundType soundType = sowBlock.getSoundType(sowBlock.defaultBlockState(), level, pos, player);
                level.playSound(player, pos, soundType.getPlaceSound(), SoundSource.BLOCKS, (soundType.getVolume() + 1.0F) / 2.0F, soundType.getPitch() * 0.8F);

                return InteractionResult.SUCCESS;
            } else {
                return InteractionResult.FAIL;
            }
        } else {
            return super.useOn(uoc);
        }
    }


    // get the block positions where can sow
    private List<BlockPos> getChainPlantPos(Level level, BlockPos pos) {

        List<BlockPos> posList = new ArrayList<>();
        int length = 4;
        int size = 0;
        int max = 32;

        for (int i = -length; i <= length; i++) {
            for (int j = -length; j <= length; j++) {
                BlockPos here = pos.offset(i, 0, j);
                BlockPos above = here.above();
                if (level.getBlockState(here).getBlock() == Blocks.FARMLAND &&
                        level.getBlockState(above).getBlock() == Blocks.AIR) {
                    posList.add(above);
                    size++;
                }
                if (size == max) {
                    break;
                }
            }
        }
        return posList;
    }

    // chain-sowing the blocks
    private boolean chainPlant(Level level, List<BlockPos> posList) {
        if (posList.size() == 0) {
            return false;
        }
        for (BlockPos pos : posList) {
            level.setBlock(pos, this.sowBlock.defaultBlockState(), 4);
        }
        return true;
    }

}
