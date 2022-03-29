/*
Write a method that accepts a large string. This method will return true if the
string starts with the word "Java". This word can be any variation with 
uppercase or lowercase letters.
 */
public class Problem16 {
     public static void main(String[] args) {
        System.out.println(startsWithJava("JavaTest")); // True
        System.out.println(startsWithJava("JaVaTest")); // True
        System.out.println(startsWithJava("TestJava")); // False
        System.out.println(startsWithJava(" JavaTest")); // False
    }
    
    public static boolean startsWithJava(String phrase){ 
        if((phrase.substring(0,4)).toLowerCase().compareTo("java") == 0){
            return true;
        }
        else{
            return false;
        
        }
        // Your code here
    }
    
}
