/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
/*
Write a program that creates an array of length 100, 
and fills it with only numbers that are multiples of 3 or 5 (3,5,6,9,10,12,15 ...). 
Once the array is filled print out each item of the array (all items on one line,
separated by a space)

*/
public class Problem03 {
       public static void main(String[] args) {
        fillWithThreesAndFives();
    }
    
    public static void fillWithThreesAndFives() {
        int [] myArray = new int [100];
        int number = 3;
        for(int i = 0; i < myArray.length;i++){
            while(number % 3 != 0 && number%5 !=0){
                number ++;
            }
            myArray[i] = number;
            number ++;
        }
       for (int i = 0; i < myArray.length; i ++){
           System.out.print(myArray[i] + " ");
       } 
    }
        
    
}
