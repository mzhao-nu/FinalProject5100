/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic.Admin;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author gyt
 */
public class ClinicDirectory {
    private ArrayList<Clinic> clinicList;

    public ClinicDirectory() {
        clinicList = new ArrayList<>();
    }

    public ArrayList<Clinic> getClinicList() {
        return clinicList;
    }
    
    public Clinic createClinic(String name, String address, long phoneNum, String zipcode, UserAccount ua, String username, String password){
        Clinic clinicAdmin = new Clinic();
        clinicAdmin.setAddress(address);
        clinicAdmin.setName(name);
        clinicAdmin.setPhoneNum(phoneNum);
        clinicAdmin.setUa(ua);
        clinicAdmin.setZipcode(zipcode);
        clinicAdmin.setUsername(username);
        clinicAdmin.setPassword(password);
        clinicList.add(clinicAdmin);
        return clinicAdmin;
    }
    
    public void removeClinic(Clinic clinicAdmin){
        clinicList.remove(clinicAdmin);
    }
    
    public void updateClinic(int id, String name, String address, long phoneNum, String zipcode, UserAccount ua){
        for(Clinic clinic :this.getClinicList()){
            if(clinic.getId()==id){
                clinic.setAddress(address);
                clinic.setName(name);
                clinic.setPhoneNum(phoneNum);
                clinic.setUa(ua);
                clinic.setZipcode(zipcode);
            }
        }
    }
}
