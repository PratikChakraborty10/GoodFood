// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.domain.restaurants;

import com.elbehiry.shared.data.restaurants.repository.ISearchRestaurantsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchRestaurantsUseCase_Factory implements Factory<SearchRestaurantsUseCase> {
  private final Provider<ISearchRestaurantsRepository> searchRepositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public SearchRestaurantsUseCase_Factory(
      Provider<ISearchRestaurantsRepository> searchRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.searchRepositoryProvider = searchRepositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public SearchRestaurantsUseCase get() {
    return newInstance(searchRepositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static SearchRestaurantsUseCase_Factory create(
      Provider<ISearchRestaurantsRepository> searchRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new SearchRestaurantsUseCase_Factory(searchRepositoryProvider, ioDispatcherProvider);
  }

  public static SearchRestaurantsUseCase newInstance(ISearchRestaurantsRepository searchRepository,
      CoroutineDispatcher ioDispatcher) {
    return new SearchRestaurantsUseCase(searchRepository, ioDispatcher);
  }
}
