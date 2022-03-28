/*
You are given an array of integers that is of length n. Your job is to rotate 
the numbers in the array one index to the right.
 */
public class Problem12 {
     public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5 };

        rotateRight(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static void rotateRight(int[] myArray) {
        int [] newArray = new int [myArray.length];
        
        newArray[0] = myArray[myArray.length-1];
        
        for(int i = 0; i < myArray.length-1; i ++){
            newArray[i+1] = myArray[i];
        }
        // Your code here
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = newArray[i];
        
        }
            
    }
    
}
