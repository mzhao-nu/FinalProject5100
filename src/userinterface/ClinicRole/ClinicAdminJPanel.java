/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Clinic.Admin.Clinic;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author gyt
 */
public class ClinicAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClinicAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private Clinic clinic;
    
    public ClinicAdminJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        
        for(Clinic clinic:ecoSystem.getClinicDirectory().getClinicList()){
            if(clinic.getUa().equals(userAccount)){
                this.clinic =clinic;
            }
        }
        
        btnDNATester.setBackground(new java.awt.Color(255, 255, 255, 0));
        btnDNATester.setBorder(new LineBorder(Color.ORANGE, 4));
        btnDoctors.setBackground(new java.awt.Color(255, 255, 255, 0));
        btnDoctors.setBorder(new LineBorder(Color.ORANGE, 4));
        btnInfo.setBackground(new java.awt.Color(255, 255, 255, 0));
        btnInfo.setBorder(new LineBorder(Color.ORANGE, 4));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnDoctors = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnDNATester = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(255, 255, 255));

        btnDoctors.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnDoctors.setForeground(new java.awt.Color(255, 153, 51));
        btnDoctors.setText("Manage Doctors");
        btnDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/catoon doctor.png"))); // NOI18N

        btnDNATester.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnDNATester.setForeground(new java.awt.Color(255, 153, 51));
        btnDNATester.setText("Manage DNA Testers");

        btnInfo.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 153, 51));
        btnInfo.setText("Manage Information");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Clinic Admin Workarea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDNATester, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDNATester, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsActionPerformed
        // TODO add your handling code here:
        ManageDoctorsJPanel panel = new ManageDoctorsJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(panel);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnDoctorsActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        ManageInfoJPanel panel = new ManageInfoJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(panel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDNATester;
    private javax.swing.JButton btnDoctors;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
