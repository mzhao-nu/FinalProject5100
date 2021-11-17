/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import java.util.*;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public Customer createCustomer(String name){
        Customer customer = new Customer();
        customer.setName(name);
        customerDirectory.add(customer);
        return customer;
    }
    
    public void deleteCustomer(Customer c){
        customerDirectory.remove(c);
    }
    
    public Customer getCustomer(String name){
        for(Customer c: customerDirectory){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}
