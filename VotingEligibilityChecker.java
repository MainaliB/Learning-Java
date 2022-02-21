/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.Scanner;//get the necessary import
public class VotingEligibilityChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//creating new scanner object
        
        String name;
        int age;
        
        final int VOTINGAGE = 18;
        
        //prompt user for name and age
        
       System.out.println("Please enter your name: ");
       name = input.nextLine();
       
       System.out.println("Please enter your age: ");
       age = input.nextInt();
       
       
       if(age>VOTINGAGE){
           System.out.println(name + " can vote since you are at least 18 years"
                   + " old: " + age);
       }
       else{
           System.out.println(name + " cannot vote since you are not 18 years"
                   + " old yet: " + age);
        
       }
    
    }
}
