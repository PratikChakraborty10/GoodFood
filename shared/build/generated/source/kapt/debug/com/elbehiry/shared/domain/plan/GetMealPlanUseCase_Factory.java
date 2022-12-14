// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.domain.plan;

import com.elbehiry.shared.data.plan.repository.GetMealPlanRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetMealPlanUseCase_Factory implements Factory<GetMealPlanUseCase> {
  private final Provider<GetMealPlanRepository> getMealPlanRepositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public GetMealPlanUseCase_Factory(Provider<GetMealPlanRepository> getMealPlanRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.getMealPlanRepositoryProvider = getMealPlanRepositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public GetMealPlanUseCase get() {
    return newInstance(getMealPlanRepositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static GetMealPlanUseCase_Factory create(
      Provider<GetMealPlanRepository> getMealPlanRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new GetMealPlanUseCase_Factory(getMealPlanRepositoryProvider, ioDispatcherProvider);
  }

  public static GetMealPlanUseCase newInstance(GetMealPlanRepository getMealPlanRepository,
      CoroutineDispatcher ioDispatcher) {
    return new GetMealPlanUseCase(getMealPlanRepository, ioDispatcher);
  }
}
