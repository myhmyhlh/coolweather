package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by D22397 on 2017/12/25.
 *
 * 数据表 市：city 对应实体类
 *
 */

public class City extends DataSupport {

    private int id;

    private String cityName; // 市的名字

    private int cityCode; // 市的代号

    private int provinceId; // 当前市所属省的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

