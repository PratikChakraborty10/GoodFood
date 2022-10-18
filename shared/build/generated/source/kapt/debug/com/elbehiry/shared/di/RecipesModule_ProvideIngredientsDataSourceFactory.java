// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource;
import com.elbehiry.shared.data.remote.DelishApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesModule_ProvideIngredientsDataSourceFactory implements Factory<GetIngredientsDataSource> {
  private final RecipesModule module;

  private final Provider<DelishApi> apiProvider;

  public RecipesModule_ProvideIngredientsDataSourceFactory(RecipesModule module,
      Provider<DelishApi> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public GetIngredientsDataSource get() {
    return provideIngredientsDataSource(module, apiProvider.get());
  }

  public static RecipesModule_ProvideIngredientsDataSourceFactory create(RecipesModule module,
      Provider<DelishApi> apiProvider) {
    return new RecipesModule_ProvideIngredientsDataSourceFactory(module, apiProvider);
  }

  public static GetIngredientsDataSource provideIngredientsDataSource(RecipesModule instance,
      DelishApi api) {
    return Preconditions.checkNotNullFromProvides(instance.provideIngredientsDataSource(api));
  }
}
