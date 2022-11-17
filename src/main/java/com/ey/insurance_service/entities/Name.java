package com.ey.insurance_service.entities;

public class Name {
    String fname,lname;
    public Name() {

    }

    public Name(String bob, String charlie) {
        this.fname = bob;
        this.lname = charlie;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "Name{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
