
import java.util.*;
public class GetMaxMinAverage {
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);
        int n;
        //ask user for the lenght
        System.out.println("How many numbers would you like to enter: ");
        n = input.nextInt();
        //create an array that holds the user input
        int [] userInput = new int[n];
        //prompt user for their numbers
        System.out.println("Please enter the numbers: ");
        for (int i = 0; i <n; i++){
            userInput[i] = input.nextInt();
        }
        
        System.out.println("The max for the array is: " + getMax(userInput)+
                " , the average is: " + getAverage(userInput) + " and the"
                        + " min is: " + getMin(userInput));
    }
    //create a method to get the max
    public static int getMax(int [] array){ //always provide the name of the array in the argument
        int max = 0;
        for (int i = 0; i<array.length;i++){
            if(max < array[i]){
                max=array[i];
            }
            else {
                max = max;}
            
        
        }
        return max;
    }
    
    //create a method to get the average
    public static float getAverage(int [] array){
        int sum = 0;
        float average;
        
        for (int i = 0; i< array.length; i++){
            sum = sum + array[i];
        }
        average = sum / ((float)(array.length));
        
        return average;
         
        
        
    }
    //create a method to get min
    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            int temp = array[i];
            if (temp < min){
                min = temp;
            }
            else {
            min = min;
            }
        }
        return min;
    
    }
    
    
}
