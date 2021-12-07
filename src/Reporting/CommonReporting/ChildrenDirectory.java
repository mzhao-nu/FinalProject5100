/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.CommonReporting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author harold
 */
public class ChildrenDirectory {
    private ArrayList<Children> childrenDirectory;
    
    public ChildrenDirectory(){
        childrenDirectory = new ArrayList<>();
    }

    public ArrayList<Children> getChildrenDirectory() {
        return childrenDirectory;
    }

    public void setChildrenDirectory(ArrayList<Children> childrenDirectory) {
        this.childrenDirectory = childrenDirectory;
    }
    
    public Children createChildren(String name, String foundDate, String foundLocaion, int approxAge, String sex, String race, String hairColor, String eyeColor, String height, String weight, String dob, String id){

        Children children = new Children();
        children.setName(name);
        children.setApproxAge(approxAge);
        children.setEyeColor(eyeColor);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = ft.parse(foundDate);
        } catch (ParseException ex) {
            
        }
        children.setFoundDate(date);
        children.setFoundLocation(foundLocaion);
        children.setHairColor(hairColor);
        children.setHeight(height);
        children.setName(name);
        children.setRace(race);
        children.setSex(sex);
        children.setWeight(weight);     
        children.setDob(dob);
        children.setId(id);
        children.setStatus("Information Submitted");
        childrenDirectory.add(children);
        return children;
    }
    

    public void deleteChildren(Children d){
        childrenDirectory.remove(d);
    }
    
    public Children getChildren(int id){
        for(Children d: childrenDirectory){
            if(d.getId().equals(id)){
                return d;
            }
        }
        return null;
    }

    
    public void addMedicalAdvice(String medcialAdvice, Children c){
        c.setMedicalAdvice(medcialAdvice);
        c.setStatus("treated");
    }

}
