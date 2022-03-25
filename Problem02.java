/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Problem02 {
        public static void main(String[] args) {
        fillArrayWithOdds();
    }
    
    public static void fillArrayWithOdds() {
        int [] oddArray = new int [100];
        //fill in the first value of the array
        oddArray[0] = 1;
        for (int i = 1; i < oddArray.length; i++){
            oddArray[i] = oddArray[i-1]+2;
    
    }
        
    }
    
}
