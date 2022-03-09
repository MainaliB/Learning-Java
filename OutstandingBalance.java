/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
//create a program that allows user to input their car loan information and calcuate an outstanding balance after n number of months
//work in progress
public class OutstandingBalance {
    double loanAmount;
    double annualInterestRate;
    double monthlyPayment;
    int numberOfMonths;
    double outstandingBal;
    
    /*The logic:
    1. create an outstanding balance object
    2. create a static method to calculate the outstanding balance after certain months*/
    //constructor
   public OutstandingBalance(double loanAmount, double annualInterestRate, double monthlyPayment, int numberOfMonths, double outstandingBal){
       this.loanAmount = loanAmount;
       this.annualInterestRate= annualInterestRate;
       this.monthlyPayment= monthlyPayment;
       this.numberOfMonths= numberOfMonths;
       this.outstandingBal= outstandingBal;
   
   }
   
   public double getOutstangingBal(double monthlyPayment, int numberOfMonths, double annualInterestRate, double loanAmount ){
       double outstandingBal = loanAmount;
       double balanceBeforeN;
       for(int i = 0; i <=numberOfMonths; i++){
           
       }
       
       
       
       
       
       return outstandingBal;
   
   
   }
    
}
