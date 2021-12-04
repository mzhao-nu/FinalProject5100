/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.CommonReporting;

import Actions.Shelter.Admin.Shelter;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author harold
 */
public class Children {
    private String name;
    private Date foundDate;
    private String foundLocaion;
    private int approxAge;
    private String sex;
    private String race;
    private String hairColor;
    private String eyeColor;
    private String height;
    private String weight;
    private String wearing;
    private String status;
    private String medicalAdvice;
    private Shelter shelter;
    private String injury;
    private ImageIcon photo;
    private int id;
    private static int count =1;
    

    public Children() {
        id = count;
        count++;
    }


    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    
    public String getInjury() {
        return injury;
    }

    public void setInjury(String injury) {
        this.injury = injury;
    }


    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }


    public String getMedicalAdvice() {
        return medicalAdvice;
    }

    public void setMedicalAdvice(String medicalAdvice) {
        this.medicalAdvice = medicalAdvice;
    }    
    
    public int getId() {
        return id;
    }
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public String getFoundLocaion() {
        return foundLocaion;
    }

    public void setFoundLocaion(String foundLocaion) {
        this.foundLocaion = foundLocaion;
    }

    public int getApproxAge() {
        return approxAge;
    }

    public void setApproxAge(int approxAge) {
        this.approxAge = approxAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWearing() {
        return wearing;
    }

    public void setWearing(String wearing) {
        this.wearing = wearing;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
