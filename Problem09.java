/*
You are given an array that is randomly filled with either 1's or 2's. Your job
is to move all of the 1's to the start of the array, and all of the 2's to the
end of the array.
 */
public class Problem09 {
    public static void main(String[] args) {
        int[] inputArray = {1,2,2,2,1,1,1,2,1,2};
        
        int result[] = arrangeOnesAndTwos(inputArray);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    
    public static int[] arrangeOnesAndTwos(int[] myArray) {
        int [] newArray = new int[myArray.length];
        int count1=0;
        int count2=0;
        
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i]==1){
                count1++;
            }
            else{
                count2++;
            }
            
        }
        int i = 0;
        while(count1>0){
            newArray[i++]=1;
            count1--;
        }
        while(count2>0){
            newArray[i++]=2;
            count2--;
        }
        
        return newArray;
    }
        
        
}
       
    
    

