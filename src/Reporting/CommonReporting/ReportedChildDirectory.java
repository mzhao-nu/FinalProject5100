/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Reporting.CommonReporting;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class ReportedChildDirectory {

    private ArrayList<Children> reportedChildDirectory;
    
    public ReportedChildDirectory(){
        this.reportedChildDirectory = new ArrayList<>();
    }

    public ArrayList<Children> getReportedChildDirectory() {
        return reportedChildDirectory;
    }

    public void setReportedChildDirectory(ArrayList<Children> reportedChildDirectory) {
        this.reportedChildDirectory = reportedChildDirectory;
    }
    
    public Children createChildren(String name, String foundDate, int foundLocaion,String region, int approxAge, String sex, String race, String hairColor, String eyeColor, String height, String weight, String dob, String id, Image childImage){

        Children children = new Children();
        children.setName(name);
        children.setMissingDate(foundDate);
        children.setApproxAge(approxAge);
        children.setEyeColor(eyeColor);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = ft.parse(foundDate);
        } catch (ParseException ex) {
            
        }
        children.setFoundDate(date);
        children.setFoundLocationZipCode(foundLocaion);
        children.setHairColor(hairColor);
        children.setHeight(height);
        children.setName(name);
        children.setRace(race);
        children.setSex(sex);
        children.setWeight(weight);     
        children.setDob(dob);
        children.setId(id);
        children.setChildImage(childImage);
        children.setRegion(region);
        children.setStatus("Information Submitted");
        reportedChildDirectory.add(children);
        return children;
    }
    

    public void deleteChildren(Children d){
        reportedChildDirectory.remove(d);
    }
    
    public Children getChildren(int id){
        for(Children d: reportedChildDirectory){
            if(d.getId().equals(id)){
                return d;
            }
        }
        return null;
    }
}
