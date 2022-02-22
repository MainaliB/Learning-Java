/*
 
 */
public class CircleClass {
    public static void main(String[] args){
        //create a new circle with radius 1
        
        CircleClass circle1 = new CircleClass();
        //get area and perimeter of the circle
        System.out.println("The area of the circle with radius "+ circle1.radius+
                " is "+ circle1.getArea()+" and the perimeter is "+
                circle1.getPerimeter());
        
    // create a new circle with radius 22
    
    CircleClass circle2 = new CircleClass(22.0);
    
    //get area and perimeter of the circle
     System.out.println("The area of the circle with radius "+ circle2.radius+
                " is "+ circle2.getArea()+" and the perimeter is "+
                circle2.getPerimeter());
     
     //we want to change the radius of the cirlce
     
     circle1.setNewRadius(25.0);
     
     System.out.println("The new radius of cirlce1 is "+ circle1.radius);
     
     
     
        
    
    
    }
    double radius;
    
    //constructor that sets radius to 1
    CircleClass(){
        radius = 1;
        }
    //constructor that takes argument
    CircleClass(double newRadius){
        radius = newRadius;
    }
    //method to get area
    double getArea(){
        return radius * radius * Math.PI;
    }
    //method to get perimeter
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    //method to set new radius
    void setNewRadius(double newRadius){
        radius = newRadius;
    }
}
