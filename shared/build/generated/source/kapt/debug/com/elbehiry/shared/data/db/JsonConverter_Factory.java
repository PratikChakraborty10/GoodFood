// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.data.db;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class JsonConverter_Factory implements Factory<JsonConverter> {
  private final Provider<Moshi> moshiProvider;

  public JsonConverter_Factory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public JsonConverter get() {
    return newInstance(moshiProvider.get());
  }

  public static JsonConverter_Factory create(Provider<Moshi> moshiProvider) {
    return new JsonConverter_Factory(moshiProvider);
  }

  public static JsonConverter newInstance(Moshi moshi) {
    return new JsonConverter(moshi);
  }
}
