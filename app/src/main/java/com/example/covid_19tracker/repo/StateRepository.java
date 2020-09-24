package com.example.covid_19tracker.repo;

import com.example.covid_19tracker.model.indianModel.IndinaModel;
import com.example.covid_19tracker.network.IndianLiveService;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;

public class StateRepository {

    private static final String TAG = "StateRepository";
    private IndianLiveService indianLiveService;

    @Inject
    public StateRepository(IndianLiveService indianLiveService) {
        this.indianLiveService = indianLiveService;
    }

    public Observable<IndinaModel> getIndinaData() {
        return indianLiveService.getIndinaData();
    }




}
