package com.example.pr14.entity;

public class PostOffice {
    String name;

    @Override
    public String toString() {
        return "PostOffice{" +
                "name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public PostOffice() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    String cityName;
}
