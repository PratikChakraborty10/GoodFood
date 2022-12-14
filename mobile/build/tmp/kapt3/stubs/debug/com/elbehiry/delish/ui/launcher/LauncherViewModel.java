package com.elbehiry.delish.ui.launcher;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/elbehiry/delish/ui/launcher/LauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "onBoardingCompletedUseCase", "Lcom/elbehiry/shared/domain/pref/OnBoardingCompletedUseCase;", "(Lcom/elbehiry/shared/domain/pref/OnBoardingCompletedUseCase;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/elbehiry/delish/ui/launcher/LauncherViewState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getLaunchDestination", "", "mobile_debug"})
public final class LauncherViewModel extends androidx.lifecycle.ViewModel {
    private final com.elbehiry.shared.domain.pref.OnBoardingCompletedUseCase onBoardingCompletedUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.elbehiry.delish.ui.launcher.LauncherViewState> _state = null;
    
    @javax.inject.Inject()
    public LauncherViewModel(@org.jetbrains.annotations.NotNull()
    com.elbehiry.shared.domain.pref.OnBoardingCompletedUseCase onBoardingCompletedUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.elbehiry.delish.ui.launcher.LauncherViewState> getState() {
        return null;
    }
    
    private final void getLaunchDestination() {
    }
}