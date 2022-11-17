package com.ey.insurance_service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Claim {


    @Id
    @GeneratedValue
    private Integer id;

    private String claim_name;
    private Integer val;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
   private Employee E;

    public Employee getE(Employee employee) {
        return E;
    }

    public void setE(Employee e) {
        E = e;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClaim_name() {
        return claim_name;
    }

    public void setClaim_name(String claim_name) {
        this.claim_name = claim_name;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }
}
