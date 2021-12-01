/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.CommonReporting;

/**
 *
 * @author harold
 */
public class CommonReporting {
    String name;
    String foundDate;
    String foundLocaion;
    String approxAge;
    String sex;
    String race;
    String hairColor;
    String eyeColor;
    String height;
    String weight;
    String wearing;

    public String getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(String foundDate) {
        this.foundDate = foundDate;
    }

    public String getFoundLocaion() {
        return foundLocaion;
    }

    public void setFoundLocaion(String foundLocaion) {
        this.foundLocaion = foundLocaion;
    }

    public String getApproxAge() {
        return approxAge;
    }

    public void setApproxAge(String approxAge) {
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
