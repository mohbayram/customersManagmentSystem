package com.example.customermanagmentsystem;

public class CustomersData {
    private final Integer customerNo = IDGenerator.generateID();
    private String lastName;
    private String firstName;
    private String gender;
    private String email;
    private String telNo;
    private String street;
    private Integer hausNo;
    private Integer zip;
    private String city;

    public CustomersData(String lastName, String firstName, String gender, String email, String telNo, String street, Integer hausNo, Integer zip, String city) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.email = email;
        this.telNo = telNo;
        this.street = street;
        this.hausNo = hausNo;
        this.zip = zip;
        this.city = city;
    }

    public CustomersData(String lastName, String firstName, String gender, String email, String street, Integer hausNo, Integer zip, String city) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.email = email;
        this.street = street;
        this.hausNo = hausNo;
        this.zip = zip;
        this.city = city;
    }

    public Integer getCustomerNo() {
        return customerNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHausNo() {
        return hausNo;
    }

    public void setHausNo(Integer hausNo) {
        this.hausNo = hausNo;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
