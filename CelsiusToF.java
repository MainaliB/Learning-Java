/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.Scanner;
public class CelsiusToF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        
        //prompt user
        System.out.println("Please enter the Celsius value you would"
                + "like to conver to Fahrenheit: ");
        double celsiusTemp = input.nextDouble();
        
        double tempInF = ((9.0 / 5) * celsiusTemp) + 32 ;
        
        System.out.println(celsiusTemp + " is " + tempInF + " Fahrenheit.");
    
    }
    
    
}
