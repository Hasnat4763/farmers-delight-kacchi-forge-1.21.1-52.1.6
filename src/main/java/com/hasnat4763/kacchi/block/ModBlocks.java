package com.hasnat4763.kacchi.block;

import com.hasnat4763.kacchi.kacchi;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(kacchi.MODID);
    public static final DeferredBlock<Block> YOGURT_MAKER = BLOCKS.register("yogurt_maker",
            () -> new YogurtMaker(Block.Properties.of()
                    .strength(3.5f)
                    .requiresCorrectToolForDrops()
            )
    );


    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
