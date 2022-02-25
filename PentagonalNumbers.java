/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class PentagonalNumbers {
    public static void main(String[] args){
        System.out.println("Enter the number of which you wish to get the"
                + " pentagonal number ");
        Scanner input = new Scanner(System.in);
        int numberInput = input.nextInt();
        
        System.out.println("The pentagonal number for "+ numberInput + " is "
                + getPentagonal(numberInput) );
    }
    public static int getPentagonal(int n){
        int pentagonalNumber;
        
        pentagonalNumber = n*(3*n-1)/2;
        
        return pentagonalNumber;   
    }
        
    }
        
    
    

