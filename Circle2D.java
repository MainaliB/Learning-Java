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
       //for the big cirlce to contain the small circle, the sum of distance btwn the centers and the small radius must be less than the radius of the big circle
       boolean returnValue;
        double distance = Math.sqrt(Math.pow((x-circle.getCenter()[0]),2) + Math.pow((y - circle.getCenter()[1]),2));
        if ((distance + circle.getRadius()) < radius){
            returnValue = true;
        }
        else {
            returnValue = false;
        }
            
    
    return returnValue;
    }
    
    //method overlabs that takes an object of Circle2D class and returns true if it overlaps
    //this circle and false if it doesnt
    public boolean overlaps(Circle2D circle){
        //for the circle to overlap, the sum of distance betwn the centers and the small radius must be greater than the radius of the big circle
         boolean returnValue;
        double distance = Math.sqrt(Math.pow((x-circle.getCenter()[0]),2) + Math.pow((y - circle.getCenter()[1]),2));
        if ((distance + circle.getRadius()) > radius){
            returnValue = true;
        }
        else {
            returnValue = false;
        }
            
    
    return returnValue;
    }
    

    
    
    //main method to test our program
    public static void main(String[] args){
        
        //create a new circle object of Circle2D class
        Circle2D c1 = new Circle2D(2,2,5.5);
        
        //print the output
        System.out.printf("The area of the circle c1 is: %2.2f and the perimeter "
                + "of the circle c1 is:%2.2f " ,c1.getArea(), c1.getPerimeter());
    //write the code to test the method
    
        System.out.println("Does the circle c1 contain (3,3)? " +
                c1.contains(3,3));
        
        System.out.println("Does the circle c1 contain a new circle"
                + " Circle2D(4,5,10.5): " + c1.contains(new Circle2D(4,5,10.5)) );
        
        System.out.println("Does the circle c1 overlaps a new circle"
                + " Circle2D(3,5,2.3): " + c1.overlaps(new Circle2D(3,5,2.3)));
    
    
    }
}
