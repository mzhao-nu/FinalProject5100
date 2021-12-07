/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic.Treating;

import Business.UserAccount.UserAccount;
import Clinic.Admin.Clinic;

/**
 *
 * @author gyt
 */
public class TreatmentDoctors {
    private int id;
    private static int count = 1;
    private String name;
    private int age;
    private String phoneNum;
    private Clinic clinic;
    private UserAccount ua;

    public TreatmentDoctors() {
        id = count;
        count++;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    
    
    
}
