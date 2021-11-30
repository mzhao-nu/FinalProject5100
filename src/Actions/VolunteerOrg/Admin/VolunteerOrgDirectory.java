/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actions.VolunteerOrg.Admin;
import Business.UserAccount.UserAccount;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class VolunteerOrgDirectory {
    private ArrayList<VolunteerOrg> volunteerOrgDir;

    public VolunteerOrgDirectory() {
        this.volunteerOrgDir = new ArrayList<>();
    }

    public ArrayList<VolunteerOrg> getVolunteerOrgDir() {
        return volunteerOrgDir;
    }

    public void setVolunteerOrgDir(ArrayList<VolunteerOrg> volunteerOrgDir) {
        this.volunteerOrgDir = volunteerOrgDir;
    }
    
    public VolunteerOrg createVolunteerOrg(){
        VolunteerOrg org = new VolunteerOrg();
        volunteerOrgDir.add(org);
        return org;
    }
    
    public VolunteerOrg createVolunteerOrg(UserAccount ua, String orgName, int zipcode, String address, long phoneNum){
        VolunteerOrg org = new VolunteerOrg();
        org.setUa(ua);
        org.setOrgName(orgName);
        org.setZipcode(zipcode);
        org.setAddress(address);
        org.setPhoneNum(phoneNum);
        volunteerOrgDir.add(org);
        return org;
    }
    
    public void deleteVolunteerOrg(VolunteerOrg org){
        volunteerOrgDir.remove(org);
    }
    
    public VolunteerOrg searchOrg(String orgName){
        for(VolunteerOrg v: volunteerOrgDir){
            if(v.getOrgName().equals(orgName)){
                return v;
            }
        }
        return null;
    }
}
