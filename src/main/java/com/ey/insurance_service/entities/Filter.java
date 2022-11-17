package com.ey.insurance_service.entities;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("SomeFilter")
public class Filter {

   String val1;

   String val2,val3;

    public String getVal1() {
        return val1;
    }

    public String getVal2() {
        return val2;
    }

    public String getVal3() {
        return val3;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "val1='" + val1 + '\'' +
                ", val2='" + val2 + '\'' +
                ", val3='" + val3 + '\'' +
                '}';
    }

    public Filter(String val1, String val2, String val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }
}
