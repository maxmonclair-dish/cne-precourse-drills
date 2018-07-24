package com.galvanize;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address (String startStreet, String startCity, String startState, String startZip) {
        this.street = startStreet;
        this.city = startCity;
        this.state = startState;
        this.zip = startZip;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public void setState(String newState) {
        this.state = newState;
    }

    public void setZip(String newZip) {
        this.zip = newZip;
    }

    @Override public String toString() {
        return getStreet() + ", " + getCity() + ", " + getState() + " " + getZip();
    }
}
