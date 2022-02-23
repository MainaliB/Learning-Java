/*
 
 */
import java.util.*;
public class TestGetRandom {
    public static void main (String[] args){
        //create scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.println("What length number would you like to input: ");
        int length = input.nextInt();//use this lenght to create one dimensional array to read user input
        
        System.out.println("Please enter " +length + " numbers" );
        //create an array with user input
        int [] numbersArray = new int [length];
        for(int i = 0; i < length; i++){
            numbersArray[i] = input.nextInt();
        }
        
        
      /*output a random number between 1 and 54 excluding the numbers passed in 
        as argument
        */ 
        System.out.println("A random number between 1 and 54 that is not in the "
                + "numbers passed in as argument is: " + getRandom(numbersArray));
    
    
    
    }
    
    public static int getRandom(int ...numbers){
        //output following message if no array is passed
        if (numbers.length == 0){
            System.out.println(" No arguments were given!");
        }
        //generate a random number
        int randomNumber = 1 + (int) (Math.random() * 54);
        
        //check if the random number is in the passed argument
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == randomNumber){
                randomNumber = 1 + (int) (Math.random() * 54);
            }
        
        }
        
        return randomNumber;
    }
    
}
