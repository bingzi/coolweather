package com.wulinshe.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/23.
 */

public class Suggsetion {

    @SerializedName("comf")
    public  Comfort comfort;

    @SerializedName("cw")
     public  CarWash carWash;
    public  Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("info")
        public  String info;
    }

    public class  Sport{
        @SerializedName("txt")
        public String info;
    }

}