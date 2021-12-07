/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actions.Shelter.Admin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author mzhao
 */
public class Shelter {
    UserAccount ua;
    String shelterName;
    int zipcode;
    String address;
    long phoneNum;
    ShelterDirectory shelterDir;
    String username;
    String password;

    public Shelter(){
        this.shelterDir = new ShelterDirectory();
    }
    
    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
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

    public ShelterDirectory getShelterDir() {
        return shelterDir;
    }

    public void setShelterDir(ShelterDirectory shelterDir) {
        this.shelterDir = shelterDir;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
