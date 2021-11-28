/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.ParentReporting;
import java.util.*;

/**
 *
 * @author harold
 */
public class ParentReportDirectory {
    private ArrayList<ParentReport> parentreportDirectory;
    
    public ParentReportDirectory(){
        parentreportDirectory = new ArrayList<>();
    }

    public ArrayList<ParentReport> getParentreportDirectory() {
        return parentreportDirectory;
    }

    public void setParentreportDirectory(ArrayList<ParentReport> parentreportDirectory) {
        this.parentreportDirectory = parentreportDirectory;
    }
    /*String name;
    String missingSince;
    String missingFrom;
    String doB;
    String ageNow;
    String sex;
    String race;
    String hairColor;
    String eyeColor;
    String height;
    String weight;
*/
    public ParentReport createCustomer(String name,String missingSince,String missingFrom,String doB,String ageNow,String sex,String race,String hairColor,String eyeColor,String height,String weight){
        ParentReport parentReport = new ParentReport();
        parentReport.setName(name);
        parentReport.setAgeNow(ageNow);
        parentReport.setDoB(doB);
        parentReport.setEyeColor(eyeColor);
        parentReport.setHairColor(hairColor);
        parentReport.setHeight(height);
        parentReport.setMissingFrom(missingFrom);
        parentReport.setMissingSince(missingSince);
        parentReport.setRace(race);
        parentReport.setSex(sex);
        parentReport.setWeight(weight);        
        parentreportDirectory.add(parentReport);
        return parentReport;
    }
    
    public void deleteCustomer(ParentReport c){
        parentreportDirectory.remove(c);
    }
    
    public ParentReport getParentReport(String name){
        for(ParentReport c: parentreportDirectory){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    
  
}
