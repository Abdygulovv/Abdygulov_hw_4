package com.example.abdygulov_hw_4.continent;

public class Continent {
    private String imgContinent;
    private String continentName;

    public Continent(String imgContinent, String continentName) {
        this.imgContinent = imgContinent;
        this.continentName = continentName;
    }

    public String getImgContinent() {
        return imgContinent;
    }

    public String getContinentName() {
        return continentName;
    }
}
