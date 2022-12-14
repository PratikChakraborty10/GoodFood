package com.elbehiry.delish.ui.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/elbehiry/delish/ui/search/SearchRecipesViewModel;", "Landroidx/lifecycle/ViewModel;", "searchRecipesUseCase", "Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase;", "(Lcom/elbehiry/shared/domain/recipes/search/SearchRecipesUseCase;)V", "searchRecipes", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/elbehiry/model/RecipesItem;", "searchKey", "", "searchType", "Lcom/elbehiry/delish/ui/search/SearchType;", "mobile_debug"})
public final class SearchRecipesViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase searchRecipesUseCase = null;
    
    @javax.inject.Inject()
    public SearchRecipesViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.recipes.search.SearchRecipesUseCase searchRecipesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.elbehiry.model.RecipesItem>> searchRecipes(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKey, @org.jetbrains.annotations.NotNull()
    com.elbehiry.delish.ui.search.SearchType searchType) {
        return null;
    }
}