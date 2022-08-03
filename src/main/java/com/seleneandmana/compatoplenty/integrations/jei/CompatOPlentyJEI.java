package com.seleneandmana.compatoplenty.integrations.jei;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.annotation.Nonnull;

import com.simibubi.create.compat.jei.category.CreateRecipeCategory;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.ItemLike;

import com.seleneandmana.compatoplenty.core.CompatOPlenty;
import com.seleneandmana.compatoplenty.core.registry.CompatItems;

@JeiPlugin
public class CompatOPlentyJEI implements IModPlugin {


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(CompatOPlenty.MOD_ID, "jei_plugin");
    }

    final List<CreateRecipeCategory<?>> ALL = new ArrayList<>();

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        ALL.forEach(c -> c.recipeCatalysts.forEach(s -> registration.addRecipeCatalyst(s.get(), c.getUid())));

        registration.addRecipeCatalyst(new ItemStack(CompatItems.ORANGE_SANDPAPER.get()), new ResourceLocation(CompatOPlenty.CREATE_ID, "sandpaper_polishing"));
        registration.addRecipeCatalyst(new ItemStack(CompatItems.BLACK_SANDPAPER.get()), new ResourceLocation(CompatOPlenty.CREATE_ID, "sandpaper_polishing"));
        registration.addRecipeCatalyst(new ItemStack(CompatItems.WHITE_SANDPAPER.get()), new ResourceLocation(CompatOPlenty.CREATE_ID, "sandpaper_polishing"));
    }
}
