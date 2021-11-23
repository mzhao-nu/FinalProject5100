/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Parent("Parent"),
        CommonUser("Common User"),
        Policeman("Policeman"),
        ShelterEmployee("Shelter Employee"),
        Volunteer("Volunteer"),
        TestingCenterEmployee("Testing Cnter Employee"),
        PrimaryCareDoctor("Primary Care Doctor"),
        Adoptor("Adoptor"),
        OrphangeEmployee("Orphange Employee"),
        Sponsor("Sponsor"),
        SysAdmin("Sysadmin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}