package com.example.producingwebservice;

import com.example.producingwebservice.countrybuilder.CountryBuilder;
import io.spring.guides.gs_producing_web_service.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {
    private CountryRepository countryRepository;

    public DataLoader(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
       Map<String, Country> countries = new HashMap<>();

        Country spain = CountryBuilder.Build("Spain","Madrid",Currency.EUR,
                46704314,505990,4964,"temperate");
        countries.put(spain.getName(), spain);

        Country poland = CountryBuilder.Build("Poland","Warsaw",Currency.PLN,
                38186860,312680,440,"moderate");
        countries.put(poland.getName(), poland);

        Country uk = CountryBuilder.Build("United Kingdom","London",Currency.GBP,
                63705000,248532,12429,"maritime");
        countries.put(uk.getName(), uk);

        countryRepository.loadData(countries);
    }
}
