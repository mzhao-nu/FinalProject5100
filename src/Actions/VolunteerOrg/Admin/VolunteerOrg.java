/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actions.VolunteerOrg.Admin;

import Actions.VolunteerOrg.Volunteer.VolunteerDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author mzhao
 */
public class VolunteerOrg {
    UserAccount ua;
    String orgName;
    int zipcode;
    String address;
    long phoneNum;
    VolunteerDirectory volunteerDir;

    public VolunteerOrg() {
        this.volunteerDir = new VolunteerDirectory();
    }
    
    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
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

    public VolunteerDirectory getVolunteerDir() {
        return volunteerDir;
    }

    public void setVolunteerDir(VolunteerDirectory volunteerDir) {
        this.volunteerDir = volunteerDir;
    }
    
}
