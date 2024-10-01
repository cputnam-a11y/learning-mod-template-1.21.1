package net.rgy.lrn.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).snack()
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200,1),0.3333f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200,2),0.0333f).alwaysEdible().build();
}
