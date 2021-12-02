/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actions.PoliceDepartment.Admin;

import Actions.PoliceDepartment.Police.PolicemanDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author mzhao
 */
public class PoliceStation {
    UserAccount ua;
    String stationName;
    int zipcode;
    String address;
    int id;
    long phoneNum;
    PolicemanDirectory policeDir;

    public PoliceStation() {
        this.policeDir = new PolicemanDirectory();
    }
    
    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public PolicemanDirectory getPoliceDir() {
        return policeDir;
    }

    public void setPoliceDir(PolicemanDirectory policeDir) {
        this.policeDir = policeDir;
    }
    
    
}
