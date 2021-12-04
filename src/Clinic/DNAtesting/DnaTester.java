/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic.DNAtesting;

import Clinic.Admin.Clinic;

/**
 *
 * @author gyt
 */
public class DnaTester {
    private String name;
    private int age;
    private int id;
    private static int count =1;
    private long phoneNum;
    private Clinic clinic;

    public DnaTester() {
        id = count;
        count++;
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

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
    
    
    
}
