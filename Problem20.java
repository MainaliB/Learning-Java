/*
Write a program that accepts two different strings and returns the number of 
characters that are different. Either string can be null, or of any length. 

If one string is null and the other is not, all of the characters are different.
 */
public class Problem20 {
        public static void main(String[] args) {
        System.out.println(countDifferences(null, "Tost")); // 4
        System.out.println(countDifferences(null, null)); // 0
        System.out.println(countDifferences("abcdef", "abddef")); // 1
        System.out.println(countDifferences("poolside", "sidepool")); // 8
    }

    public static int countDifferences(String phrase1, String phrase2) {
        int count=0;
        
        int lengthOfString;
        if((phrase1== null) && (phrase2 == null)){
            count = 0;
        }
        else if ((phrase1 == null) && (phrase2 != null)){
            count = phrase2.length();
    
        }
        else if ((phrase1 != null) && (phrase2 == null)){
            count = phrase1.length();
    
        }
        else{
            if (phrase1.length()<phrase2.length()){
                lengthOfString = phrase2.length();
            }
            else{
                lengthOfString = phrase1.length();
            }
            for(int i = 0; i < lengthOfString; i++){
                if(phrase1.charAt(i)!= phrase2.charAt(i)){
                    count++;
            }
        }
            
           
        
        
        
        }
        return count;// Your code here

    }   
}
