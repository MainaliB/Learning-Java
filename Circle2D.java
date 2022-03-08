/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Circle2D {
    double x;
    double y;
    double radius;
    
    //create a getter method for center (x,y)
    public double [] getCenter(){
        double [] center = new double [2];
        center[0] = x;
        center[1] = y;
        return center;
    }
    
    
    //getter method for radius
    public double getRadius(){
        return radius;
    }
    
    
    //no args constructor
    public Circle2D(){
    double x = 0;
    double y = 0;
    double radius = 1;
    }
    
    //specified argument constructor
    public Circle2D(double x, double y, double radius){
    this.x = x;
    this.y = y;
    this.radius = radius;
    }
    
    //method to get Area
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    //method to get permieter
    public double getPerimeter(){
        return  2 * Math.PI * radius;
    }
    
    //method that takes in x and y as the center of the new circle and returns
    //true if it is inside this circle
    public boolean contains(double x, double y){
        boolean returnValue;
        double distance = Math.sqrt(Math.pow((x-getCenter()[0]),2) + Math.pow((y - getCenter()[1]),2));
        if (distance < radius){
            returnValue = true;
        }
        else {
            returnValue = false;
        }
            
    
    return returnValue;
    }
    
    //method that takes in a circle object and returns true if it is inside this circle
    public boolean contains(Circle2D circle){
        //a point is inside the circle if its distance to the center of the cirlce is less than the radius
        
    
    return true;
    }
    
    //method overlabs that takes an object of Circle2D class and returns true if it overlaps
    //this circle and false if it doesnt
    public boolean overlaps(Circle2D circle){
    
    return true;
    }
    
    //main method to test our program
    public static void main(String[] args){
    //write the code to test the method
    
    
    }
    
    
    
}
