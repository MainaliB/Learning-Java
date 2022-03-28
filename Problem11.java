/*
You are given an array that is partially filled with Strings. These strings will
be random and are inconsequential to the problem. Some of the spots in the array
will be empty (null). Your job is to traverse the array and move all null items
to the end of the array.
 */
public class Problem11 {
     public static void main(String[] args) {
        String[] myArray = {"Baseball","Football",null, null, "Soccer",null, "Paintball", null};
        
        String[] result = moveNullsToEnd(myArray);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] moveNullsToEnd(String[] myArray) {
        String [] newArray = new String [myArray.length];

        
        
        for (int i = 0, j = 0; i < myArray.length; i++){
            if(myArray[i]!= null){
                newArray[j]=myArray[i];
                
                j++;
            }
            else {
                continue ;
            }
        }

        
        return newArray;
       
 
    }
}
  

