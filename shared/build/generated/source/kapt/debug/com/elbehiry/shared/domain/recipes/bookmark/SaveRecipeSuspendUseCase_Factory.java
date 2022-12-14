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
public final class SaveRecipeSuspendUseCase_Factory implements Factory<SaveRecipeSuspendUseCase> {
  private final Provider<RecipesLocalDataStore> dataStoreProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public SaveRecipeSuspendUseCase_Factory(Provider<RecipesLocalDataStore> dataStoreProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.dataStoreProvider = dataStoreProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public SaveRecipeSuspendUseCase get() {
    return newInstance(dataStoreProvider.get(), ioDispatcherProvider.get());
  }

  public static SaveRecipeSuspendUseCase_Factory create(
      Provider<RecipesLocalDataStore> dataStoreProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new SaveRecipeSuspendUseCase_Factory(dataStoreProvider, ioDispatcherProvider);
  }

  public static SaveRecipeSuspendUseCase newInstance(RecipesLocalDataStore dataStore,
      CoroutineDispatcher ioDispatcher) {
    return new SaveRecipeSuspendUseCase(dataStore, ioDispatcher);
  }
}
