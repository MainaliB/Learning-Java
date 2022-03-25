/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Problem01 {
    public static void main(String[] args){
        fillArray();
        
    
    
    }
    public static void fillArray(){
        int [] myArray = new int [100];
        for (int i = 0; i < myArray.length; i++){
            myArray[i]=i;  
            System.out.print(i);
            System.out.print(" ");
        }
        
    }
    
}
