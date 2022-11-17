package com.ey.insurance_service.controllers;

import com.ey.insurance_service.entities.Filter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

    @GetMapping("/filter")
    public Filter filterclass(){
        return new Filter("val1","val2","val3");

    }
    @GetMapping("/filte")
    public MappingJacksonValue filtering(){
        Filter f = new Filter("val1","val2","val3");
        MappingJacksonValue map = new MappingJacksonValue(f);
        SimpleBeanPropertyFilter filt = SimpleBeanPropertyFilter.filterOutAllExcept("val1","val2");
        FilterProvider filter = new SimpleFilterProvider().addFilter("SomeFilter",filt);
        map.setFilters(filter);
        return map;
    }

}
