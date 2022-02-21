/* Defines cirlce class and uses it to creqate objects.
The program constructs three circle objects with radius 1, 25, and 125 and displays
the radius and area of each of the three circle. It then changes the radius of the second object to 100 
and displays its new radius and area
*/
public class TestCircle {
    //main method
    public static void main(String[] args){
        //create a circle with radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius +
                " is "+circle1.getArea());
        
        //create a cricle with radius 25
        Circle circle2= new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius +
                " is "+circle2.getArea());
        
        //create a circle with radius 125
        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle3.radius +
                " is "+circle3.getArea());
        
        //modify circle radius
        circle2.setRadius(100);
        //or cirlce2.radius = 100
        System.out.println("The area of the circle of radius " + circle2.radius +
                " is "+circle2.getArea());
        
        
    
    
    
    }
}
    //defining the Circle class with two constructors
    class Circle{
        double radius;
        // construct cirlce with radius 1
        Circle(){
            radius = 1;
        
        }
        
        //consturct circle with a specified radius
        
        Circle(double newRadius){
            radius = newRadius;
        
        }
        //method to return the are of the cirlce
        double getArea(){
            return radius * radius * Math.PI;
        
        }
        //method to return the perimeter
        double getPerimeter(){
            return 2 * radius * Math.PI;
        }
        
        //method to set new radius to the cirlce
        
        void setRadius(double newRadius){
            radius = newRadius;
        }
        
    
    }
    

