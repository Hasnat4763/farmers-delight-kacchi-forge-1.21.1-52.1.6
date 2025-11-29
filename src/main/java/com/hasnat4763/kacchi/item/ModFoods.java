package com.hasnat4763.kacchi.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties KACCHI = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(10f)
            .effect(()-> new MobEffectInstance(MobEffects.HEALTH_BOOST,10000,2),1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1000, 3),1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 10000, 3),1.0f)
            .build();

    public static final FoodProperties YOGURT = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(1f)
            .effect(()-> new MobEffectInstance(MobEffects.HEAL, 30000,1),1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED, 30000,2), 1.0f)
            .build();

    public static final FoodProperties MACHVAAT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(2f)
            .effect(()-> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 30000,1), 1f)
            .effect(()-> new MobEffectInstance(MobEffects.CONDUIT_POWER, 30000, 2), 1f)
            .build();

    public static final FoodProperties CHICKBIR = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(5f)
            .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10000, 1),1f)
            .effect(()-> new MobEffectInstance(MobEffects.LUCK, 10000, 10), 1f)
            .build();
    public static final FoodProperties PANTAVAAT = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(2f)
            .effect(()-> new MobEffectInstance(MobEffects.CONFUSION, 1000, 1),1f)
            .build();
}
