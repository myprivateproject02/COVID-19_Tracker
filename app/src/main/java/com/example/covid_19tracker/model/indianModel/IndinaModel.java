package com.example.covid_19tracker.model.indianModel;

import com.google.gson.annotations.Expose;

import java.util.List;

public class IndinaModel {

    @Expose
    private List<Cases_time_series> cases_time_series;

    @Expose
    private List<Statewise> statewise;

    @Expose
    private List<Tested> tested;


    public IndinaModel(List<Cases_time_series> cases_time_series, List<Statewise> statewise, List<Tested> tested) {
        this.cases_time_series = cases_time_series;
        this.statewise = statewise;
        this.tested = tested;
    }

    public List<Cases_time_series> getCases_time_series() {
        return cases_time_series;
    }

    public List<Statewise> getStatewise() {
        return statewise;
    }

    public void setStatewise(List<Statewise> statewise) {
        this.statewise = statewise;
    }

    public List<Tested> getTested() {
        return tested;
    }

    public void setTested(List<Tested> tested) {
        this.tested = tested;
    }

    @Override
    public String toString() {
        return "IndinaModel{" +
                "cases_time_series=" + cases_time_series +
                ", statewise=" + statewise +
                ", tested=" + tested +
                '}';
    }
}
