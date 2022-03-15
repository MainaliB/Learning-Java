/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/
import java.util.*;
public class TwoSum {
    
    public static void main(String[] args){
        //prompt user for input array and the target val
    System.out.println("Please enter the length for the array: ");
    Scanner input = new Scanner(System.in);
    int lenArray = input.nextInt();
    
    int [] arrayA = new int [lenArray];
    System.out.println("Please enter the numbers for array: ");
    for (int i = 0; i < lenArray; i ++){
        arrayA[i] = input.nextInt();
    
    }
    
    System.out.println("Please enter the target value: ");
    int targetVal = input.nextInt();
    
    if ((getIndex(arrayA, targetVal).length) ==0){
        System.out.println("The numbers in the array do not add up to the target value");
    
    }
    else{
        System.out.println("The numbers in index "+ getIndex(arrayA, targetVal)[0] +
                " and index "+ getIndex(arrayA, targetVal)[1]+ " adds up "
                        + " to the target value" );
    
    }
   
    }
    public static int[] getIndex(int[] a, int target){
    int [] outputIndex = new int [2];
    for (int i = 0; i < a.length; i++){
        int numToFind = target - a[i];
        for (int j = i+1; j < a.length; j++){
            if (a[j] == numToFind){
                outputIndex[0] = i;
                outputIndex[1] = j;
            
            }
              
                }
        //work in progress
    }
   
    return outputIndex;
    
    }
    
}
