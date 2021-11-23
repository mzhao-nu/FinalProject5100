/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actions.VolunteerOrg;

/**
 *
 * @author mzhao
 */
public class Item {
    String name;
    double price;
    String restaurant;

    public Item(String name, double price, String restaurant) {
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
