// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedModule_ProvideHttpLoggingInterceptor$shared_debugFactory implements Factory<Interceptor> {
  private final SharedModule module;

  public SharedModule_ProvideHttpLoggingInterceptor$shared_debugFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public Interceptor get() {
    return provideHttpLoggingInterceptor$shared_debug(module);
  }

  public static SharedModule_ProvideHttpLoggingInterceptor$shared_debugFactory create(
      SharedModule module) {
    return new SharedModule_ProvideHttpLoggingInterceptor$shared_debugFactory(module);
  }

  public static Interceptor provideHttpLoggingInterceptor$shared_debug(SharedModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideHttpLoggingInterceptor$shared_debug());
  }
}
