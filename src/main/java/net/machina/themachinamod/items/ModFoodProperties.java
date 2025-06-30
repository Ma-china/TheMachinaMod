package net.machina.themachinamod.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SOVIETCORE = new FoodProperties.Builder().nutrition(1000).saturationModifier(1000)
            .effect(new MobEffectInstance(MobEffects.GLOWING, -1),1f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, -1,255),1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, -1,255),1f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, -1,255),1f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, -1,255),1f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, -1,255),1f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, -1,255),1f)
            .alwaysEdible().build();
}
