/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adoption.Orphanage;
import Reporting.ParentReporting.*;
import java.util.*;

/**
 *
 * @author harold
 */
public class OrphanageDirectory {
    private ArrayList<Orphanage> orphanageDirectory;
    
    public OrphanageDirectory(){
        orphanageDirectory = new ArrayList<>();
    }

    public ArrayList<Orphanage> getOrphanageDirectory() {
        return orphanageDirectory;
    }

    public void setOrphanageDirectory(ArrayList<Orphanage> orphanageDirectory) {
        this.orphanageDirectory = orphanageDirectory;
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
    public Orphanage createOrphanage(String orphanageName,String establishDate,String capacity,String zipCode,String state){
        Orphanage orphanage = new Orphanage();
        orphanage.setCapacity(capacity);
        orphanage.setEstablishDate(establishDate);
        orphanage.setOrphanageName(orphanageName);
        orphanage.setState(state);
        orphanage.setZipCode(zipCode);              
        orphanageDirectory.add(orphanage);
        return orphanage;
    }
    
    public void deleteOrphanage(Orphanage c){
        orphanageDirectory.remove(c);
    }
    
    public Orphanage getParentReport(int id){
        for(Orphanage c: orphanageDirectory){
            if(c.getId()==id){
                return c;
            }
        }
        return null;
    }
    
  
}
