/*
Write a method that accepts a large string. This method will return true if 
the string contains the word "Java". This word can be any variation with
uppercase or lowercase letters.
 */
public class Problem17 {
   public static void main(String[] args) {
        System.out.println(containsJava("JavaTest")); // True
        System.out.println(containsJava("JaVaTest")); // True
        System.out.println(containsJava("TestJa va")); // False
        System.out.println(containsJava("JaTestva")); // False
    }
    
    public static boolean containsJava(String phrase) {
        if(phrase.toLowerCase().contains("java")){
            return true;
        }
        else{
            return false;
        }
        // Your code here        
    }    
    
}
