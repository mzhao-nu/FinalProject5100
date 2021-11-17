/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantDirectory;

    public RestaurantDirectory() {
        restaurantDirectory = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant createRestaurant(String name){
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurantDirectory.add(restaurant);
        return restaurant;
    }
    
    public void deleteRestaurant(Restaurant r){
        restaurantDirectory.remove(r);
    }
    
    public Restaurant getRestaurant(String name){
        for(Restaurant r: restaurantDirectory){
            if(r.getName().equals(name)){
                return r;
            }
        }
        return null;
    }
}
