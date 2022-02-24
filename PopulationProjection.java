/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
//lets import scanner object
import java.util.Scanner;
public class PopulationProjection {
    public static void main(String[] args){
        double birthRate = 1.0/7 ;
        double deathRate = 1.0/13;
        double immigrantRate = 1.0/45;
        double currentPop = 312032486.0;
        //double daysInYear = 365;
        
        
        //lets have user input the number of years they want to project
        Scanner input = new Scanner(System.in);
        
        //prompt user to input the value
        System.out.println("How many years into the future you want to predict"
                + "the population of the US? (Please enter the number of "
                + "years)");
        int projectionYears = input.nextInt();
        double projectionSeconds = projectionYears * 365.0 * 24.0 * 60.0 * 60.0;
        
        double populationProjection = ((currentPop) + 
                (birthRate * projectionSeconds) - 
                (deathRate * projectionSeconds) + 
                (immigrantRate * projectionSeconds) );
        
        //print the results
        System.out.println("The projected population after " + projectionYears +
                " year/s is " + (int)(populationProjection));
        
         }
    
}
