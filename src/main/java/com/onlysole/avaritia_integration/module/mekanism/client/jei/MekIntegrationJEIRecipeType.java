package com.onlysole.avaritia_integration.module.mekanism.client.jei;

import com.onlysole.avaritia_integration.module.mekanism.api.recipes.chemicals.GasStackToItemStackRecipe;
import com.onlysole.avaritia_integration.module.mekanism.common.registry.MekIntegrationBlocks;
import mekanism.api.recipes.ItemStackToItemStackRecipe;
import mekanism.client.jei.MekanismJEIRecipeType;

public class MekIntegrationJEIRecipeType {

    public static final MekanismJEIRecipeType<GasStackToItemStackRecipe> NEUTRON_COLLECTOR = new MekanismJEIRecipeType<>(MekIntegrationBlocks.NEUTRON_COLLECTOR, GasStackToItemStackRecipe.class);
    public static final MekanismJEIRecipeType<ItemStackToItemStackRecipe> NEUTRON_COMPRESSOR = new MekanismJEIRecipeType<>(MekIntegrationBlocks.SINGULARITY_COMPRESSOR, ItemStackToItemStackRecipe.class);
}
