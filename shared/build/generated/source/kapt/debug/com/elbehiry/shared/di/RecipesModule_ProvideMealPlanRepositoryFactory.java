// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.elbehiry.shared.data.plan.remote.MealPlanDataSource;
import com.elbehiry.shared.data.plan.repository.MealPlanRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesModule_ProvideMealPlanRepositoryFactory implements Factory<MealPlanRepository> {
  private final RecipesModule module;

  private final Provider<MealPlanDataSource> mealPlanDataSourceProvider;

  public RecipesModule_ProvideMealPlanRepositoryFactory(RecipesModule module,
      Provider<MealPlanDataSource> mealPlanDataSourceProvider) {
    this.module = module;
    this.mealPlanDataSourceProvider = mealPlanDataSourceProvider;
  }

  @Override
  public MealPlanRepository get() {
    return provideMealPlanRepository(module, mealPlanDataSourceProvider.get());
  }

  public static RecipesModule_ProvideMealPlanRepositoryFactory create(RecipesModule module,
      Provider<MealPlanDataSource> mealPlanDataSourceProvider) {
    return new RecipesModule_ProvideMealPlanRepositoryFactory(module, mealPlanDataSourceProvider);
  }

  public static MealPlanRepository provideMealPlanRepository(RecipesModule instance,
      MealPlanDataSource mealPlanDataSource) {
    return Preconditions.checkNotNullFromProvides(instance.provideMealPlanRepository(mealPlanDataSource));
  }
}
