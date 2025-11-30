package com.hasnat4763.kacchi.item;

import com.hasnat4763.kacchi.kacchi;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.hasnat4763.kacchi.kacchi.LOGGER;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, kacchi.MODID);

    public static final Supplier<CreativeModeTab> KACCHI_TAB = CREATIVE_MODE_TABS.register(
            "kacchi",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.KACCHI.get()))
                    .title(Component.translatable("itemGroup.kacchi"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.KACCHI.get());
                        output.accept(ModItems.CHICKBIR.get());
                        output.accept(ModItems.MACHVAAT.get());
                        output.accept(ModItems.PANTAVAAT.get());
                        output.accept(ModItems.YOGURT.get());
                        output.accept(ModItems.CUP.get());
                        output.accept(ModItems.UNCOOKEDCUP.get());
                        output.accept(ModItems.MASALA.get());
                        output.accept(ModItems.CHOPPED_POTATO.get());
                        output.accept(ModItems.CHAI_SEEDS.get());
                        output.accept(ModItems.CHAI_LEAVES.get());
                        output.accept(ModItems.CHAI_BUCKET.get());
                    }))
                    .build()
    );
    public static void register(IEventBus eventbus) {
        LOGGER.info("Registering Creative Mode Tabs for " + kacchi.MODID);
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
