package Business;

import Business.Employee.Employee;
import Business.Role.ParentRole;
import Business.Role.PoliceAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Clinic.Admin.ClinicDirectory;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }
    
}
