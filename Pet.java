/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Pet {
    private String name;
    private int age;
    private String color;
    
    public Pet(){
    
    }
    
    public Pet(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean setName(String name){
        return true;
    }
    
    public int getAge(){
        return age;
    }
    
    public boolean setAge(int age){
        return true;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean setColor(String color){
        return true;
    }
    
    public String toString(){
        return name + " "+ age + " "+ color;
    }
    
}
