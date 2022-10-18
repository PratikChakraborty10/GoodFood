// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.data.recipes.search.source;

import com.elbehiry.shared.data.recipes.search.remote.SearchDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchSource_Factory implements Factory<SearchSource> {
  private final Provider<SearchDataSource> searchDataSourceProvider;

  private final Provider<String> queryProvider;

  private final Provider<String> cuisineProvider;

  public SearchSource_Factory(Provider<SearchDataSource> searchDataSourceProvider,
      Provider<String> queryProvider, Provider<String> cuisineProvider) {
    this.searchDataSourceProvider = searchDataSourceProvider;
    this.queryProvider = queryProvider;
    this.cuisineProvider = cuisineProvider;
  }

  @Override
  public SearchSource get() {
    return newInstance(searchDataSourceProvider.get(), queryProvider.get(), cuisineProvider.get());
  }

  public static SearchSource_Factory create(Provider<SearchDataSource> searchDataSourceProvider,
      Provider<String> queryProvider, Provider<String> cuisineProvider) {
    return new SearchSource_Factory(searchDataSourceProvider, queryProvider, cuisineProvider);
  }

  public static SearchSource newInstance(SearchDataSource searchDataSource, String query,
      String cuisine) {
    return new SearchSource(searchDataSource, query, cuisine);
  }
}
