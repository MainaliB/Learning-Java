/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents ++ ;
    }
    
    public String [] getStudents(){
        return students;
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void dropStudent(String student){
        
    }
    
}
