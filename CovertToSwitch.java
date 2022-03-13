/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class CovertToSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of years");
        int numberOfYears = input.nextInt();
        double annualInterestRate;
    switch(numberOfYears%210){
        case 7: annualInterestRate = 7.25;System.out.println(annualInterestRate); break;
        case 15: annualInterestRate = 8.50;System.out.println(annualInterestRate);break;
        case 30: annualInterestRate = 9.0;System.out.println(annualInterestRate);break;
        default : System.out.println("Wrong number of years");
        System.exit(0);
    
    
    }
    
    }
    
}
