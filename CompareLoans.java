/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class CompareLoans {
    public static void main(String[] args){
        //create an array to hold the interest rate
        double [] interestRate = new double[25];
        double startingInterestRate = 5.0;//subtract 
        //initialize the array to interest rate
        for (int i = 0; i < interestRate.length; i++){
            interestRate[i] = startingInterestRate;
            startingInterestRate = startingInterestRate + 0.125;
        }
        double [] monthlyPayment = new double[25];
        double [] totalPayment = new double[25];
        double principle ;
        int loanTerm;
        //create new scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to input loan amount and loan years
        System.out.println("Please enter the loan amount, For example 120000.95"
                + " and press enter key: ");
        principle = input.nextDouble();
        
        System.out.println("Please enter number of years as an integer, For"
                + " example 5 and press enter: ");
        loanTerm = input.nextInt();
        
        //calculate monthly payment and total payment
        for (int i = 0; i < interestRate.length; i++){
            monthlyPayment[i] = calcMonthlyPayment(interestRate[i],principle, loanTerm);
                    
            totalPayment[i] = monthlyPayment[i] * 12 * loanTerm;
    
   
    }
        
     //Output  
    System.out.println("Interest Rate   Monthly Payment    TotalPayment");
    for (int i = 0; i < interestRate.length; i++){
        System.out.printf("%8.3f%%%15.2f%19.2f\n",(float)interestRate[i],(float)monthlyPayment[i] ,(float)totalPayment[i]);
    }
    
    
    
    }
    //method to calculate monthly payment
    public static double calcMonthlyPayment(double interestRate, double principle, int loanTerm){
            double monthlyPayment = ((interestRate/(100 * 12)) *
                    principle)/(1-(1/(Math.pow((1 + ((interestRate)/(100 *12))),loanTerm * 12))));
    return monthlyPayment;
    }
    
}
