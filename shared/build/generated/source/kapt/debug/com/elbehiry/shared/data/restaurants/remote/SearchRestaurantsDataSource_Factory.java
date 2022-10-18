// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.data.restaurants.remote;

import com.elbehiry.shared.data.remote.DelishApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchRestaurantsDataSource_Factory implements Factory<SearchRestaurantsDataSource> {
  private final Provider<DelishApi> apiProvider;

  public SearchRestaurantsDataSource_Factory(Provider<DelishApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public SearchRestaurantsDataSource get() {
    return newInstance(apiProvider.get());
  }

  public static SearchRestaurantsDataSource_Factory create(Provider<DelishApi> apiProvider) {
    return new SearchRestaurantsDataSource_Factory(apiProvider);
  }

  public static SearchRestaurantsDataSource newInstance(DelishApi api) {
    return new SearchRestaurantsDataSource(api);
  }
}
