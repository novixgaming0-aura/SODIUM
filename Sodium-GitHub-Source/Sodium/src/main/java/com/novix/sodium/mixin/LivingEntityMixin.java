package com.novix.sodium.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @ModifyConstant(
        method = "isBlocking",
        constant = @Constant(intValue = 5)
    )
    private int sodium$removeShieldRaiseDelay(int original) {
        return 0;
    }
}
