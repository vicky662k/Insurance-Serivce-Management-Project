package com.ey.insurance_service.Service;

import com.ey.insurance_service.Exception.NotFoundException;
import com.ey.insurance_service.entities.Claim;
import com.ey.insurance_service.entities.Employee;
import com.ey.insurance_service.repos.ClaimRepos;
import com.ey.insurance_service.repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimService {
    @Autowired
    ClaimRepos cr;

    @Autowired
    EmployeeRepos er;

    public List<Claim> getclaims() {
        return cr.findAll();
    }

    public Optional<Claim> getbyid(Integer id) {
        Optional<Claim> claim = cr.findById(id);
        if (claim.isEmpty()) {
            throw new NotFoundException("Employee id not found: " + id);
        } else {
            return claim.stream().findAny();
        }


    }


    public List<Claim> findByempid(Integer empid) {
        Optional<Employee> emp = er.findById(empid);
        if (emp.isEmpty()) {
            throw new NotFoundException("Employee id not found: " + empid);
        } else {
            return emp.get().getC();
        }

    }

    public Claim addclaim(Integer id, Claim c) {
        Optional<Employee> e=er.findById(id);
        if (e.isEmpty()) {
            throw new NotFoundException("Employee id not found: " + id);
        } else {
            c.getE(e.get());
            return cr.save(c);
        }

    }
}