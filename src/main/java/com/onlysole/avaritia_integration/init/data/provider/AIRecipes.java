package com.onlysole.avaritia_integration.init.data.provider;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.onlysole.avaritia_integration.module.ae2.registry.AE2IntegrationItems;
import com.onlysole.avaritia_integration.module.bloodmagic.registry.BloodMagicIntegrationItems;
import com.onlysole.avaritia_integration.module.slashblade.registry.SlashBladeIntegrationItems;
import committee.nova.mods.avaritia.init.data.provider.recipe.ModExtremeSmithingRecipeBuilder;
import committee.nova.mods.avaritia.init.data.provider.recipe.ModShapedRecipeBuilder;
import committee.nova.mods.avaritia.init.registry.ModItems;
import mods.flammpfeil.slashblade.init.SBItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CompoundIngredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;
import wayoftime.bloodmagic.common.item.BloodMagicItems;

import java.util.function.Consumer;

public class AIRecipes extends RecipeProvider implements IConditionBuilder {
    public AIRecipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        InventoryChangeTrigger.TriggerInstance lul = has(Items.AIR);

        //Slash Blade

        ModExtremeSmithingRecipeBuilder.smithing(
                        Ingredient.of(ModItems.upgrade_smithing_template.get()),
                        Ingredient.of(SBItems.slashblade),
                        CompoundIngredient.of(Ingredient.of(ModItems.infinity_sword.get()), Ingredient.of(ModItems.enhancement_core.get()), Ingredient.of(ModItems.eternal_singularity.get())),
                        RecipeCategory.TOOLS,
                        SlashBladeIntegrationItems.STREDGEUNIVERSE.get().asItem())
                        .unlockedBy("has_item", has(ModItems.upgrade_smithing_template.get()))
                        .save(consumer);

        //AE2

        ModShapedRecipeBuilder.shaped(RecipeCategory.MISC, AE2IntegrationItems.INFINITY_ME_STORAGE_COMPONENT.get())
                .pattern("  rrrrr  ")
                .pattern(" vesssev ")
                .pattern("reafcfaer")
                .pattern("rsfxzxfsr")
                .pattern("rsczdzcsr")
                .pattern("rsfxzxfsr")
                .pattern("reafcfaer")
                .pattern(" vesssev ")
                .pattern("  rrrrr  ")
                .define('a', AEItems.ENDER_DUST)
                .define('s', AEItems.SKY_DUST)
                .define('d', AEBlocks.CONTROLLER)
                .define('f', AEItems.CELL_COMPONENT_256K)
                .define('z', AEItems.SPATIAL_128_CELL_COMPONENT)
                .define('x', AEItems.MATTER_BALL)
                .define('c', AEItems.SINGULARITY)
                .define('e', ModItems.infinity_catalyst.get())
                .define('r', ModItems.infinity_ingot.get())
                .define('v', ModItems.neutron_gear.get())
                .showNotification(true)
                .unlockedBy("has_item", has(ModItems.infinity_ingot.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AE2IntegrationItems.INFINITY_ME_STORAGE_CELL.get())
                .pattern("aq")
                .pattern("s ")
                .define('a', AE2IntegrationItems.INFINITY_ME_STORAGE_COMPONENT.get())
                .define('q', AEItems.FLUID_CELL_HOUSING)
                .define('s', AEItems.ITEM_CELL_HOUSING)
                .unlockedBy("has_item", has(ModItems.neutron_ingot.get())).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AE2IntegrationItems.INFINITY_ME_STORAGE_CELL_BIG.get())
                .pattern("aq")
                .define('a', AE2IntegrationItems.INFINITY_ME_STORAGE_COMPONENT.get())
                .define('q', AE2IntegrationItems.INFINITY_ME_STORAGE_CELL.get())
                .unlockedBy("has_item", has(ModItems.neutron_ingot.get())).save(consumer);


        //Blood Magic

        ModShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, BloodMagicIntegrationItems.BLOOD_ORB_OF_ARMOK.get())
                .pattern("         ")
                .pattern("   rrr   ")
                .pattern("  rqsqr  ")
                .pattern("  rsfsr  ")
                .pattern(" drxsxrd ")
                .pattern("dddrrrddd")
                .pattern(" ddddddd ")
                .pattern("  ddddd  ")
                .pattern("         ")
                .define('x', BloodMagicItems.STRONG_TAU_ITEM.get())
                .define('q', BloodMagicItems.ARCHMAGE_BLOOD_ORB.get())
                .define('f', BloodMagicItems.VENGEFUL_CRYSTAL.get())
                .define('s', ModItems.infinity_catalyst.get())
                .define('r', ModItems.infinity_ingot.get())
                .define('d', ModItems.neutron_ingot.get())
                .showNotification(true)
                .unlockedBy("has_item", has(ModItems.infinity_ingot.get())).save(consumer);
    }
}
