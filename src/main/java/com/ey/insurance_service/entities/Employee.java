package com.ey.insurance_service.entities;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@JsonFilter("Filter")
@Entity
public class Employee {
    @Id
    private Integer empid;

    @NotBlank(message = "ename shouldn't be empty !")
    @Size(min=2)
    private String ename;
    //@JsonIgnore
   //@JsonProperty("address")
    private String addr;
    @OneToMany(mappedBy = "E")
    @JsonIgnore
    private List<Claim> C;

    public List<Claim> getC() {
        return C;
    }

    public void setC(List<Claim> c) {
        C = c;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


}