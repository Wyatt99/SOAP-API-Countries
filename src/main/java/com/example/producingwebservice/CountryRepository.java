package com.example.producingwebservice;

import io.spring.guides.gs_producing_web_service.*;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private Map<String, Country> countries;

	public void loadData(Map<String, Country> countries){
		this.countries = countries;
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}

	public List<Country> getAllCountries(){
		return  countries.values().stream().toList();
	}
}
