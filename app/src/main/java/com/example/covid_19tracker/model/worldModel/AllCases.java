package com.example.covid_19tracker.model.worldModel;

import com.google.gson.annotations.Expose;

public class AllCases {

    @Expose
    private long recovered;
    @Expose
    private long deaths;
    @Expose
    private long cases;

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getCases() {
        return cases;
    }

    public void setCases(long cases) {
        this.cases = cases;
    }
}
