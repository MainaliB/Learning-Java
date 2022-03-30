/*
You are given 2 different arrays of the different sizes that 
are filled with numbers. 

Write a method that zips these two arrays together. Each index should alternate 
like the merge from problem 7, but once one array has been emptied all other 
elements from the non-empty array should be added consecutively.
 */
public class Problem08 {
        public static void main(String[] args) {
        int[] firstArray = { 1, 3, 7 };
        int[] secondArray = { 2, 4, 6, 8, 10 };

        int[] result = zipArrays(firstArray, secondArray);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] zipArrays(int[] firstArray, int[] secondArray) {
        // Your code here
        int [] finalArray = new int[firstArray.length+ secondArray.length];
        //int j = 0;
        //int i = 0;
        for (int j = 0, k = 0; j < firstArray.length;j++){
            finalArray[k]=firstArray[j];
            k+=2;
            //finalArray[j+1]=secondArray[j];
            ;   
        }
        //int k = firstArray.length;
        for (int i=0, m = 1;i < firstArray.length; i++ ){
            finalArray[m]=secondArray[i];
            m+=2;
              
        }
        
        for(int i =  (2 * firstArray.length), j = firstArray.length;  i < finalArray.length; i ++){
            finalArray[i]= secondArray[j];
            j++;
        }
        /*
        int k = 0;
        for(int l = 1; l < finalArray.length; l = l+2){
            finalArray[l]=secondArray[k];
            k++;
      
      }*/
    return finalArray;
    }
    
}
