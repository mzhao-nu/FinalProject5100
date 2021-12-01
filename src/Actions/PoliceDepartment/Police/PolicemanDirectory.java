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

    private ArrayList<Policeman> policemanList;

    public PolicemanDirectory() {
        this.policemanList = new ArrayList<>();
    }

    public ArrayList<Policeman> getPolicemanList() {
        return policemanList;
    }

    public void setPolicemanList(ArrayList<Policeman> policemanList) {
        this.policemanList = policemanList;
    }
    
    public Policeman createPoliceman(){
        Policeman officer = new Policeman();
        policemanList.add(officer);
        return officer;
    }
    
    public Policeman createPoliceman(String name, int id, String gender, int age, UserAccount ua){
        Policeman officer = new Policeman();
        officer.setName(name);
        officer.setId(id);
        officer.setGender(gender);
        officer.setAge(age);
        officer.setUa(ua);
        policemanList.add(officer);
        return officer;
    }
    
    public void removePoliceman(Policeman p){
        policemanList.remove(p);
    }
    
    public Policeman getPoliceman(int id){
        for(Policeman p: policemanList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
