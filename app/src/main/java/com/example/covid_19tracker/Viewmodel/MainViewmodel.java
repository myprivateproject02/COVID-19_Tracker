package com.example.covid_19tracker.Viewmodel;

import android.util.Log;

import androidx.databinding.BindingAdapter;
import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.covid_19tracker.R;
import com.example.covid_19tracker.model.worldModel.AllCases;
import com.example.covid_19tracker.model.worldModel.Country;
import com.example.covid_19tracker.repo.MainRepository;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class MainViewmodel extends ViewModel {

    private static final String TAG = "MainViewmodel";
    MainRepository repository;

    CompositeDisposable disposable = new CompositeDisposable();

    private MutableLiveData<AllCases> allCases = new MutableLiveData<>();

    private MutableLiveData<List<Country>> countrywiseData = new MutableLiveData<>();
    private MutableLiveData<List<Country>> countrywiseTodayData = new MutableLiveData<>();
    private MutableLiveData<List<Country>> countrywiseYesterdayData = new MutableLiveData<>();

    @ViewModelInject
    public MainViewmodel(MainRepository repository) {
        this.repository = repository;
    }


    public void fetchData() {
        repository.getCountryData()
                .subscribeOn(Schedulers.io())
                .map(countrywiseModel -> {
                    Log.e(TAG, "getCountryInfo: " + countrywiseModel.get(2).getCountryInfo().getFlag());
                    return countrywiseModel;
                }).observeOn(AndroidSchedulers.mainThread())
                .subscribe(countrywiseModel -> {
                    countrywiseData.setValue(countrywiseModel);
                    Log.e(TAG, "getCountrys: succsess ");
                }, error -> {
                    Log.e(TAG, "getCountrys: " + error.getMessage());
                });

        repository.getCountryTodayData()
                .subscribeOn(Schedulers.io())
                .map(countrywiseModel -> {
                    Log.e(TAG, "getCountryInfo: " + countrywiseModel.get(2).getCountryInfo().getFlag());
                    return countrywiseModel;
                }).observeOn(AndroidSchedulers.mainThread())
                .subscribe(countrywiseModel -> {
                    countrywiseTodayData.setValue(countrywiseModel);
                    Log.e(TAG, "getCountrys: succsess ");
                }, error -> {
                    Log.e(TAG, "getCountrys: " + error.getMessage());
                });

        repository.getCountryYesterdayData()
                .subscribeOn(Schedulers.io())
                .map(countrywiseModel -> {
                    Log.e(TAG, "getCountryInfo: " + countrywiseModel.get(2).getCountryInfo().getFlag());
                    return countrywiseModel;
                }).observeOn(AndroidSchedulers.mainThread())
                .subscribe(countrywiseModel -> {
                    countrywiseYesterdayData.setValue(countrywiseModel);
                    Log.e(TAG, "getCountrys: succsess ");
                }, error -> {
                    Log.e(TAG, "getCountrys: " + error.getMessage());
                });
    }


    public LiveData<AllCases> getAllCases() {
        repository.getAllCases()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(world -> {
                    allCases.setValue(world);
                }, error -> {
                    Log.e("allCoronaCases", "getAllData: " + error.getMessage());
                });
        return allCases;
    }


    @BindingAdapter({"app:imageUrl"})
    public static void loadImage(CircleImageView view, String url) {
        Log.e(TAG, "loadImage: " + url);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.ic_broken_image_24);
        requestOptions.error(R.drawable.ic_broken_image_24);
        // Load image
        Glide.with(view.getContext())
                .load(url)
                .apply(requestOptions)
                .into(view);

    }


    public LiveData<List<Country>> getCountrys() {
        return countrywiseData;
    }


    public LiveData<List<Country>> getCountryTodayData() {
        return countrywiseTodayData;
    }

    public LiveData<List<Country>> getCountryYesterdayData() {
        return countrywiseYesterdayData;
    }


    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
        disposable.dispose();
    }
}

