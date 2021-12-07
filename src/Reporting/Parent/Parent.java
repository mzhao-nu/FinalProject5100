/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Reporting.Parent;
import java.util.*;

/**
 *
 * @author mzhao
 */
public class Parent {
    
    private String name;
    private String email;
    private long phoneNum;
    private String username;
    private String password;
    private ArrayList<String> childrenList;
    
    public Parent(){
        childrenList = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(ArrayList<String> childrenList) {
        this.childrenList = childrenList;
    }
    
    
}
