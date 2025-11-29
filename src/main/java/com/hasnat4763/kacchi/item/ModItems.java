package com.hasnat4763.kacchi.item;

import com.hasnat4763.kacchi.kacchi;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(kacchi.MODID);


    public static final DeferredItem<Item> KACCHI = ITEMS.register("kacchi",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);

    }
}
