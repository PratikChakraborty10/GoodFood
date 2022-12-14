// Generated by Dagger (https://dagger.dev).
package com.elbehiry.delish.ui.onboarding;

import com.elbehiry.shared.domain.pref.OnBoardingCompleteActionSuspendUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OnBoardingViewModel_Factory implements Factory<OnBoardingViewModel> {
  private final Provider<OnBoardingCompleteActionSuspendUseCase> onBoardingCompleteActionUseCaseProvider;

  public OnBoardingViewModel_Factory(
      Provider<OnBoardingCompleteActionSuspendUseCase> onBoardingCompleteActionUseCaseProvider) {
    this.onBoardingCompleteActionUseCaseProvider = onBoardingCompleteActionUseCaseProvider;
  }

  @Override
  public OnBoardingViewModel get() {
    return newInstance(onBoardingCompleteActionUseCaseProvider.get());
  }

  public static OnBoardingViewModel_Factory create(
      Provider<OnBoardingCompleteActionSuspendUseCase> onBoardingCompleteActionUseCaseProvider) {
    return new OnBoardingViewModel_Factory(onBoardingCompleteActionUseCaseProvider);
  }

  public static OnBoardingViewModel newInstance(
      OnBoardingCompleteActionSuspendUseCase onBoardingCompleteActionUseCase) {
    return new OnBoardingViewModel(onBoardingCompleteActionUseCase);
  }
}
