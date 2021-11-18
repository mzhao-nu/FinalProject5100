/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class OrderDirectory {
    private ArrayList<Order> orderDirectory;

    public OrderDirectory() {
        this.orderDirectory = new ArrayList<>();
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
    
    public Order createOrder(){
        Order order = new Order();
        orderDirectory.add(order);
        return order;
    }
    
    public void deleteOrder(Order order){
        orderDirectory.remove(order);
    }
    
    public Order getOrder(String orderId){
        for(Order o: orderDirectory){
            if(o.getOrderId().equals(orderId)){
                return o;
            }
        }
        return null;
    }
}
