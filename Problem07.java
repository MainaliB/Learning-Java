/*
Write a method that merges these two arrays together. Every item from the first
array should be in the even indices of your new array and every item from the 
second array should be in the odd indices. The order of each array should be
preserved.
 */
public class Problem07 {
      public static void main(String[] args) {
      int[] firstArray = {1,3,5,7,9};
      int[] secondArray = {2,4,6,8,10};
        
      int[] result = mergeArrays(firstArray, secondArray);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
  public static int[] mergeArrays(int[] firstArray, int[] secondArray){
      int [] finalArray = new int[firstArray.length+ secondArray.length];
      int j = 0;
      for(int i = 0; i < finalArray.length; i = i+2){
          finalArray[i]=firstArray[j];
          j++;
      
      }
      int k = 0;
      for(int i = 1; i < finalArray.length; i = i+2){
          finalArray[i]=secondArray[k];
          k++;
      
      }
      return finalArray;
        // Your code here
    }
    
    
}
