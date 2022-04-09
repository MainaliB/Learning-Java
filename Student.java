/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Student {
    private String FirstName;
    private String LastName;
    private String Major;
    private String Minor;
    private int UIN;
    private double GPA;
    
    //default constructor
    public Student(){
    }
    
    //constructor with arguments
    public Student(String firstname, String lastname, String major, String minor, int uin, double gpa){
        this.FirstName = firstname;
        this.LastName = lastname;
        this.Major = major;
        this.Minor = minor;
        this.UIN = uin;
        this.GPA = gpa;
    
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public void setFirstName(String word){
        FirstName = word;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public void setLastName(String word){
        LastName = word;
    }
    
    public String getMajor(){
        return Major;
    }
    
    public void setMajor(String word){
        Major = word;
    }
    
    public String getMinor(){
        return Minor;
    }
    
    public void setMinor(String word){
        Minor = word;
    }
    
    public int getUIN(){
        return UIN;
    }
    
    public void setUIN(int number){
        UIN = number;
    }
    
    public double getGPA(){
        return GPA;
    }
    
    public void setGPA(double number){
        GPA = number;
    }
    
    public String toString(){
        return FirstName + " "+ LastName +" " + Major + " "+ Minor +" "+
                UIN + " "+ GPA ;
    }
    
}
