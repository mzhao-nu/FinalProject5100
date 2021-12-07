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
public class ParentDirectory {
    
    private ArrayList<Parent> parentDirectory;
    
    public ParentDirectory(){
        parentDirectory = new ArrayList<>();
    }

    public ArrayList<Parent> getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ArrayList<Parent> parentDirectory) {
        this.parentDirectory = parentDirectory;
    }
    
    public Parent createParent(String name, String email, long phoneNum, String username, String password){
        Parent p = new Parent();
        p.setName(name);
        p.setEmail(email);
        p.setPhoneNum(phoneNum);
        p.setUsername(username);
        p.setPassword(password);
        parentDirectory.add(p);
        return p;
    }
    
    public void deleteParent(Parent p){
        parentDirectory.remove(p);
    }
    
    public Parent getParent(String username){
        for(Parent p: parentDirectory){
            if(p.getUsername().equals(username)){
                return p;
            }
        }
        return null;
    }
    
    public boolean containsParent(String parentUsername){
        for (Parent p : parentDirectory){
            if (p.getUsername().equals(parentUsername))    return true;
        }
        return false;
    }
}
