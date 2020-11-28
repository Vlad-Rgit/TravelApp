// Generated by Dagger (https://dagger.dev).
package com.example.travelapp.di.modules;

import com.example.common.data.repos.CityRepo;
import com.example.common.interactors.GetAllCities;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InteractorsModule_ProvideGetAllCitiesFactory implements Factory<GetAllCities> {
  private final InteractorsModule module;

  private final Provider<CityRepo> cityRepoProvider;

  public InteractorsModule_ProvideGetAllCitiesFactory(InteractorsModule module,
      Provider<CityRepo> cityRepoProvider) {
    this.module = module;
    this.cityRepoProvider = cityRepoProvider;
  }

  @Override
  public GetAllCities get() {
    return provideGetAllCities(module, cityRepoProvider.get());
  }

  public static InteractorsModule_ProvideGetAllCitiesFactory create(InteractorsModule module,
      Provider<CityRepo> cityRepoProvider) {
    return new InteractorsModule_ProvideGetAllCitiesFactory(module, cityRepoProvider);
  }

  public static GetAllCities provideGetAllCities(InteractorsModule instance, CityRepo cityRepo) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetAllCities(cityRepo));
  }
}