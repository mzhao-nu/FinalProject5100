/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Actions.PoliceDepartment.Police.PolicemanDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.Menu;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private PolicemanDirectory policemanDirectory;

    public EcoSystem(PolicemanDirectory policemanDirectory) {
        this.policemanDirectory = policemanDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
        policemanDirectory = new PolicemanDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public PolicemanDirectory getPolicemanDirectory() {
        return policemanDirectory;
    }

    public void setPolicemanDirectory(PolicemanDirectory policemanDirectory) {
        this.policemanDirectory = policemanDirectory;
    }
    
    
    
}
