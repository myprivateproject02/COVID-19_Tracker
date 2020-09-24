package com.example.covid_19tracker.model.indianModel;

import com.google.gson.annotations.Expose;

public class Tested {
    @Expose
    private String dailyrtpcrtests;
    @Expose
    private String individualstestedperconfirmedcase;
    @Expose
    private String positivecasesfromsamplesreported;
    @Expose
    private String samplereportedtoday;
    @Expose
    private String source;
    @Expose
    private String source1;
    @Expose
    private String source3;
    @Expose
    private String testedasof;
    @Expose
    private String testpositivityrate;
    @Expose
    private String testsconductedbyprivatelabs;
    @Expose
    private String testsperconfirmedcase;
    @Expose
    private String testspermillion;
    @Expose
    private String totalindividualstested;
    @Expose
    private String totalpositivecases;
    @Expose
    private String totalrtpcrtests;
    @Expose
    private String totalsamplestested;
    @Expose
    private String updatetimestamp;

    public Tested(String dailyrtpcrtests, String individualstestedperconfirmedcase, String positivecasesfromsamplesreported, String samplereportedtoday, String source, String source1, String source3, String testedasof, String testpositivityrate, String testsconductedbyprivatelabs, String testsperconfirmedcase, String testspermillion, String totalindividualstested, String totalpositivecases, String totalrtpcrtests, String totalsamplestested, String updatetimestamp) {
        this.dailyrtpcrtests = dailyrtpcrtests;
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        this.samplereportedtoday = samplereportedtoday;
        this.source = source;
        this.source1 = source1;
        this.source3 = source3;
        this.testedasof = testedasof;
        this.testpositivityrate = testpositivityrate;
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        this.testsperconfirmedcase = testsperconfirmedcase;
        this.testspermillion = testspermillion;
        this.totalindividualstested = totalindividualstested;
        this.totalpositivecases = totalpositivecases;
        this.totalrtpcrtests = totalrtpcrtests;
        this.totalsamplestested = totalsamplestested;
        this.updatetimestamp = updatetimestamp;
    }

    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public String getDailyrtpcrtests() {
        return dailyrtpcrtests;
    }

    public void setDailyrtpcrtests(String dailyrtpcrtests) {
        this.dailyrtpcrtests = dailyrtpcrtests;
    }

    public String getIndividualstestedperconfirmedcase() {
        return individualstestedperconfirmedcase;
    }

    public void setIndividualstestedperconfirmedcase(String individualstestedperconfirmedcase) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
    }

    public String getPositivecasesfromsamplesreported() {
        return positivecasesfromsamplesreported;
    }

    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    public String getSamplereportedtoday() {
        return samplereportedtoday;
    }

    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getSource3() {
        return source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    public String getTestedasof() {
        return testedasof;
    }

    public void setTestedasof(String testedasof) {
        this.testedasof = testedasof;
    }

    public String getTestpositivityrate() {
        return testpositivityrate;
    }

    public void setTestpositivityrate(String testpositivityrate) {
        this.testpositivityrate = testpositivityrate;
    }

    public String getTestsconductedbyprivatelabs() {
        return testsconductedbyprivatelabs;
    }

    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    public String getTestsperconfirmedcase() {
        return testsperconfirmedcase;
    }

    public void setTestsperconfirmedcase(String testsperconfirmedcase) {
        this.testsperconfirmedcase = testsperconfirmedcase;
    }

    public String getTestspermillion() {
        return testspermillion;
    }

    public void setTestspermillion(String testspermillion) {
        this.testspermillion = testspermillion;
    }

    public String getTotalindividualstested() {
        return totalindividualstested;
    }

    public void setTotalindividualstested(String totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    public String getTotalpositivecases() {
        return totalpositivecases;
    }

    public void setTotalpositivecases(String totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    public String getTotalrtpcrtests() {
        return totalrtpcrtests;
    }

    public void setTotalrtpcrtests(String totalrtpcrtests) {
        this.totalrtpcrtests = totalrtpcrtests;
    }

    public String getTotalsamplestested() {
        return totalsamplestested;
    }

    public void setTotalsamplestested(String totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    @Override
    public String toString() {
        return "Tested{" +
                "dailyrtpcrtests='" + dailyrtpcrtests + '\'' +
                ", individualstestedperconfirmedcase='" + individualstestedperconfirmedcase + '\'' +
                ", positivecasesfromsamplesreported='" + positivecasesfromsamplesreported + '\'' +
                ", samplereportedtoday='" + samplereportedtoday + '\'' +
                ", source='" + source + '\'' +
                ", source1='" + source1 + '\'' +
                ", source3='" + source3 + '\'' +
                ", testedasof='" + testedasof + '\'' +
                ", testpositivityrate='" + testpositivityrate + '\'' +
                ", testsconductedbyprivatelabs='" + testsconductedbyprivatelabs + '\'' +
                ", testsperconfirmedcase='" + testsperconfirmedcase + '\'' +
                ", testspermillion='" + testspermillion + '\'' +
                ", totalindividualstested='" + totalindividualstested + '\'' +
                ", totalpositivecases='" + totalpositivecases + '\'' +
                ", totalrtpcrtests='" + totalrtpcrtests + '\'' +
                ", totalsamplestested='" + totalsamplestested + '\'' +
                ", updatetimestamp='" + updatetimestamp + '\'' +
                '}';
    }
}
