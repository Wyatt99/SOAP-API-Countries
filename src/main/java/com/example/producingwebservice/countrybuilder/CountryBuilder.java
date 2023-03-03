package com.example.producingwebservice.countrybuilder;

import io.spring.guides.gs_producing_web_service.*;

public class CountryBuilder {
    private static Area areaBuild(int km){
        Area area = new Area();
        area.setKilometers(km);
        area.setMiles((int)(km / 2.59));
        return area;
    }

    private static Coastline coastlineBuild(int km){
        Coastline coastline = new Coastline();
        coastline.setKilometers(km);
        coastline.setMiles((int) (km / 1.609));
        return coastline;
    }

    private static Geography geographyBuild(String climate, Area area, Coastline coastline){
        Geography geography = new Geography();
        geography.setClimate(climate);
        geography.setCoastline(coastline);
        geography.setArea(area);
        return geography;
    }

    public static Country Build(String name, String capital, Currency currency,
                                       int population,int areaKM,int coastKm,String climate){
        Country country = new Country();
        country.setName(name);
        country.setCapital(capital);
        country.setCurrency(currency);
        country.setPopulation(population);
        country.setGeography(geographyBuild(climate,areaBuild(areaKM),coastlineBuild(coastKm)));
        return country;
    }
}
