// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.restaurants.remote.ISearchRestaurantsDataSource;
import com.elbehiry.shared.data.restaurants.repository.ISearchRestaurantsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapModule_ProvideSearchRepositoryFactory implements Factory<ISearchRestaurantsRepository> {
  private final MapModule module;

  private final Provider<ISearchRestaurantsDataSource> searchDataSourceProvider;

  public MapModule_ProvideSearchRepositoryFactory(MapModule module,
      Provider<ISearchRestaurantsDataSource> searchDataSourceProvider) {
    this.module = module;
    this.searchDataSourceProvider = searchDataSourceProvider;
  }

  @Override
  public ISearchRestaurantsRepository get() {
    return provideSearchRepository(module, searchDataSourceProvider.get());
  }

  public static MapModule_ProvideSearchRepositoryFactory create(MapModule module,
      Provider<ISearchRestaurantsDataSource> searchDataSourceProvider) {
    return new MapModule_ProvideSearchRepositoryFactory(module, searchDataSourceProvider);
  }

  public static ISearchRestaurantsRepository provideSearchRepository(MapModule instance,
      ISearchRestaurantsDataSource searchDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideSearchRepository(searchDataSource));
  }
}
