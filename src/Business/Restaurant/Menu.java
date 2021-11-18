/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class Menu {
    private ArrayList<Item> menuDirectory;

    public Menu(){
        this.menuDirectory = new ArrayList<>();
    }

    public ArrayList<Item> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<Item> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public Item addItem(String name, double price, String restaurant){
        Item item = new Item(name, price, restaurant);
        menuDirectory.add(item);
        return item;
    }
    
    public void removeItem(Item item){
        menuDirectory.remove(item);
    }
}
