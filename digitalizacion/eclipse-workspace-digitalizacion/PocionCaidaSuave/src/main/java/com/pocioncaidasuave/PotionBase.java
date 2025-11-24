package com.pocioncaidasuave;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class PotionBase extends MobEffect {

    // Constructor
    protected PotionBase(MobEffectCategory category, int color) {
        super(category, color);
    }

    // Este método se llama periódicamente durante la duración de la poción
    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        // Si el jugador tiene una distancia de caída, la ajustamos a 0
        if (entity.fallDistance > 0) {
            entity.fallDistance = 0;
        }
    }

    // Este método controla si el efecto se aplica en cada tick
    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true; // Siempre se activa en cada tick
    }
}
