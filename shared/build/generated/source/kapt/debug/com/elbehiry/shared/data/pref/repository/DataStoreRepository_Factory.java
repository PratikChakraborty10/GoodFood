// Generated by Dagger (https://dagger.dev).
package com.elbehiry.shared.data.pref.repository;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataStoreRepository_Factory implements Factory<DataStoreRepository> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public DataStoreRepository_Factory(Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public DataStoreRepository get() {
    return newInstance(dataStoreProvider.get());
  }

  public static DataStoreRepository_Factory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new DataStoreRepository_Factory(dataStoreProvider);
  }

  public static DataStoreRepository newInstance(DataStore<Preferences> dataStore) {
    return new DataStoreRepository(dataStore);
  }
}
