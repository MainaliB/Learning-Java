/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Test {
    public static void main(String[] args){
        
        //create a new scanner object
        Scanner input = new Scanner(System.in);
        
        int lengthList;//variable to store the lenght of the list
        
        //prompt users to input the numbes
        System.out.println("Please enter the numbers");
        
        
        //first input is the lenght of the list
        lengthList = input.nextInt();
        
        //store the user input in the list
        int [] list = new int [lengthList];
        for(int i = 0; i < lengthList; i++){
            list[i] = input.nextInt();
        }
      //print the results
        if (isSorted(list)== true){
            System.out.println("The list is already sorted.");
        }
        else{
            System.out.println("The list is not sorted");
        }
        //
  
    
    }
    //method to check whether the list is sorted
    public static Boolean isSorted(int [] list){
    Boolean returnValue = true;
    int val = list[0];//assign the first value of the list to a variable
    
    //recursively check whether the value is greater than or equal to the assigned value
    for(int i = 1; i < list.length;i++)
        if (val <= list[i]){
            val = list[i];
        
            
        }
        else{
            returnValue = false;
        
        }
    return returnValue;
        
        
    
    
    
    
    }
}
