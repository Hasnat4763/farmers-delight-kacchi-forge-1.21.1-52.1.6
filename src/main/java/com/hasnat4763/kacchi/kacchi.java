package com.hasnat4763.kacchi;

import com.hasnat4763.kacchi.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


import static com.hasnat4763.kacchi.Config.SPEC;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(kacchi.MODID)
public class kacchi {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "kacchi";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public kacchi(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        ModItems.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }



    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
