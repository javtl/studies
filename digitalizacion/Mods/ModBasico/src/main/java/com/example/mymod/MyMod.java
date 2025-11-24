package com.example.mymod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FoodProperties;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MyMod.MOD_ID)
public class MyMod {
    public static final String MOD_ID = "mymod";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new DiamondApple());

    public MyMod() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @SubscribeEvent
    public void setup(FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {}

    public static class DiamondApple extends Item {
        public DiamondApple() {
            super(new Item.Properties()
                .food(new FoodProperties.Builder()
                    .nutrition(6)
                    .saturationMod(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0), 1.0F)
                    .alwaysEat()
                    .build()));
        }
    }
}