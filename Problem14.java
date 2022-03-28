/*
You are given an array of integers that is of length n, and a positive integer 
x. Your job is to rotate the numbers in the array x indices to the right.
 */
public class Problem14 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        
        int[] result = rotateArray(myArray, 7);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
    
    public static int[] rotateArray(int[] myArray, int rotation) {
        //int [] newArray = new int[myArray.length];
        int n = rotation;
        for(int i = 0; i < n; i++){    
            int j, last;    
              
            last = myArray[myArray.length-1];    
            
            for(j = myArray.length-1; j > 0; j--){    
                  
                myArray[j] = myArray[j-1];    
            }    
              
            myArray[0] = last;    
        }
        
        return myArray;
    }    
         
}         
         
         
