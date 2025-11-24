package com.init;

import com.Tutorialmod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Tutorialmod
    );

    public static final RegistryObject<Item> POKEBALL = ITEMS.register(
            "pokeball",() -> new Pokeball(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );
}
