/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Actions.VolunteerOrg.Volunteer;
import Business.UserAccount.UserAccount;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class VolunteerDirectory {

    private ArrayList<Volunteer> volunteerDir;

    public VolunteerDirectory() {
        this.volunteerDir = new ArrayList<>();
    }

    public ArrayList<Volunteer> getVolunteerDir() {
        return volunteerDir;
    }

    public void setVolunteerDir(ArrayList<Volunteer> volunteerDir) {
        this.volunteerDir = volunteerDir;
    }
    
    public Volunteer createVolunteer(){
        Volunteer volunteer = new Volunteer();
        volunteerDir.add(volunteer);
        return volunteer;
    }
    
    public Volunteer createVolunteer(String name, int id, int age, UserAccount ua, String gender){
        Volunteer volunteer = new Volunteer();
        volunteer.setName(name);
        volunteer.setId(id);
        volunteer.setAge(age);
        volunteer.setUa(ua);
        volunteer.setGender(gender);
        volunteerDir.add(volunteer);
        return volunteer;
    }
    
    public void deleteVolunteer(Volunteer v){
        volunteerDir.remove(v);
    }
    
    public Volunteer searchVolunteer(int id){
        for(Volunteer v: volunteerDir){
            if(v.getId() == id){
                return v;
            }
        }
        return null;
    }
}
