/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actions.Shelter.ShelterEmployee;
import Business.UserAccount.UserAccount;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class ShelterEmployeeDirectory {
    private ArrayList<ShelterEmployee> shelterEmployeeDir;

    public ShelterEmployeeDirectory() {
        this.shelterEmployeeDir = new ArrayList<>();
    }

    public ArrayList<ShelterEmployee> getShelterEmployeeDir() {
        return shelterEmployeeDir;
    }

    public void setShelterEmployeeDir(ArrayList<ShelterEmployee> shelterEmployeeDir) {
        this.shelterEmployeeDir = shelterEmployeeDir;
    }
    
    public ShelterEmployee createShelterEmployee(){
        ShelterEmployee se = new ShelterEmployee();
        shelterEmployeeDir.add(se);
        return se;
    }
    
    public ShelterEmployee createShelterEmployee(String name, int id, String gender, int age, UserAccount ua){
        ShelterEmployee se = new ShelterEmployee();
        se.setName(name);
        se.setId(id);
        se.setGender(gender);
        se.setAge(age);
        se.setUa(ua);
        shelterEmployeeDir.add(se);
        return se;
    }
    
    public void deleteShelterEmployee(ShelterEmployee se){
        shelterEmployeeDir.remove(se);
    }
    
    public ShelterEmployee searchShelterEmployee(int id){
        for(ShelterEmployee se: shelterEmployeeDir){
            if(se.getId() == id){
                return se;
            }
        }
        return null;
    }
}
