package com.pocioncaidasuave;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BrewingRecipeRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class ModRecipe {
    public static void registerRecipes() {
        BrewingRecipeRegistry.addRecipe(Ingredient.of(Items.POTION),
                Ingredient.of(Items.GLOWSTONE_DUST),
                new ItemStack(ModItems.SUAVE_POTION.get()));
    }
}