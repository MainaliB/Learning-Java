/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Exercise12_07 {
    public static void main(String[] args){
        //lets prompt user for input
        Scanner input = new Scanner(System.in);
        String userInput;
        
        System.out.println("Please enter a binary string. Binary string consists"
                + " of 0s and 1s ");
        userInput = input.nextLine();
        //using try and catch to try the block of code and catch exception
        try{
            System.out.println(bin2Dec(userInput));
            //System.out.println(bin2Dec("141111111"));
        
        
        }
        catch (InputMismatchException ex){
            System.out.println("Try again. (Incorrect input:"
                    + " it can only contain 0 or 1.");
        
        }
    
    
    }
    
    /*Trying to create a class with method that takes in string of binary digits, 
    contains a method that converts the binary digit string to decimal number if the string
    is binary otherwise, throws NumberFormatException */
    
    //wrong way of getting binary to decimal as the powering of 2 works from opposite direction
    //fix it
public static int bin2Dec(String binaryString){
    double decNumber=0;
    int lenOfString = binaryString.length();
    int j = 0;//use this variable to get the power of 2 to get the decimal number
    for (int i = binaryString.length() ; i >0 ;i--){
        if( (binaryString.charAt(i-1) != '0') &&//use this logic to check if the number is not equal to 0 and 
                //if it is not equal to 1
                (binaryString.charAt(i-1) != '1')){
            throw new InputMismatchException ("Binary digit only contains 0 and 1");
   
        }
        else {
            decNumber = decNumber + (binaryString.charAt(i-1)-'0') * (int)Math.pow(2,j);
            //decNumber = decNumber + (Integer.valueOf(binaryString.charAt(i-1))
                   // * Math.pow(2,j)); wont work because gives the decimal value from ascii table
            
            j++;
            
        }
    }

return (int)(decNumber);
}    
    
}
