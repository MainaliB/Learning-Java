/*
Write a program that creates an array of length 25, and fills it with Fibonacci 
sequence until the array is full. Once the array is filled print out each item 
of the array (all items on one line, separated by a space).

The Fibonacci sequence is the series of numbers where each number is the sum of 
the two preceding numbers.
 */
public class Problem04 {
      public static void main(String[] args) {
        fillWithFibonacci();
    }
    
    public static void fillWithFibonacci() {
        int [] myArray = new int [25];
        int number1 = 0;
        int number2 = 1;
        myArray[0] = number1;
        myArray[1] = number2;
        
        for(int i = 2; i < myArray.length;i++){
            if (number1 < number2){
                number1 = number1+ number2;
            }
            else{
                number2 = number1 + number2;
            }
            
            
            myArray[i] = Math.max(number1, number2);
            
        }
        for (int i = 0; i < myArray.length; i ++){
           System.out.print(myArray[i] + " ");
        }
    }
    
}
