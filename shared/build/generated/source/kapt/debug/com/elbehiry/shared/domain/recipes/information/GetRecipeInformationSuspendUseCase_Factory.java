// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.domain.recipes.information;

import com.elbehiry.shared.data.recipes.info.repository.RecipeInformationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetRecipeInformationSuspendUseCase_Factory implements Factory<GetRecipeInformationSuspendUseCase> {
  private final Provider<RecipeInformationRepository> recipeInformationRepositoryProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public GetRecipeInformationSuspendUseCase_Factory(
      Provider<RecipeInformationRepository> recipeInformationRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.recipeInformationRepositoryProvider = recipeInformationRepositoryProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public GetRecipeInformationSuspendUseCase get() {
    return newInstance(recipeInformationRepositoryProvider.get(), ioDispatcherProvider.get());
  }

  public static GetRecipeInformationSuspendUseCase_Factory create(
      Provider<RecipeInformationRepository> recipeInformationRepositoryProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new GetRecipeInformationSuspendUseCase_Factory(recipeInformationRepositoryProvider, ioDispatcherProvider);
  }

  public static GetRecipeInformationSuspendUseCase newInstance(
      RecipeInformationRepository recipeInformationRepository, CoroutineDispatcher ioDispatcher) {
    return new GetRecipeInformationSuspendUseCase(recipeInformationRepository, ioDispatcher);
  }
}