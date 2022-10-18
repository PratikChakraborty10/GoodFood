// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.recipes.cuisines.remote.GetCuisinesDataSource;
import com.elbehiry.shared.data.recipes.cuisines.repository.CuisinesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesModule_ProvideCuisinesRepositoryFactory implements Factory<CuisinesRepository> {
  private final RecipesModule module;

  private final Provider<GetCuisinesDataSource> getCuisinesDataSourceProvider;

  public RecipesModule_ProvideCuisinesRepositoryFactory(RecipesModule module,
      Provider<GetCuisinesDataSource> getCuisinesDataSourceProvider) {
    this.module = module;
    this.getCuisinesDataSourceProvider = getCuisinesDataSourceProvider;
  }

  @Override
  public CuisinesRepository get() {
    return provideCuisinesRepository(module, getCuisinesDataSourceProvider.get());
  }

  public static RecipesModule_ProvideCuisinesRepositoryFactory create(RecipesModule module,
      Provider<GetCuisinesDataSource> getCuisinesDataSourceProvider) {
    return new RecipesModule_ProvideCuisinesRepositoryFactory(module, getCuisinesDataSourceProvider);
  }

  public static CuisinesRepository provideCuisinesRepository(RecipesModule instance,
      GetCuisinesDataSource getCuisinesDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideCuisinesRepository(getCuisinesDataSource));
  }
}
