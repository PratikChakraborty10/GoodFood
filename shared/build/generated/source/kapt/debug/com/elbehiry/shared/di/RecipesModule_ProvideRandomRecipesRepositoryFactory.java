// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.recipes.random.remote.RandomRecipesRemoteDataSource;
import com.elbehiry.shared.data.recipes.random.repository.RandomRecipesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesModule_ProvideRandomRecipesRepositoryFactory implements Factory<RandomRecipesRepository> {
  private final RecipesModule module;

  private final Provider<RandomRecipesRemoteDataSource> randomRecipesRemoteDataSourceProvider;

  public RecipesModule_ProvideRandomRecipesRepositoryFactory(RecipesModule module,
      Provider<RandomRecipesRemoteDataSource> randomRecipesRemoteDataSourceProvider) {
    this.module = module;
    this.randomRecipesRemoteDataSourceProvider = randomRecipesRemoteDataSourceProvider;
  }

  @Override
  public RandomRecipesRepository get() {
    return provideRandomRecipesRepository(module, randomRecipesRemoteDataSourceProvider.get());
  }

  public static RecipesModule_ProvideRandomRecipesRepositoryFactory create(RecipesModule module,
      Provider<RandomRecipesRemoteDataSource> randomRecipesRemoteDataSourceProvider) {
    return new RecipesModule_ProvideRandomRecipesRepositoryFactory(module, randomRecipesRemoteDataSourceProvider);
  }

  public static RandomRecipesRepository provideRandomRecipesRepository(RecipesModule instance,
      RandomRecipesRemoteDataSource randomRecipesRemoteDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideRandomRecipesRepository(randomRecipesRemoteDataSource));
  }
}
