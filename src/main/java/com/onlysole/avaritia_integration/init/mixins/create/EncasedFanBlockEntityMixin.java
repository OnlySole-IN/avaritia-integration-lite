package com.onlysole.avaritia_integration.init.mixins.create;

import com.onlysole.avaritia_integration.module.create.content.extreme_fan.compat.ChuteInteractingFanBlockEntity;
import com.simibubi.create.content.kinetics.fan.EncasedFanBlockEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EncasedFanBlockEntity.class)
public abstract class EncasedFanBlockEntityMixin implements ChuteInteractingFanBlockEntity {
    @Override
    public float getChuteFanSpeed() {
        return ((EncasedFanBlockEntity) (Object) this).getSpeed();
    }
}
