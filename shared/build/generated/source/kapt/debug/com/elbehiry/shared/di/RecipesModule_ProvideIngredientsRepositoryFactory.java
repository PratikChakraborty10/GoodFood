// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.recipes.ingredients.remote.GetIngredientsDataSource;
import com.elbehiry.shared.data.recipes.ingredients.repository.IngredientsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesModule_ProvideIngredientsRepositoryFactory implements Factory<IngredientsRepository> {
  private final RecipesModule module;

  private final Provider<GetIngredientsDataSource> getIngredientsDataSourceProvider;

  public RecipesModule_ProvideIngredientsRepositoryFactory(RecipesModule module,
      Provider<GetIngredientsDataSource> getIngredientsDataSourceProvider) {
    this.module = module;
    this.getIngredientsDataSourceProvider = getIngredientsDataSourceProvider;
  }

  @Override
  public IngredientsRepository get() {
    return provideIngredientsRepository(module, getIngredientsDataSourceProvider.get());
  }

  public static RecipesModule_ProvideIngredientsRepositoryFactory create(RecipesModule module,
      Provider<GetIngredientsDataSource> getIngredientsDataSourceProvider) {
    return new RecipesModule_ProvideIngredientsRepositoryFactory(module, getIngredientsDataSourceProvider);
  }

  public static IngredientsRepository provideIngredientsRepository(RecipesModule instance,
      GetIngredientsDataSource getIngredientsDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideIngredientsRepository(getIngredientsDataSource));
  }
}