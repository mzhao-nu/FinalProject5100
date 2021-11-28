/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adopion.Adoption;
import Reporting.ParentReporting.*;
import java.util.*;

/**
 *
 * @author harold
 */
public class AdoptionDirectory {
    private ArrayList<Adoption> adoptionDirectory;
    
    public AdoptionDirectory(){
        adoptionDirectory = new ArrayList<>();
    }

    public ArrayList<Adoption> getAdoptionDirectory() {
        return adoptionDirectory;
    }

    public void setAdoptionDirectory(ArrayList<Adoption> adoptionDirectory) {
        this.adoptionDirectory = adoptionDirectory;
    }
    /*String name;
    String missingSince;
    String missingFrom;
    String doB;
    String ageNow;
    String sex;
    String race;
    String hairColor;
    String eyeColor;
    String height;
    String weight;
*/
    public Adoption createCustomer(String childName,String childID,String name,String doB,String address,String phoneNo,String matitalStatus,String jobCompany,String date,String reasonForAdoption){
        Adoption adoption = new Adoption();
        adoption.setName(name);
        adoption.setAddress(address);
        adoption.setChildID(childID);
        adoption.setChildName(childName);
        adoption.setDate(date);
        adoption.setDoB(doB);
        adoption.setJobCompany(jobCompany);
        adoption.setMatitalStatus(matitalStatus);
        adoption.setReasonForAdoption(reasonForAdoption);
        adoption.setPhoneNo(phoneNo);                
        adoptionDirectory.add(adoption);
        return adoption;
    }
    
    public void deleteAdoption(Adoption c){
        adoptionDirectory.remove(c);
    }
    
    public Adoption getAdoption(String name){
        for(Adoption c: adoptionDirectory){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    
  
}
