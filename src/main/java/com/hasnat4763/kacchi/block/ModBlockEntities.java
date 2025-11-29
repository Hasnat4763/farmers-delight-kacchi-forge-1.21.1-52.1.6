package com.hasnat4763.kacchi.block;

import com.hasnat4763.kacchi.kacchi;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    // Use YOUR mod ID, not NeoForge's MOD_ID
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, kacchi.MODID); // Replace "kacchi" with your actual MOD_ID constant

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<YogurtMakerEntity>> YOGURT_MAKER =
            BLOCK_ENTITIES.register("yogurt_maker",
                    () -> BlockEntityType.Builder.of(
                            YogurtMakerEntity::new,
                            ModBlocks.YOGURT_MAKER.get()
                    ).build(null)
            );

    // Don't forget to register this in your main mod class!
    public static void register(IEventBus modEventBus) {
        BLOCK_ENTITIES.register(modEventBus);
    }
}