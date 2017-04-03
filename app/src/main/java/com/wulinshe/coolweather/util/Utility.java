package com.wulinshe.coolweather.util;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.wulinshe.coolweather.db.City;
import com.wulinshe.coolweather.db.Country;
import com.wulinshe.coolweather.db.Province;
import com.wulinshe.coolweather.gson.Weather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Created by Administrator on 2017/1/26.
 * 解析和处理服务器返回的省数据；
 */


public class Utility {
    /**
     * Created by Administrator on 2017/1/26.
     * 解析和处理服务器返回的省数据；
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {

                JSONArray allProvinces = new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provineceObject= allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(provineceObject.getString("name"));
                    province.setProvinceCode(provineceObject.getInt("id"));
                    province.save();
                }
                return true;
            }
            catch (JSONException e) {
                e.printStackTrace();

            }

        }
        return false;
    }
//
//    解析和处理服务器返回的市级数据
//

    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObject= allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
//    解析和处理服务器返回的县级数据
    public static  boolean handleContryResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for(int i=0;i<allCounties.length();i++){
                    JSONObject countryObject= allCounties.getJSONObject(i);
                    Country country=new Country();
                    country.setCountryName(countryObject.getString("name"));
                    country.setWeatherId(countryObject.getString("weather_id"));
                    country.setcityId(cityId);
                    country.save();
                }
                return true;
            }
            catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static Weather handleWeatherResponse(String response){
       try{
           JSONObject jsonObject=new JSONObject(response);
           JSONArray jsonArray=jsonObject.getJSONArray("HeWeather");
           String weatherContent=jsonArray.getJSONObject(0).toString();
           return new Gson().fromJson(weatherContent,Weather.class);

    }catch (Exception e){
           e.printStackTrace();
       }
        return null;

       }

}
