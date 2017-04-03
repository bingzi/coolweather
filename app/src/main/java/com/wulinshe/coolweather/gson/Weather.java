package com.wulinshe.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public  Suggsetion suggsetion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
