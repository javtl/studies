package com.pocioncaidasuave;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MiMod.MOD_ID)
public class MiMod {
    public static final String MOD_ID = "pocioncaidasuave";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MiMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModEffects.register(modEventBus);
    }
}