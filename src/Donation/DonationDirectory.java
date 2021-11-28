/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gyt
 */
public class DonationDirectory {
    private ArrayList<Donation> donationList;

    public DonationDirectory() {
        donationList = new ArrayList<Donation>();
    }

    public ArrayList<Donation> getDonationList() {
        return donationList;
    }
    
    public Donation createDonation(String donor, double amount, String sdate,boolean isPublic, String comment){
        Donation donation = new Donation();
        donation.setAmount(amount);
        donation.setComment(comment);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = ft.parse(sdate);
        } catch (ParseException ex) {
            
        }
        donation.setDate(date);
        donation.setDonor(donor);
        donation.setIsPublic(isPublic);
        donationList.add(donation);
        return donation;
    }
    
    public void removeDonation(Donation donation){
        donationList.remove(donation);
    }
    
    public void updateDonation(int id,String donor, double amount, String sdate,boolean isPublic, String comment){
        for(Donation donation:this.donationList){
            if(donation.getId()==id){
                donation.setAmount(amount);
                donation.setComment(comment);
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                try {
                        date = ft.parse(sdate);
                } catch (ParseException ex) {
            
                }
                donation.setDate(date);
                donation.setDonor(donor);
                donation.setIsPublic(isPublic);
            }
        }
    }
}
