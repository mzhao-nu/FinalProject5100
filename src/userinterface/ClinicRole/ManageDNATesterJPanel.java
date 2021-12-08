/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Clinic.Admin.Clinic;
import Clinic.DNAtesting.DnaTester;
import Clinic.Treating.TreatmentDoctors;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gyt
 */

public class ManageDNATesterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDNATesterJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    private Clinic clinic;
    private ArrayList<DnaTester> testerList;
    
    public ManageDNATesterJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        testerList = new ArrayList<DnaTester>();
        for(Clinic c:ecoSystem.getClinicDirectory().getClinicList()){
            if(c.getUsername().equals(account.getUsername())) clinic=c;
        }
            for(DnaTester t:ecoSystem.getDnaTestingDirectory().getDnaTesterList()){
            if(t.getClinic().getId()==clinic.getId()){
                testerList.add(t);
            }
        }
        
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTester = new javax.swing.JTable();
        btnAddCustomer = new javax.swing.JButton();
        btnModifyCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitle.setText("DNA Tester Management");

        tableTester.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "ID", "Name", "Age", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTester);

        btnAddCustomer.setForeground(new java.awt.Color(255, 153, 51));
        btnAddCustomer.setText("Add DNA Tester");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnModifyCustomer.setForeground(new java.awt.Color(255, 153, 51));
        btnModifyCustomer.setText("Modify DNA Tester");
        btnModifyCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setForeground(new java.awt.Color(255, 153, 51));
        btnDeleteCustomer.setText("Delete DNA Tester");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 153, 51));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifyCustomer)
                        .addGap(137, 137, 137)
                        .addComponent(btnDeleteCustomer))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(152, 152, 152)
                            .addComponent(lblTitle))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnModifyCustomer)
                    .addComponent(btnDeleteCustomer))
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tableTester.getModel();
        model.setRowCount(0);
        
        for(DnaTester t:this.testerList){
            
                Object[] row = new Object[5];
                row[0] = t.getUa().getUsername();
                row[1] = t;
                row[2] = t.getName();
                row[3] = t.getAge();
                row[4] = t.getPhoneNum();
            
               model.addRow(row);
            
       }
    
    
    }
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        AddTesterJPanel addTesterJPanel = new AddTesterJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add(addTesterJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btnModifyCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCustomerActionPerformed

        int selectRowIndex = tableTester.getSelectedRow();
        if(selectRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableTester.getModel();
        DnaTester d = (DnaTester)model.getValueAt(selectRowIndex, 1);
        ModifyTesterJPanel modifyTesterJPanel = new ModifyTesterJPanel(userProcessContainer, userAccount,ecoSystem,d);
        userProcessContainer.add(modifyTesterJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed

        int selectRowIndex = tableTester.getSelectedRow();
        if(selectRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableTester.getModel();
        DnaTester d = (DnaTester)model.getValueAt(selectRowIndex, 1);
        ecoSystem.getDnaTestingDirectory().removeDnaTester(d);

        JOptionPane.showMessageDialog(this, "Tester deleted.");
        populateTable();
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ClinicAdminJPanel clinicAdminJPanel = new ClinicAdminJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add(clinicAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnModifyCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableTester;
    // End of variables declaration//GEN-END:variables
}
