/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actions.PoliceDepartment.Police;
import Business.UserAccount.UserAccount;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class PolicemanDirectory {

    private ArrayList<PoliceAdmin> policemanList;

    public PolicemanDirectory() {
        this.policemanList = new ArrayList<>();
    }

    public ArrayList<PoliceAdmin> getPolicemanList() {
        return policemanList;
    }

    public void setPolicemanList(ArrayList<PoliceAdmin> policemanList) {
        this.policemanList = policemanList;
    }
    
    public PoliceAdmin createPoliceman(){
        PoliceAdmin officer = new PoliceAdmin();
        policemanList.add(officer);
        return officer;
    }
    
    public PoliceAdmin createPoliceman(String name, int id, String gender, int age, String username, String password){
        PoliceAdmin officer = new PoliceAdmin();
        officer.setName(name);
        officer.setId(id);
        officer.setGender(gender);
        officer.setAge(age);
        officer.setUsername(username);
        officer.setPassword(password);
        policemanList.add(officer);
        return officer;
    }
    
    public void removePoliceman(PoliceAdmin p){
        policemanList.remove(p);
    }
    
    public PoliceAdmin getPoliceman(int id){
        for(PoliceAdmin p: policemanList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
