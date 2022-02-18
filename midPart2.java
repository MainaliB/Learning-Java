/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.Scanner; //get the necessary imports
public class midPart2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float height;
        int age;
        double recommendedWeight;
        //prompt user for height and weight information
        System.out.println("Please enter your height(in centimenters) "
                + "and age: ");
        height = input.nextFloat();
        age = input.nextInt();
        
        recommendedWeight = (height -100.0 + (age)/10.0) * 0.9;
        
        System.out.println("Recommended weight for a person " + height +
                " centimeters tall and " + age +" years old is: " +
                recommendedWeight + " Kg.");
    }
}
