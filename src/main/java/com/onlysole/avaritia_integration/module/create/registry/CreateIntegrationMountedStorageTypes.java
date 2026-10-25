package com.onlysole.avaritia_integration.module.create.registry;

import com.onlysole.avaritia_integration.module.create.CreateModule;
import com.onlysole.avaritia_integration.module.create.content.extreme_depot.ExtremeDepotMountedStorageType;
import com.simibubi.create.api.contraption.storage.item.MountedItemStorageType;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;

import java.util.function.Supplier;

public class CreateIntegrationMountedStorageTypes {
    private static final CreateRegistrate REGISTRATE = CreateModule.REGISTRATE;

    public static final RegistryEntry<ExtremeDepotMountedStorageType> EXTREME_DEPOT = simpleItem("extreme_depot", ExtremeDepotMountedStorageType::new);

    private static <T extends MountedItemStorageType<?>> RegistryEntry<T> simpleItem(String name, Supplier<T> supplier) {
        return REGISTRATE.mountedItemStorage(name, supplier).register();
    }

    public static void register() {
    }
}
