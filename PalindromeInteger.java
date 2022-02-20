/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class PalindromeInteger {
    public static void main(String[] args){
        System.out.println("Please enter the number you wish to get reverse: ");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        
        System.out.println("The reverse of the number " + inputNumber+
                " is: " + reverse(inputNumber));
    }
    
    public static int reverse(int number){
        String intNumber ="";
        String stringFirstNumber = "";
        int digitNumber;
        int remainingNumber;
        
        while (number !=0){
            digitNumber = number %10;
            stringFirstNumber = String.valueOf(digitNumber);
            intNumber = intNumber + stringFirstNumber;
            remainingNumber= number /10;
            number = remainingNumber;
            
        }
        
        return Integer.valueOf(intNumber);
    }
}
