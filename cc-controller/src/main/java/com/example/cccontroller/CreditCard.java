package com.example.cccontroller;

import java.math.BigInteger;

public class CreditCard {
    private Integer id;
    private BigInteger creditNum;
    private String expiration;
    private String ownerName;
    private String streetAddress;
    private String country;
    private String zipcode;

    public CreditCard(Integer id, BigInteger creditNum, String expiration, String ownerName, String streetAddress, String country, String zipcode) {
        this.id = id;
        this.creditNum = creditNum;
        this.expiration = expiration;
        this.ownerName = ownerName;
        this.streetAddress = streetAddress;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(BigInteger creditNum) {
        this.creditNum = creditNum;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
