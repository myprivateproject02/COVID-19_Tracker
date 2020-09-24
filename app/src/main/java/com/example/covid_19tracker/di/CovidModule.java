package com.example.covid_19tracker.di;

import com.example.covid_19tracker.network.IndianLiveService;
import com.example.covid_19tracker.network.WorldLiveService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.Util;
import retrofit2.Retrofit;

import retrofit2.converter.gson.GsonConverterFactory;


@Module
@InstallIn(ApplicationComponent.class)
public class CovidModule {


    @Singleton
    @Provides
    @Named("gson")
    public Gson providerGsonBuilder() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(1200, TimeUnit.SECONDS)
            .connectTimeout(1200, TimeUnit.SECONDS)
            .build();

    /*-------------------     New Start   ------------------------------------------------------------*/


    //World LiveData
    @Singleton
    @Provides
    @Named("worldLive")
    public Retrofit.Builder provideWorldLiveModule(@Named("gson") Gson gson) {
        return new Retrofit.Builder()
                .baseUrl("https://corona.lmao.ninja/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson));
    }

    @Provides
    public WorldLiveService providerWorldLiveService(@Named("worldLive") Retrofit.Builder retrofit) {
        return retrofit.build().create(WorldLiveService.class);
    }


    @Singleton
    @Provides
    @Named("indian")
    public Retrofit.Builder provideIndinaService(@Named("gson") Gson gson) {
        return new Retrofit.Builder().baseUrl("https://api.covid19india.org")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson));
    }

    @Singleton
    @Provides
    public IndianLiveService IndianLiveService(@Named("indian") Retrofit.Builder retrofit) {
        return retrofit.build().create(IndianLiveService.class);
    }


}
