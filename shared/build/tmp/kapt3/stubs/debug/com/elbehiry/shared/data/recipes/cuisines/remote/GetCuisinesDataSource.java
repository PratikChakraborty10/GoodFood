package com.elbehiry.shared.data.recipes.cuisines.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/elbehiry/shared/data/recipes/cuisines/remote/GetCuisinesDataSource;", "", "getAvailableCuisines", "", "Lcom/elbehiry/model/CuisineItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_debug"})
public abstract interface GetCuisinesDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAvailableCuisines(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.elbehiry.model.CuisineItem>> p0);
}