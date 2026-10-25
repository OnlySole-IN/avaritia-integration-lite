package com.onlysole.avaritia_integration.module.create.content.recipe.mixer;

import com.onlysole.avaritia_integration.module.create.content.recipe.ExtremeBasinRecipe;
import com.onlysole.avaritia_integration.module.create.content.recipe.ExtremeProcessingRecipeBuilder;
import com.onlysole.avaritia_integration.module.create.registry.CreateIntegrationRecipeTypes;

public class ExtremeMixingRecipe extends ExtremeBasinRecipe {
    public ExtremeMixingRecipe(ExtremeProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(CreateIntegrationRecipeTypes.EXTREME_MIXING, params);
    }
}
