package com.ey.insurance_service.controllers;

import com.ey.insurance_service.entities.Name;
import com.ey.insurance_service.entities.PersonV1;
import com.ey.insurance_service.entities.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionPersonController {
    @GetMapping("/v1")
    public PersonV1 personV1(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping("/v2")
    public PersonV2 personV2(){
        return new PersonV2(new Name("Bob","Charlie"));
    }
    @GetMapping(path="/v1",params = "version=1")
    public PersonV1 personVersion1(){
        return new PersonV1("Bob Charlie");
    }

}
