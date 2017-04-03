package com.wulinshe.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/1/24.
 * countryName 县的名字；
 * weatherId对应天气的id；
 * 
 * 
 */

public class Country extends DataSupport {
    private  int id;
    private  String countryName;
    private String weatherId;
    private int cityId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getcityId() {
        return  cityId;
    }

    public void setcityId(int cityId) {
        this. cityId = cityId;
    }
}
