/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */

import java.util.*;
public class LocateLargestElement {
    public static void main(String[] args){
        //create a scanner object
        Scanner input = new Scanner(System.in);
        
        int row;
        int col;
        
        System.out.println("Enter the number of rows and columns of the array: ");
        row = input.nextInt();
        col = input.nextInt();
        double [][] numbersArray = new double [row][col];
        System.out.println("Enter the array");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j ++){
                numbersArray[i][j] = input.nextDouble();
                
            }
        }
      
        System.out.println("The row and column index of the largest element is: "
        + "<"+ locateLargest(numbersArray)[0] +","+locateLargest(numbersArray)[1]+
                ">");
    
    }
    //method to return the row and columns index of the largest value in the array
    public static int[] locateLargest(double [][]a){
        
        double max = a[0][0];
        int [] indexOfMax = new int[2];
        indexOfMax[0]=0;
        indexOfMax[1]=0;
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (a[i][j]>max){
                    indexOfMax[0] = i;
                    indexOfMax[1] = j;
                    max = a[i][j];
                }
               
                        
                }
            }
        
        
        return indexOfMax;
    }
    
}
