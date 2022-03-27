/*
 Write a method that joins these two arrays together. Every item from the first 
array should be the first half of your new array, and every item of the second 
array should be the second half of your new array.
 */
public class Problem06 {
    public static void main(String[] args) {
        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {6,7,8,9,10};
        
        
        int[] result = joinArrays(firstArray, secondArray);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    
    public static int[] joinArrays(int[] firstArray, int[] secondArray){
        // Your code here
        int [] finalArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray,0,finalArray,0,firstArray.length);
        System.arraycopy(secondArray,0,finalArray,firstArray.length, secondArray.length);
        
        return finalArray;    
        }
        
    }
    

