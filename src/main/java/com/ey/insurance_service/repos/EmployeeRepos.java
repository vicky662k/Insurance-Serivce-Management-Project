package com.ey.insurance_service.repos;

import com.ey.insurance_service.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepos extends JpaRepository<Employee,Integer> {
}
