package com.example.ccrepo;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="credit_card")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="type")
    private String type;

    @Column(name="credit_num")
    private BigInteger creditNum;

    @Column(name="month")
    private Integer month;

    @Column(name="year")
    private Integer year;

    @Column(name="month_year")
    private String expiration;

    @Column(name="ccv")
    private Integer ccv;

    @Column(name="name")
    private String ownerName;

    @Column(name="address")
    private String streetAddress;

    @Column(name="country")
    private String country;

    @Column(name="zipcode")
    private String zipcode;

    public CreditCard(){};

    public CreditCard(BigInteger creditNum, String expiration, String ownerName, String streetAddress, String country, String zipcode) {
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
