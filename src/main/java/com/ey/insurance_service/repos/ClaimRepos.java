package com.ey.insurance_service.repos;

import com.ey.insurance_service.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepos extends JpaRepository<Claim,Integer> {

}
