/*
You are given an array that is partially filled with Strings. These strings will 
be random and are inconsequential to the problem. Some of the spots in the array
will be empty (null). Your job is to traverse the array and print out each 
string. If the spot in the array contains a null value, skip it completely. 
 */
public class Problem10 {
    public static void main(String[] args) {
        String[] myArray = { "Baseball", "Football", null, null, "Soccer", null, "Paintball", null };

        printWithoutNulls(myArray);
    }

    public static void printWithoutNulls(String[] myArray) {
        
        for(int i =0; i < myArray.length; i++){
            if(myArray[i] != null){
                System.out.print(myArray[i] + " ");
            }
            else{
                continue;
            }
        
        }
        // Your code here
    }
    
}
