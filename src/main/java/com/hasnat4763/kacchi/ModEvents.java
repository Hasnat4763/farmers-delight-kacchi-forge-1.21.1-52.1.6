package com.hasnat4763.kacchi;

import com.hasnat4763.kacchi.item.ModItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import java.util.List;

@EventBusSubscriber(modid = kacchi.MODID)
public class ModEvents {

    @SubscribeEvent
    public static void customtrades(VillagerTradesEvent event) {

        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 5),     // Cost
                    new ItemStack(ModItems.MASALA.get()), // Result
                    10, 8, 1f
            ));
        }

        if (event.getType() == VillagerProfession.BUTCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 30),            // Cost
                    new ItemStack(ModItems.KACCHI.get()),       // Result
                    10, 8, 1f
            ));
        }
    }
}
