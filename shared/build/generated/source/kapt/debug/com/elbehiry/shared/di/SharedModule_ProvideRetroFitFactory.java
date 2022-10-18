// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.di;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedModule_ProvideRetroFitFactory implements Factory<Retrofit> {
  private final SharedModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Moshi> moshiProvider;

  public SharedModule_ProvideRetroFitFactory(SharedModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<Moshi> moshiProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetroFit(module, okHttpClientProvider.get(), moshiProvider.get());
  }

  public static SharedModule_ProvideRetroFitFactory create(SharedModule module,
      Provider<OkHttpClient> okHttpClientProvider, Provider<Moshi> moshiProvider) {
    return new SharedModule_ProvideRetroFitFactory(module, okHttpClientProvider, moshiProvider);
  }

  public static Retrofit provideRetroFit(SharedModule instance, OkHttpClient okHttpClient,
      Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetroFit(okHttpClient, moshi));
  }
}
