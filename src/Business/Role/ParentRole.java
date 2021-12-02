/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
//import userinterface.Police.ParentJPanel;
import javax.swing.JPanel;
import userinterface.Police.PoliceAdminJPanel;

/**
 *
 * @author raunak
 */
public class ParentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new PoliceAdminJPanel(userProcessContainer, business, account);
    }

    
    
}
