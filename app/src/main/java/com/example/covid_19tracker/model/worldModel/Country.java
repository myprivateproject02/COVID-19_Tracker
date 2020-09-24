package com.example.covid_19tracker.model.worldModel;

import com.google.gson.annotations.Expose;

public class Country {


    @Expose
    private double deathsPerOneMillion;
    @Expose
    private double casesPerOneMillion;
    @Expose
    private long critical;
    @Expose
    private long active;
    @Expose
    private long recovered;
    @Expose
    private long todayDeaths;
    @Expose
    private long deaths;
    @Expose
    private long todayCases;
    @Expose
    private long cases;
    @Expose
    private CountryInfo countryInfo;
    @Expose
    private String country;

    public Country(double deathsPerOneMillion, double casesPerOneMillion, long critical, long active, long recovered, long todayDeaths, long deaths, long todayCases, long cases, CountryInfo countryInfo, String country) {
        this.deathsPerOneMillion = deathsPerOneMillion;
        this.casesPerOneMillion = casesPerOneMillion;
        this.critical = critical;
        this.active = active;
        this.recovered = recovered;
        this.todayDeaths = todayDeaths;
        this.deaths = deaths;
        this.todayCases = todayCases;
        this.cases = cases;
        this.countryInfo = countryInfo;
        this.country = country;
    }

    public static class CountryInfo {

        @Expose
        private String flag;

        @Expose
        private String iso3;
        @Expose
        private String iso2;
        @Expose
        private int _id;

        public CountryInfo(String flag, String iso3, String iso2, int _id) {
            this.flag = flag;
            this.iso3 = iso3;
            this.iso2 = iso2;
            this._id = _id;
        }


        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getIso3() {
            return iso3;
        }

        public void setIso3(String iso3) {
            this.iso3 = iso3;
        }

        public String getIso2() {
            return iso2;
        }

        public void setIso2(String iso2) {
            this.iso2 = iso2;
        }

        public int get_id() {
            return _id;
        }

        public void set_id(int _id) {
            this._id = _id;
        }

        @Override
        public String toString() {
            return "CountryInfo{" +
                    "flag='" + flag + '\'' +
                    ", iso3='" + iso3 + '\'' +
                    ", iso2='" + iso2 + '\'' +
                    ", _id=" + _id +
                    '}';
        }
    }


    public double getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(double deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public double getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(double casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public long getCritical() {
        return critical;
    }

    public void setCritical(long critical) {
        this.critical = critical;
    }

    public long getActive() {
        return active;
    }

    public void setActive(long active) {
        this.active = active;
    }

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(long todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(long todayCases) {
        this.todayCases = todayCases;
    }

    public long getCases() {
        return cases;
    }

    public void setCases(long cases) {
        this.cases = cases;
    }

    public CountryInfo getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(CountryInfo countryInfo) {
        this.countryInfo = countryInfo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "deathsPerOneMillion=" + deathsPerOneMillion +
                ", casesPerOneMillion=" + casesPerOneMillion +
                ", critical=" + critical +
                ", active=" + active +
                ", recovered=" + recovered +
                ", todayDeaths=" + todayDeaths +
                ", deaths=" + deaths +
                ", todayCases=" + todayCases +
                ", cases=" + cases +
                ", countryInfo=" + countryInfo +
                ", country='" + country + '\'' +
                '}';
    }
}
