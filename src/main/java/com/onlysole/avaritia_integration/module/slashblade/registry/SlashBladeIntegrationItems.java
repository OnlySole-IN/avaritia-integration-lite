package com.onlysole.avaritia_integration.module.slashblade.registry;

import com.onlysole.avaritia_integration.AvaritiaIntegration;
import com.onlysole.avaritia_integration.module.slashblade.item.StredgeuniverseItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public final class SlashBladeIntegrationItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(Registries.ITEM, AvaritiaIntegration.MOD_ID);

    public static final RegistryObject<Item> STREDGEUNIVERSE = register("stredgeuniverse", StredgeuniverseItem::new);

    public static <T extends Item> RegistryObject<T> register(String id, Supplier<T> obj) {
        return REGISTRY.register(id, obj);
    }
}
