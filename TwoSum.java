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
    System.out.println("Please enter the length for the array: ");
    Scanner input = new Scanner(System.in);
    int lenArray = input.nextInt();
    
    int [] arrayA = new int [lenArray];
    System.out.println("Please enter the numbers for array: ");
    for (int i = 0; i < lenArray; i ++){
        arrayA[i] = input.nextInt();
    
    }
    
    System.out.println("Please enter the target value: ");
    int target = input.nextInt();
    
    System.out.println(getIndex(arrayA, target));
    }
    public static int[] getIndex(int[] a, int target){
    int [] outputIndex = new int [2];
    for (int i = 0; i < a.length; i++){
        int numToFind = target - a[i];
        for (int j = i+1; j < a.length; j++){
            if (j == numToFind){
                outputIndex[0] = i;
                outputIndex[1] = j;
            
            }
              
                }
        //work in progress
    }
   
    return outputIndex;
    
    }
    
}
