package com.example.abdygulov_hw_4.country;

public class Country {

    private String imgCountry;
    private String countryName;

    public Country(String imgCountry, String countryName) {
        this.imgCountry = imgCountry;
        this.countryName = countryName;
    }

    public String getImgCountry() {
        return imgCountry;
    }

    public String getCountryName() {
        return countryName;
    }
}
