package com.elbehiry.shared.data.db.recipes.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/elbehiry/shared/data/db/recipes/mapper/RecipeMapper;", "", "mapToDataBaseRecipe", "Lcom/elbehiry/shared/data/db/recipes/entities/RecipeEntity;", "recipesItem", "Lcom/elbehiry/model/RecipesItem;", "mapToDataRecipe", "recipeEntity", "shared_debug"})
public abstract interface RecipeMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elbehiry.shared.data.db.recipes.entities.RecipeEntity mapToDataBaseRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.model.RecipesItem recipesItem);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.elbehiry.model.RecipesItem mapToDataRecipe(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.data.db.recipes.entities.RecipeEntity recipeEntity);
}