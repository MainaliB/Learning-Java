/*
Write a method that accepts an array of ints that has been filled with a 
random number between 1-10 at each index. Your method should count the number
of times that the number 7 appears in the array.
 */
public class Problem05 {
     public static void main(String[] args) {
        int myArray[] = {1,2,3,4,5,6,7,8,9,10,7,7,7};
        System.out.println(countSevens(myArray));
    }

    public static int countSevens(int[] myArray) {
        int count = 0;
        int numToFind = 7;
        
        for(int i = 0; i < myArray.length; i ++){
            if (myArray[i]==numToFind){
            count ++;
            }
            else{
            count = count;
            }
        
        }
        return count;
      // Your code here
    }
    
}
