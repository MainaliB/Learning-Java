/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class TestPlusOne {
      public static void main(String[] args){
        
        //asks user for array length and then creates array from user input
        System.out.println("Please enter the length of the array you would like to input: ");
        Scanner input = new Scanner(System.in);
        int lenOfArray = input.nextInt();
        
        int [] arrayA = new int [lenOfArray];
    System.out.println("Please enter the numbers for array: ");
    for (int i = 0; i < lenOfArray; i ++){
        arrayA[i] = input.nextInt();
    
    }
    
    
    //we have to account for arrays like [9,8,7,6,5,4,3,2,1,0]
    //work to fix it
    String result = "";
    for(int i = 0; i < (arrayA.length); i ++){
        result = result + Integer.toString(arrayA[i]);
        System.out.println("the out put is " + result);
           
        
        }
        
    
    
    
    //System.out.println("The result is " + getString(arrayA));
    
    
}
    
    
    
    
    
    public static String getString(int []a){
        String result = "";
        for(int i = 0; i < (a.length-1); i ++){
            result = Integer.toString(a[i]);
            System.out.println("the out put is " + result);
           
        
        }
        
        
    
    return result;
    
    }
    
}
