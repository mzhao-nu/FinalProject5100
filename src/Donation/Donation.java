/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donation;

import java.util.Date;

/**
 *
 * @author gyt
 */
public class Donation {
    private String donor;
    private double amount;
    private Date date;
    private boolean isPublic;
    private int id;
    private static int count=1;

    public Donation() {
        id = count;
        count++;
    }


    public int getId() {
        return id;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    
    
    
}
