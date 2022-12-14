// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.domain.pref;

import com.elbehiry.shared.data.pref.repository.DataStoreOperations;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OnBoardingCompleteActionSuspendUseCase_Factory implements Factory<OnBoardingCompleteActionSuspendUseCase> {
  private final Provider<DataStoreOperations> dataStoreRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public OnBoardingCompleteActionSuspendUseCase_Factory(
      Provider<DataStoreOperations> dataStoreRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public OnBoardingCompleteActionSuspendUseCase get() {
    return newInstance(dataStoreRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static OnBoardingCompleteActionSuspendUseCase_Factory create(
      Provider<DataStoreOperations> dataStoreRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new OnBoardingCompleteActionSuspendUseCase_Factory(dataStoreRepositoryProvider, dispatcherProvider);
  }

  public static OnBoardingCompleteActionSuspendUseCase newInstance(
      DataStoreOperations dataStoreRepository, CoroutineDispatcher dispatcher) {
    return new OnBoardingCompleteActionSuspendUseCase(dataStoreRepository, dispatcher);
  }
}
