/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;
public class Location {
    
    
    
    
    //method to return the index of the largest value in a 2 dimensional array
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
    //method to return the largest value in the array
    public static double largestValue(double [][]a){
        
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
        
        
        return max;
    }
    
}
