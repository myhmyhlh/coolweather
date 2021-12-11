package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by D22397 on 2017/12/25.
 *
 * 数据表 县：county 对应实体类
 *
 */

public class County extends DataSupport {

    private int id;

    private String countyName; // 县的名字

    private String weatherId; // 县所对应天气的id

    private int cityId; // 当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

