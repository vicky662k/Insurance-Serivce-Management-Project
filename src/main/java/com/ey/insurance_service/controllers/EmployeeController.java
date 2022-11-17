package com.ey.insurance_service.controllers;


import com.ey.insurance_service.Service.EmployeeService;
import com.ey.insurance_service.entities.Employee;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class EmployeeController {
    @Autowired
    EmployeeService obj;
    @GetMapping("/getall")
    public List<Employee> getallemployees(){return obj.getallemployees();}
    @GetMapping("/getallid")
    public MappingJacksonValue filtering(){
        MappingJacksonValue map = new MappingJacksonValue(obj.getallemployees());
        SimpleBeanPropertyFilter filt = SimpleBeanPropertyFilter.filterOutAllExcept("empid");
        FilterProvider filter = new SimpleFilterProvider().addFilter("Filter",filt);
        map.setFilters(filter);
        return map;
    }
    @PostMapping("/addemp")
    public Employee addemployeee(@Valid @RequestBody Employee E){
        return obj.addemployee(E);
    }
    @DeleteMapping("/{empid}")
    public void delemployee(@PathVariable Integer empid){
         obj.delemp(empid);
    }
    @GetMapping("/{empid}")
    public Employee getbyid(@PathVariable Integer empid) {
        return obj.getbyid(empid);
    }
     @PutMapping("/update/{empid}")
     public Employee updateemployee(@PathVariable Integer empid,@RequestBody Employee E) throws Exception {
        return obj.update(empid,E);
        }
    }



