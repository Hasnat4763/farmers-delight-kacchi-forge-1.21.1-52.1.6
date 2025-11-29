package com.hasnat4763.kacchi.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

public class YogurtMakerEntity extends BlockEntity {
    private static final int FERMENTATION_TIME = 6000;
    private int fermentationProgress = 0;

    private final FluidTank tank = new FluidTank(1000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
    };

    public YogurtMakerEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.YOGURT_MAKER.get(), pos, state);
    }

    public static void serverTick(Level level, BlockPos blockPos, BlockState blockState, YogurtMakerEntity entity) {
        // Example fermentation logic
        if (entity.canFerment()) {
            entity.fermentationProgress++;

            if (entity.fermentationProgress >= FERMENTATION_TIME) {
                entity.completeFermentation();
                entity.fermentationProgress = 0;
            }

            entity.setChanged();
        }
    }

    private boolean canFerment() {
        // Add your fermentation conditions here
        // For example: check if tank has milk
        return !tank.isEmpty();
    }

    private void completeFermentation() {
        // Add your fermentation completion logic here
        // For example: convert milk to yogurt
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("FermentationProgress", fermentationProgress);
        tag.put("FluidTank", tank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        fermentationProgress = tag.getInt("FermentationProgress");
        tank.readFromNBT(registries, tag.getCompound("FluidTank"));
    }

    public FluidTank getTank() {
        return tank;
    }

    public int getFermentationProgress() {
        return fermentationProgress;
    }
}