/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporting.ParentReporting;

/**
 *
 * @author harold
 */
public class ParentReport {
    String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMissingSince() {
        return missingSince;
    }

    public void setMissingSince(String missingSince) {
        this.missingSince = missingSince;
    }

    public String getMissingFrom() {
        return missingFrom;
    }

    public void setMissingFrom(String missingFrom) {
        this.missingFrom = missingFrom;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getAgeNow() {
        return ageNow;
    }

    public void setAgeNow(String ageNow) {
        this.ageNow = ageNow;
    }
    
    @Override
    public String toString() {
        return doB;
    }
}
