package com.wulinshe.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/2/23.
 */

public class Now {
    @SerializedName("tmp")
    public  String temperatur;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public  String info;

    }

}
