package com.example.travelapp.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/travelapp/di/modules/RetrofitModule;", "", "()V", "provideCityDataSource", "Lcom/example/common/data/data_sources/CityDataSource;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "app_debug"})
@dagger.Module()
public final class RetrofitModule {
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.common.data.data_sources.CityDataSource provideCityDataSource(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public RetrofitModule() {
        super();
    }
}