package com.onlysole.avaritia_integration.init.mixins.create.accessor;

import com.simibubi.create.content.kinetics.belt.BeltBlockEntity;
import com.simibubi.create.content.kinetics.belt.transport.BeltInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = BeltInventory.class, remap = false)
public interface BeltInventoryAccessor {
    @Accessor("belt")
    BeltBlockEntity getBelt();

    @Accessor("beltMovementPositive")
    boolean isBeltMovementPositive();
}