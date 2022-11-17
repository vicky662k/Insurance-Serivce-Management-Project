package com.ey.insurance_service.Service;

import com.ey.insurance_service.Exception.NotFoundException;
import com.ey.insurance_service.entities.Employee;
import com.ey.insurance_service.repos.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepos er;
    public List<Employee> getallemployees() {
        return er.findAll();
    }

    public Employee addemployee(Employee e) {
       return er.save(e);

    }

    public void delemp(int empid) {
        er.deleteById(empid);

    }

    public Employee getbyid(Integer empid) {
        Employee emp =er.findById(empid).orElse(null);
        return emp;
    }


    public Employee update(Integer empid, Employee e) throws Exception {
        Optional<Employee> emp=er.findById(empid);
        if(emp.isEmpty()){
            throw new NotFoundException("Employee id not found: "+ empid);
        }else{
        return er.save(e);}
    }


}
