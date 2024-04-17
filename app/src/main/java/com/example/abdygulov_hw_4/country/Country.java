package com.example.abdygulov_hw_4.country;

public class Country {

    private String flag;
    private String countryName;

    public Country(String flag, String countryName) {
        this.flag = flag;
        this.countryName = countryName;
    }

    public String getFlag() {
        return flag;
    }

    public String getCountryName() {
        return countryName;
    }
}
