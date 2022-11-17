package com.ey.insurance_service.controllers;

import com.ey.insurance_service.Service.ClaimService;
import com.ey.insurance_service.entities.Claim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClaimController {
    @Autowired
    ClaimService obj;
    @GetMapping("/getallclaim")
    public List<Claim> getallclaimss(){return obj.getclaims();}
    @GetMapping("/getbyid/{id}")
    public Optional<Claim> retreiveclaimforuser(@PathVariable Integer id){return  obj.getbyid(id);}
    @GetMapping("/getclaimdetails/{empid}")
    public List<Claim> claimforuser(@PathVariable Integer empid){
        return  obj.findByempid(empid);
    }
    @PostMapping("addclaim/{id}")
    public Claim addclaim(@PathVariable Integer id, @RequestBody Claim C){
        return obj.addclaim(id,C);
    }
}
