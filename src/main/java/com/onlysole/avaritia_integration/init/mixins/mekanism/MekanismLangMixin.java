package com.onlysole.avaritia_integration.init.mixins.mekanism;

import com.onlysole.avaritia_integration.module.mekanism.common.MekIntegrationLang;
import mekanism.api.text.ILangEntry;
import mekanism.common.MekanismLang;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

@Mixin(value = MekanismLang.class, remap = false)
public abstract class MekanismLangMixin implements ILangEntry {

    private static Field mekIntegration$valuesField;

    @Invoker("<init>")
    public static MekanismLang mekIntegration$initInvoker(String internalName, int internalId, String type, String path) {
        throw new AssertionError();
    }

    @Inject(method = {"<clinit>"}, at = @At("TAIL"))
    private static void mekIntegration$clinit(CallbackInfo ci) {
        try {
            mekIntegration$valuesField = MekanismLang.class.getDeclaredField("$VALUES");
            mekIntegration$valuesField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        MekIntegrationLang.NEUTRON_COLLECTING = mekIntegration$addVariant("NEUTRON_COLLECTING", "factory", "neutron_collecting");
        MekIntegrationLang.DESCRIPTION_NEUTRON_COLLECTING = mekIntegration$addVariant("DESCRIPTION_NEUTRON_COLLECTING", "description", "neutron_collecting");
        MekIntegrationLang.NEUTRON_COMPRESSING = mekIntegration$addVariant("NEUTRON_COMPRESSING", "factory", "neutron_compressing");
        MekIntegrationLang.DESCRIPTION_SINGULARITY_COMPRESSING = mekIntegration$addVariant("DESCRIPTION_NEUTRON_COMPRESSING", "description", "neutron_compressing");
    }

    private static MekanismLang mekIntegration$addVariant(String internalName, String type, String path) {
        MekanismLang[] currentValues = MekanismLang.values();
        ArrayList<MekanismLang> variants = new ArrayList<>(Arrays.asList(currentValues));
        MekanismLang casing = mekIntegration$initInvoker(internalName, variants.get(variants.size() - 1).ordinal() + 1, type, path);
        variants.add(casing);
        try {
            mekIntegration$valuesField.set(null, variants.toArray(new MekanismLang[0]));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return casing;
    }
}