package com.ey.insurance_service.entities;

public class PersonV1 {
    String name;
    public PersonV1(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
