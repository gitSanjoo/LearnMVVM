package com.sanjoo.learnmvvm.retrofit.models;

public class Geo {

    private String lat;
    private String lng;

    public Geo() {
    }

    public Geo(String lat, String lng) {
        super();
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

}
