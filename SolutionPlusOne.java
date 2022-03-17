/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */

/*
You are given a large integer represented as an integer array digits, where each digits[i] 
is the ith digit of the integer. The digits are ordered from most significant to least significant
in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.


Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].


*/


//make changes to the program-- if the input array is [9,9], the output must be [1,0,0]
import java.util.*;
public class SolutionPlusOne {
    //main method to test the program
    public static void main(String[] args){
        
        //asks user for array length and then creates array from user input
        System.out.println("Please enter the length of the array you would like to input: ");
        Scanner input = new Scanner(System.in);
        int lenOfArray = input.nextInt();
        
        int [] arrayA = new int [lenOfArray];
    System.out.println("Please enter the numbers for array: ");
    for (int i = 0; i < lenOfArray; i ++){
        arrayA[i] = input.nextInt();
    
    }
    //prints result
    System.out.println("the result is " + plusOne(arrayA)) ;        
    
    
    
    }
    
    //method that adds plus one to the last element of the array
    
    public static String plusOne(int[] a){
        
        //create a conditional statement to ensure we create a right lenght array if the last value in the 
        // array is 9
        int result = 0;
        for(int i = 0; i < a.length; i ++){
            result = result * 10 + a[i];
        
        
        }
        int finalInt = result + 1;
        String finalIntString = Integer.toString(finalInt);
        
        /*
        if (a[(a.length-1)] == 9){
            int [] newArray = new int [a.length + 1];
            for(int i = 0; i < a.length-1; i++){
                newArray[i] = a[i];
            }
            newArray[a.length-1] = 1;
            newArray[a.length] = 0;
         return newArray;
            
        }
        else {
            int [] newArray = new int [a.length];
            for(int i = 0; i < a.length-1; i++){
                newArray[i] = a[i];
            }
            newArray[a.length-1] = a[a.length-1]+1;
        return newArray;
        }
*/
  return finalIntString;      
        
        
  
    
}
}

// first,  convert the input array of integer into a number ex [1,2,3] becomes 123
// then add 1 to that number so 123 becomes 124
// then change 124 to string
// then change string to char one by one while adding it to a new array
// then return the array

