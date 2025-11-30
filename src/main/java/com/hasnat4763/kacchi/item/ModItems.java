package com.hasnat4763.kacchi.item;

import com.hasnat4763.kacchi.block.ModBlocks;
import com.hasnat4763.kacchi.fluids.ModFluids;
import com.hasnat4763.kacchi.kacchi;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

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
    public static final DeferredItem<Item> CHOPPED_POTATO = ITEMS.register("chopped_potato",
            ()-> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> CHAI_SEEDS = ITEMS.register("chai_seeds",
            ()-> new ItemNameBlockItem(ModBlocks.CHAI_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHAI_LEAVES = ITEMS.register("chai_leaves",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAI_BUCKET = ITEMS.register("chai_bucket",
            () -> new BucketItem(
                    ModFluids.SOURCE_CHAI_FLUID.get(),
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
            ));
    public static final Supplier<Item> CHAI_CUP = ITEMS.register("chai_cup",
            () -> new EdibleChaiBucket(
                    ModFluids.SOURCE_CHAI_FLUID.get(),
                    new Item.Properties().craftRemainder(CUP.get()).stacksTo(1)
            ));


    public static void register(IEventBus eventbus) {
        LOGGER.info("Registering Items for " + kacchi.MODID);
        ITEMS.register(eventbus);

    }
}
