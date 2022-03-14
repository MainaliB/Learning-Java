/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class TestPerson {
    
    public static  void main(String[] args){
        //creating a new person object with the default constructor
        Person p1 = new Person();
        
        //method to get the name, returns defaut name
        System.out.println(p1.getName());
        
        
        //set new name
        p1.setName("John Doe");
        
        //return new name
        System.out.println("The new name is: " + p1.getName());
        
        
    
    
    
    
    }
    
}
