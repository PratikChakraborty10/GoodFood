// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.recipes.info.remote.RecipeInformationDataSource;
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
public final class RecipesModule_ProvideRecipeInformationDataSourceFactory implements Factory<RecipeInformationDataSource> {
  private final RecipesModule module;

  private final Provider<DelishApi> apiProvider;

  public RecipesModule_ProvideRecipeInformationDataSourceFactory(RecipesModule module,
      Provider<DelishApi> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public RecipeInformationDataSource get() {
    return provideRecipeInformationDataSource(module, apiProvider.get());
  }

  public static RecipesModule_ProvideRecipeInformationDataSourceFactory create(RecipesModule module,
      Provider<DelishApi> apiProvider) {
    return new RecipesModule_ProvideRecipeInformationDataSourceFactory(module, apiProvider);
  }

  public static RecipeInformationDataSource provideRecipeInformationDataSource(
      RecipesModule instance, DelishApi api) {
    return Preconditions.checkNotNullFromProvides(instance.provideRecipeInformationDataSource(api));
  }
}
