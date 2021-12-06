/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Reporting;


import Reporting.ParentReporting.ParentReport;
import Reporting.ParentReporting.ParentReportDirectory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucifer
 */
public class ParentReporting extends javax.swing.JPanel {

    /**
     * Creates new form AddNewJPanel
     */
    ParentReportDirectory parentreportDirectory;
    
    public ParentReporting(ParentReportDirectory parentreportDirectory) {
        initComponents();
        this.parentreportDirectory = parentreportDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        MissingSince = new javax.swing.JLabel();
        doB = new javax.swing.JLabel();
        ageNow = new javax.swing.JLabel();
        Sex = new javax.swing.JLabel();
        race = new javax.swing.JLabel();
        HairColor = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMissingSince = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtAgeNow = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        txtRace = new javax.swing.JTextField();
        txtHairColor = new javax.swing.JTextField();
        SubmitMissingReport = new javax.swing.JButton();
        MissingFrom = new javax.swing.JLabel();
        txtMissingFrom = new javax.swing.JTextField();
        btnImport = new javax.swing.JToggleButton();
        txtEyeColor = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        EyeColor = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        Weight = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(255, 153, 153));
        setPreferredSize(new java.awt.Dimension(1000, 733));

        Header.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Report a missing child");

        Name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Name.setText("Name");

        MissingSince.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MissingSince.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MissingSince.setText("Missing Since");

        doB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        doB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        doB.setText("Date fo Birth");

        ageNow.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ageNow.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ageNow.setText("Age Now");

        Sex.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Sex.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sex.setText("Sex");

        race.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        race.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        race.setText("Race");

        HairColor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        HairColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HairColor.setText("Hair color");

        SubmitMissingReport.setBackground(new java.awt.Color(204, 204, 255));
        SubmitMissingReport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitMissingReport.setText("Submit Report");
        SubmitMissingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitMissingReportActionPerformed(evt);
            }
        });

        MissingFrom.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MissingFrom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MissingFrom.setText("Missing From");

        btnImport.setBackground(new java.awt.Color(204, 204, 255));
        btnImport.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnImport.setText("Import Configutarion File");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        EyeColor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        EyeColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EyeColor.setText("Eye Color");

        Height.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Height.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Height.setText("Height");

        Weight.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Weight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Weight.setText("Weight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(txtHairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtMissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MissingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtMissingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(doB, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ageNow, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtAgeNow, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(race, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtEyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(SubmitMissingReport, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(MissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMissingSince, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(MissingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMissingFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageNow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgeNow, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(race, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHairColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEyeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Weight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(SubmitMissingReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitMissingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitMissingReportActionPerformed
    // TODO add your handling code here:
    try{
    if(txtName.getText().equals("") || txtRace.getText().equals("") || txtMissingSince.getText().equals("") || txtAgeNow.getText().equals("") || txtHairColor.getText().equals("") || txtDOB.getText().equals("")
                || txtSex.getText().equals("") || txtMissingFrom.getText().equals("") || txtEyeColor.getText().equals("") || txtHeight.getText().equals("") || txtWeight.getText().equals("") )
             {
                 JOptionPane.showMessageDialog(null, "Please fill complete information");
             }
    else{
        String name=txtName.getText();
        String race=txtRace.getText();
        String missingSince=txtMissingSince.getText();
        String ageNow=txtAgeNow.getText();
        String hairColor=txtHairColor.getText();
        String doB=txtDOB.getText();
        String sex=txtSex.getText();
        String missingFrom=txtMissingFrom.getText();
        String eyeColor=txtEyeColor.getText();
        String height=txtHeight.getText();
        String weight=txtWeight.getText();

        
        ParentReport pr = parentreportDirectory.createMissingReport(name, missingSince, missingFrom, doB, ageNow, sex, race, hairColor, eyeColor, height, weight);
        
        pr.setName(name);
        pr.setAgeNow(ageNow);
        pr.setDoB(doB);
        pr.setEyeColor(eyeColor);
        pr.setHairColor(hairColor);
        pr.setHeight(height);
        pr.setMissingFrom(missingFrom);
        pr.setMissingSince(missingSince);
        pr.setRace(race);
        pr.setSex(sex);
        pr.setWeight(weight); 
        
        JOptionPane.showMessageDialog(this, "New Missing Report Submit.");
        
        txtName.setText("");
        txtRace.setText("");
        txtMissingSince.setText("");
        txtAgeNow.setText("");
        txtHairColor.setText("");
        txtDOB.setText("");
        txtSex.setText("");
        txtMissingFrom.setText("");
    }
    }catch(Exception e){JOptionPane.showMessageDialog(this, "Invalid data");}
    }//GEN-LAST:event_SubmitMissingReportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
        /*
       try { String fileLocator = File.separator + "Users" + File.separator +"91914"+ File.separator +"OneDrive"+ File.separator +"Documents"+ File.separator +"NetBeansProjects"+ File.separator +"Assignment02"+ File.separator +"src"+ File.separator +"Configuration.txt";
            
            File inventoryFile = new File(fileLocator);
            Scanner inventoryScanner;
   
            inventoryScanner = new Scanner(inventoryFile);
            String nextLine;
            while(inventoryScanner.hasNext()){
            nextLine= inventoryScanner.nextLine();
            String[] vehicleComponents = nextLine.split(",");
            
            String brand = vehicleComponents[0];
            String manufactureYear = vehicleComponents[1];
            String totalSeats = vehicleComponents[2];
            String minSeats = vehicleComponents[3];
            String serialNumber = vehicleComponents[4];
            String modelNumber = vehicleComponents[5];
            String currentCity = vehicleComponents[6];
            String maintanceCert = vehicleComponents[7];
            String availability = vehicleComponents[8];
            
            Vehicle inventoryVehicle = history.addnewVehicle();
            
            int intmanufactureYear = Integer.parseInt(manufactureYear);
            int inttotalSeats = Integer.parseInt(totalSeats);
            int intminSeats = Integer.parseInt(minSeats);
            
            inventoryVehicle.setBrand(brand);
            inventoryVehicle.setManufactureYear(intmanufactureYear);
            inventoryVehicle.setTotalSeats(inttotalSeats);
            inventoryVehicle.setMinSeats(intminSeats);
            inventoryVehicle.setSerialNumber(serialNumber);
            inventoryVehicle.setModelNumber(modelNumber);
            inventoryVehicle.setCurrentCity(currentCity);
            inventoryVehicle.setMaintainanceCert(maintanceCert);
            
            if(availability.equals("true"))
                    {
            inventoryVehicle.setAvailability(true);
                    }
              else    {
                          inventoryVehicle.setAvailability(false);
                      }
            }
            JOptionPane.showMessageDialog(this, "Import Complete.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ParentReporting.class.getName()).log(Level.SEVERE, null, ex);
        }
      */      
    }//GEN-LAST:event_btnImportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EyeColor;
    private javax.swing.JLabel HairColor;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Height;
    private javax.swing.JLabel MissingFrom;
    private javax.swing.JLabel MissingSince;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Sex;
    private javax.swing.JButton SubmitMissingReport;
    private javax.swing.JLabel Weight;
    private javax.swing.JLabel ageNow;
    private javax.swing.JToggleButton btnImport;
    private javax.swing.JLabel doB;
    private javax.swing.JLabel race;
    private javax.swing.JTextField txtAgeNow;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEyeColor;
    private javax.swing.JTextField txtHairColor;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtMissingFrom;
    private javax.swing.JTextField txtMissingSince;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRace;
    private javax.swing.JTextField txtSex;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
