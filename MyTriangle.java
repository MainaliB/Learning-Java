import java.util.*;

public class MyTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Please enter the length of the sides of the"
                + " traingle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        if (isValid(side1,side2,side3)){
            System.out.println("The input is valid and the area of the"
                    + " triangle is: "+ area(side1, side2, side3));
        }
        else{
            System.out.println("The input is invalid!");
        }
        
    
    }
    
    public static Boolean isValid(double side1, double side2, double side3){
        
        //returns true if the sum of two sides is greater than third one
        boolean result;
        if ((side1 < (side2 + side3)) && (side2 < (side1 + side3))&& 
                (side3 < (side1 + side2))){
            result = true;
        }
        else{
            result = false;
                }
        return result;
    }
    
    public static double area(double side1, double side2, double side3){
        //compute the area of the traingle given three sides
        double s = (side1 + side2 + side3)/2.0;
        double area =  Math.sqrt(s * (s-side1)*(s-side2)*(s-side3));
        
        return area;
    
    }
    
}
