/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    Date loanDate;
    
    //create a no-args constructor
public Loan(){
    this (2.5, 1, 1000);
    }
    //construct a loan with specified annual interest rate, number of years, and loan amount
 public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
     this.annualInterestRate = annualInterestRate;
     this.numberOfYears = numberOfYears;
     this.loanAmount = loanAmount;
     loanDate = new Date();
     
 }  
 
 // return annual interest rate
 public double getAnnualInterestRate(){
     return annualInterestRate;
 }
 
 //set new annualInterestRate
 public void setAnnualInterestRate(double annualInterestRate){
     this.annualInterestRate = annualInterestRate;
 }
 
 //return number of years
 public int getNumberOfYears(){
     return numberOfYears;
 }
 
 //set a new NumberOfYears
 public void setNNumberOfYears(int numberOfYears){
     this.numberOfYears = numberOfYears;
 }
 
 //return loanAmount
 public double getLoanAmount(){
     return loanAmount;
 }
 
 //find monthly payment
 public double getMonthlyPayment(){
     double monthlyInterestRate = annualInterestRate / 1200;
     double monthlyPayment = loanAmount * monthlyInterestRate /(1 - 
             (1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
     return monthlyPayment;
     
 }
 
 //find total payment
 public double totalPayment(){
     double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
 }
 
 //return loan date
 public Date getLoanDate(){
     return loanDate;
 }
 //main method to test the program
 public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter the loan amount: ");
     double loanAmount = input.nextDouble();
     System.out.println("Please enter the annual interest rate: ");
     double annualInterestRate = input.nextDouble();
     System.out.println("Please enter the number of years you are taking the loan");
     int numberOfYears = input.nextInt();
     
     Loan loan1 = new Loan(annualInterestRate,numberOfYears, loanAmount );
     System.out.printf("Your total monthly payment is $%2.2f and your total payment will be $%2.2f", 
             loan1.getMonthlyPayment(),
             loan1.totalPayment());
 
 }
}
