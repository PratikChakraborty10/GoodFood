// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.domain.recipes.bookmark;

import com.elbehiry.shared.data.db.datastore.RecipesLocalDataStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetSavedRecipesUseCase_Factory implements Factory<GetSavedRecipesUseCase> {
  private final Provider<RecipesLocalDataStore> dataStoreProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public GetSavedRecipesUseCase_Factory(Provider<RecipesLocalDataStore> dataStoreProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.dataStoreProvider = dataStoreProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public GetSavedRecipesUseCase get() {
    return newInstance(dataStoreProvider.get(), ioDispatcherProvider.get());
  }

  public static GetSavedRecipesUseCase_Factory create(
      Provider<RecipesLocalDataStore> dataStoreProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new GetSavedRecipesUseCase_Factory(dataStoreProvider, ioDispatcherProvider);
  }

  public static GetSavedRecipesUseCase newInstance(RecipesLocalDataStore dataStore,
      CoroutineDispatcher ioDispatcher) {
    return new GetSavedRecipesUseCase(dataStore, ioDispatcher);
  }
}
