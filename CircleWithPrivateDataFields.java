/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class CircleWithPrivateDataFields {
   //the radius of the cirlce- holds private data field
    private double radius = 1;
    
    //private static variable, shared among every members of the class
    private static int numberOfObjects = 0;
    
    //no-arg constructor
    public CircleWithPrivateDataFields(){
        numberOfObjects++;
    }
    //constructor with specified radius
    public CircleWithPrivateDataFields(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    
    //method to return radius
    public double getRadius(){
        return radius;
    }
    
    //method to set new radius
    public void setRadius(double newRadius){
        radius = (newRadius >=0)? newRadius: 0;
   /*the above statement checks if new radius is greater than or equal to 0 and if newRadius 
    is greater than or equal to zero then the radius is 
    new radius else its 0
    */
    }
    
    //return number of objects
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    //return the area of the cirlcle
    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public static void main(String[] args){
        //create a circle with radius 5.0
        CircleWithPrivateDataFields myCircle = 
                new CircleWithPrivateDataFields (5.0);
        //get area of the cirlce
        System.out.println("The area of the circle of radius " + myCircle.getRadius()+
                " is " + myCircle.getArea());
        
        //increase myCircle's area by 50%
        myCircle.setRadius(myCircle.getRadius() * 1.5);
        
         //get area of the cirlce
        System.out.println("The area of the circle of radius " + myCircle.getRadius()+
                " is " + myCircle.getArea());
        
        //get the count of the number of circle objects created
        System.out.println("The number of objects created is " +
              CircleWithPrivateDataFields.getNumberOfObjects()  );
        
       //create another circle object with no args constructor 
     CircleWithPrivateDataFields myCircle2 = new CircleWithPrivateDataFields();
     
          //create another circle object with no args constructor 
     CircleWithPrivateDataFields myCircle3 = new CircleWithPrivateDataFields();
     
     
          //create another circle object with no args constructor 
     CircleWithPrivateDataFields myCircle4 = new CircleWithPrivateDataFields();
    
      //get the count of the number of circle objects created
        System.out.println("The number of objects created is " +
              CircleWithPrivateDataFields.getNumberOfObjects()  );
    }
}
