package com.example.covid_19tracker.network;

import com.example.covid_19tracker.model.worldModel.Country;
import com.example.covid_19tracker.model.worldModel.AllCases;
import com.example.covid_19tracker.model.worldModel.Country;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WorldLiveService {

    @GET("v2/all")
    Observable<AllCases> getAllCases();

    @GET("v3/covid-19/countries/null")
    Observable<List<Country>> getCountryData(
            @Query("sort") String cases
    );

    @GET("v3/covid-19/countries?sort=todayCases")
    Observable<List<Country>> getCountryTodayData(
//            @Query("sort") String todayCases
    );

    @GET("v3/covid-19/countries?yesterday=true")
    Observable<List<Country>> getCountryYesterdayData(
            @Query("sort") String todayCases
    );

}
