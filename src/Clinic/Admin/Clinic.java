/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic.Admin;

import Business.UserAccount.UserAccount;

/**
 *
 * @author gyt
 */
public class Clinic {
    private UserAccount ua;
    private String name;
    private String address;
    private long phoneNum;
    private String zipcode;
    private int id;
    private static int count =1;

    public Clinic() {
        id = count;
        count++;
    }
    

    public int getId() {
        return id;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    
    
    
    
}
