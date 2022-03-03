/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Location {
    int rowIndex;
    int colIndex;
    double maxValue;
    
    //main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Please enter the number of rows and columns "
                + "of the array: ");
        //reading user input as dimension of the array
        int row = input.nextInt(); 
        int col = input.nextInt();
        double [][] numbersArray = new double [row][col];
        //ask user to input the array
        System.out.println("Enter the array");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j ++){
                numbersArray[i][j] = input.nextDouble();
    
            }
        }
        //create a new location object ysing the method locateLarges which returns a location object
        Location location2 = locateLargest(numbersArray);
        //Print out the output
        System.out.println("The largest value "+ location2.maxValue + " is located in "
       +"<"+ location2.rowIndex + "," + location2.colIndex + ">.");
        
    }    
    
    
   // constructor
    public Location(double maxValue, int rowIndex, int colIndex){
        this.maxValue = maxValue;
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }
    //method to locate the largest element in the array, returns a location object
    public static Location locateLargest(double [][]a){
        double max = a[0][0];
        int rowIndex=0;
        int colIndex=0;
        
        //int [] indexOfMax = new int[2];
        //indexOfMax[0]=0;
        //indexOfMax[1]=0;
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i][j]>max){
                    rowIndex= i;
                    colIndex = j;
                    max = a[i][j];
                }
               
                        
                }
            }
        Location location1 = new Location(max, rowIndex, colIndex);
    return location1;
    
    }
     
    
           
}
