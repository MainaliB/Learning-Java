/*
You are given an array of integers that is of length n, and a positive integer 
x where x < n. Your job is to rotate the numbers in the array x indices to
the right.
 */
public class Problem13 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        
        int[] result = rotateArray(myArray, 3);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] rotateArray(int[] myArray, int rotation) {
       // Your code here
       int [] newArray = new int[myArray.length];
       int i = 1;
       int r = rotation;
       while(r>0){
       newArray[r-1]=myArray[myArray.length-i];
       r--;
       i++;
       }
       
      
       
       
       int j = 0;
       int k = rotation;
       while(k < myArray.length){
           newArray[k]= myArray[j];
           k++;
           j++;
       }
       
       
       return newArray;
    }
    
}
