// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.data.recipes.ingredients.remote;

import com.elbehiry.shared.data.remote.DelishApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetIngredientsRemoteDataSource_Factory implements Factory<GetIngredientsRemoteDataSource> {
  private final Provider<DelishApi> apiProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public GetIngredientsRemoteDataSource_Factory(Provider<DelishApi> apiProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.apiProvider = apiProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public GetIngredientsRemoteDataSource get() {
    return newInstance(apiProvider.get(), ioDispatcherProvider.get());
  }

  public static GetIngredientsRemoteDataSource_Factory create(Provider<DelishApi> apiProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new GetIngredientsRemoteDataSource_Factory(apiProvider, ioDispatcherProvider);
  }

  public static GetIngredientsRemoteDataSource newInstance(DelishApi api,
      CoroutineDispatcher ioDispatcher) {
    return new GetIngredientsRemoteDataSource(api, ioDispatcher);
  }
}