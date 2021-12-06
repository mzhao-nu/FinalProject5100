/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actions.Shelter.Admin;
import Business.UserAccount.UserAccount;
import java.util.*;
/**
 *
 * @author mzhao
 */
public class ShelterDirectory {

    private ArrayList<Shelter> shelterDir;

    public ShelterDirectory() {
        this.shelterDir = new ArrayList<>();
    }

    public ArrayList<Shelter> getShelterDir() {
        return shelterDir;
    }

    public void setShelterDir(ArrayList<Shelter> shelterDir) {
        this.shelterDir = shelterDir;
    }
    
    public Shelter createShelter(){
        Shelter s = new Shelter();
        shelterDir.add(s);
        return s;
    }
    
    public Shelter createShelter(UserAccount ua, String shelterName, int zipcode, String address, long phoneNum, String username, String password){
        Shelter s = new Shelter();
        s.setUa(ua);
        s.setShelterName(shelterName);
        s.setZipcode(zipcode);
        s.setAddress(address);
        s.setPhoneNum(phoneNum);
        s.setUsername(username);
        s.setPassword(password);
        shelterDir.add(s);
        return s;
    }
    
    public void deleteShelter(Shelter s){
        shelterDir.remove(s);
    }
    
    public Shelter searchShelter(String shelterName){
        for(Shelter s: shelterDir){
            if(s.getShelterName().equals(shelterName)){
                return s;
            }
        }
        return null;
    }
}
