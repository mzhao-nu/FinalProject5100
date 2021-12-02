/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.Reporting.CommonUserJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CommonUserRole extends Role{

    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CommonUserJPanel(userProcessContainer, account, business);
    }
    
    
}
