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
        int number  = 1;
        for (int i = 0; i < oddArray.length; i++){
            oddArray[i] = number;
            number+=2;
            
    
    }
        for (int i = 0; i < oddArray.length; i ++){
           System.out.print(oddArray[i] + " ");
       } 
        
    }
    
}
