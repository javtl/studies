package com;

import com.init.BlockIniciar;
import com.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

@Mod(Tutorialmod.MODID)

public class Tutorialmod {
    public static final String MODID="Tutorialmos";

    public MiPrimerMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        BlockIniciar.BLOCKS.register(bus);
    }



}
