package com.example.covid_19tracker.network;

import com.example.covid_19tracker.model.indianModel.IndinaModel;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface IndianLiveService {


    @Headers({"Accept: application/json"})
    @GET("/data.json")
    Observable<IndinaModel> getIndinaData();


}
