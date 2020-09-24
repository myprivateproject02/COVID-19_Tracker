package com.example.covid_19tracker.repo;

import com.example.covid_19tracker.model.worldModel.AllCases;
import com.example.covid_19tracker.model.worldModel.Country;

import com.example.covid_19tracker.model.worldModel.Country;

import com.example.covid_19tracker.network.WorldLiveService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;


public class MainRepository {

    private static final String TAG = "MainRepository";
    private WorldLiveService worldLiveService;


    @Inject
    public MainRepository(WorldLiveService worldLiveService) {
        this.worldLiveService = worldLiveService;
    }

    public Observable<AllCases> getAllCases() {
        return worldLiveService.getAllCases();
    }

    public Observable<List<Country>> getCountryData() {
        return worldLiveService.getCountryData("cases");
    }

    public Observable<List<Country>> getCountryTodayData() {
        return worldLiveService.getCountryTodayData();
    }

//    getCountryYesterdayData

    public Observable<List<Country>> getCountryYesterdayData() {
        return worldLiveService.getCountryYesterdayData("cases");
    }


}
