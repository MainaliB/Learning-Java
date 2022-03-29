/*
Write a program that returns true if two given strings are nearly identical.
Nearly identical means that either all of their characters match, or all
but one match. The strings can be upper or lower case and still be considered 
nearly identical. Both strings will also need to be the same length to be 
considered nearly identical.
 */

public class Problem19 {
      public static void main(String[] args) {
        System.out.println(nearlyIdentical("Test","Tost")); // True
        System.out.println(nearlyIdentical("Java","J ava")); // False
        System.out.println(nearlyIdentical("abcdef","abddef")); // True
        System.out.println(nearlyIdentical("poolside","sidepool")); // False
    }
    
    public static boolean nearlyIdentical(String phrase1, String phrase2) {
        // Your code here
        int count = 0;
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
            
            for(int i = 0; i < phrase1.length(); i++){
                if(phrase1.charAt(i)!= phrase2.charAt(i)){
                    count++;
                }
            }
        }
        
        if ((count < 2)&& (phrase1.length()==phrase2.length())){
            return true;
        }
        else{
            return false;
        }// Your code here

    }
    
}
