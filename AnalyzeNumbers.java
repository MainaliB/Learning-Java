/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class AnalyzeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        double [] numbers = new double[n];//sysntax to create a single dimension array
        double sum = 0;
        
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i <n; i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
            
        }
        
        double average = sum/n;
        
        int count = 0;
        for (int i = 0; i< n; i++){
            if (numbers[i]> average)
                count++;
        }
        System.out.println("Average is: " + average);
        System.out.println("Number of elements above average is: " + count);
    }
    
}
