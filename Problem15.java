/*
You are given an array of integers that is of length n, and an integer x. 
Your job is to rotate the numbers in the array x indices to the right 
if x is positive and x indices to the left if x is negative.
 */
public class Problem15 {
      public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        int[] result = rotateArray(myArray, 7);
        
        for (int i = 0; i < result.length; i++) {
           System.out.print(result[i] + " ");
        }
        System.out.println();
    
        
        result = rotateArray(myArray, -2);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
    
    public static int[] rotateArray(int[] myArray, int rotation) {
        
        int [] newArray = new int[myArray.length];
        if(rotation >0){
            for(int i = 0; i < myArray.length; i ++){
                newArray[i] = myArray[i];
            }
            //nt [] newArray = new int [myArray.length];
            int n = rotation;
            for(int i = 0; i < n; i++){    
                int j, last;    
              
                last = newArray[newArray.length-1];    
            
                for(j = newArray.length-1; j > 0; j--){    
                  
                    newArray[j] = newArray[j-1];    
                }    
              
                newArray[0] = last;
                
            }
           
            
        }
        
        else  {
            for(int i = 0; i < myArray.length; i ++){
                newArray[i] = myArray[i];
            }
            int n = rotation;
            for(int i = n; i < 0; i++){    
                int j, last;    
              
                last = newArray[0];    
            
                for(j = 0; j < newArray.length-1; j++){    
                  
                    newArray[j] = newArray[j+1];    
                }    
              
                newArray[newArray.length-1] = last;    
            }
            
        
        }
        
        
        return newArray;
    }
    
}
