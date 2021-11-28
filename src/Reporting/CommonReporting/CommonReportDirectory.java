/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.CommonReporting;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CommonReportDirectory {
    private ArrayList<CommonReporting> commonReportDirectory;
    
    public CommonReportDirectory(){
        commonReportDirectory = new ArrayList<>();
    }

    public ArrayList<CommonReporting> getCommonReportDirectory() {
        return commonReportDirectory;
    }

    public void setCommonReportDirectory(ArrayList<CommonReporting> commonReportDirectory) {
        this.commonReportDirectory = commonReportDirectory;
    }
    
    public CommonReporting createCommonReport(String name, String foundDate, String foundLocaion, String approxAge, String sex, String race, String hairColor, String eyeColor, String height, String weight, String wearing){
        CommonReporting commonReport = new CommonReporting();
        commonReport.setName(name);
        commonReport.setApproxAge(approxAge);
        commonReport.setEyeColor(eyeColor);
        commonReport.setFoundDate(foundDate);
        commonReport.setFoundLocaion(foundLocaion);
        commonReport.setHairColor(hairColor);
        commonReport.setHeight(height);
        commonReport.setName(name);
        commonReport.setRace(race);
        commonReport.setSex(sex);
        commonReport.setWearing(wearing);
        commonReport.setWeight(weight);                
        commonReportDirectory.add(commonReport);
        return commonReport;
    }
    
    public void deleteDeliveryMan(CommonReporting d){
        commonReportDirectory.remove(d);
    }
    
    public CommonReporting getCommonReport(String name){
        for(CommonReporting d: commonReportDirectory){
            if(d.getName().equals(name)){
                return d;
            }
        }
        return null;
    }
}
