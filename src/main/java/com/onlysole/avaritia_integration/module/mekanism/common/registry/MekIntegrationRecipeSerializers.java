package com.onlysole.avaritia_integration.module.mekanism.common.registry;

import com.onlysole.avaritia_integration.AvaritiaIntegration;
import com.onlysole.avaritia_integration.module.mekanism.api.recipes.MekCompressorIRecipe;
import com.onlysole.avaritia_integration.module.mekanism.api.recipes.NeutronCollectorIRecipe;
import com.onlysole.avaritia_integration.module.mekanism.api.recipes.chemicals.GasStackToItemStackRecipe;
import com.onlysole.avaritia_integration.module.mekanism.common.recipe.serializer.NeutronCollectorRecipeSerializer;
import mekanism.api.recipes.ItemStackToItemStackRecipe;
import mekanism.common.recipe.serializer.ItemStackToItemStackRecipeSerializer;
import mekanism.common.registration.impl.RecipeSerializerDeferredRegister;
import mekanism.common.registration.impl.RecipeSerializerRegistryObject;

public class MekIntegrationRecipeSerializers {

    private MekIntegrationRecipeSerializers() {

    }

    public static final RecipeSerializerDeferredRegister RECIPE_SERIALIZERS = new RecipeSerializerDeferredRegister(AvaritiaIntegration.MOD_ID);

    public static final RecipeSerializerRegistryObject<GasStackToItemStackRecipe> COLLECTOR = RECIPE_SERIALIZERS.register("collector", () -> new NeutronCollectorRecipeSerializer<>(NeutronCollectorIRecipe::new));
    public static final RecipeSerializerRegistryObject<ItemStackToItemStackRecipe> MEK_COMPRESSOR = RECIPE_SERIALIZERS.register("compressor", () -> new ItemStackToItemStackRecipeSerializer<>(MekCompressorIRecipe::new));
}
