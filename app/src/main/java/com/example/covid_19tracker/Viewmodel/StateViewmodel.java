package com.example.covid_19tracker.Viewmodel;

import android.util.Log;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.covid_19tracker.model.indianModel.IndinaModel;
import com.example.covid_19tracker.repo.StateRepository;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class StateViewmodel extends ViewModel {

    private static final String TAG = "StateViewmodel";
    StateRepository repository;
    CompositeDisposable disposable = new CompositeDisposable();
    public MutableLiveData<IndinaModel> indinaLiveData = new MutableLiveData<>();


    @ViewModelInject
    public StateViewmodel(StateRepository repository) {
        this.repository = repository;
    }


    public void fetchData() {
        repository.getIndinaData()
                .subscribeOn(Schedulers.io())
//                .map(indinaModel -> {
//                    indinaData = indinaModel;
//                    return indinaData;
//                })

                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(indinaModel -> {
                    indinaLiveData.setValue(indinaModel);
                    Log.e(TAG, "fetchData: " + indinaLiveData.getValue().getStatewise().size());
                }, error -> {
                    Log.e(TAG, "getCountrys: " + error.getMessage());
                });

//                .subscribe(indinaModelMutableLiveData -> {
//                    indinaLiveData.setValue(indinaModelMutableLiveData);
//                    Log.e(TAG, "fetchData: "+indinaLiveData.getValue().getStatewises().get(1).getState() );
//                }, error -> {
//                    Log.e(TAG, "getCountrys: " + error.getMessage());
//                });

    }

    public LiveData<IndinaModel> getIndianData() {
        return indinaLiveData;
    }


    @Override
    protected void onCleared() {
        super.onCleared();
    }


}
