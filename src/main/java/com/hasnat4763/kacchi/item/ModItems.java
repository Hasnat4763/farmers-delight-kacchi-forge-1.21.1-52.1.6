package com.hasnat4763.kacchi.item;

import com.hasnat4763.kacchi.kacchi;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.hasnat4763.kacchi.kacchi.LOGGER;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(kacchi.MODID);


    public static final DeferredItem<Item> KACCHI = ITEMS.register("kacchi",
            () -> new Item(new Item.Properties().stacksTo(64).food(ModFoods.KACCHI)));
    public static final DeferredItem<Item> MASALA = ITEMS.register("masala",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> CHICKBIR = ITEMS.register("chickbir",
            () -> new Item(new Item.Properties().stacksTo(64).food(ModFoods.CHICKBIR)));
    public static final DeferredItem<Item> YOGURT = ITEMS.register("yogurt",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.YOGURT)));
    public static final DeferredItem<Item> PANTAVAAT = ITEMS.register("pantavaat",
            () -> new Item(new Item.Properties().stacksTo(64).food(ModFoods.PANTAVAAT)));
    public static final DeferredItem<Item> MACHVAAT = ITEMS.register("machvaat",
            () -> new Item(new Item.Properties().stacksTo(64).food(ModFoods.MACHVAAT)));
    public static final DeferredItem<Item> UNCOOKEDCUP = ITEMS.register("uncookedcup",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> CUP = ITEMS.register("cup",
            ()-> new Item(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventbus) {
        LOGGER.info("Registering Items for " + kacchi.MODID);
        ITEMS.register(eventbus);

    }
}
