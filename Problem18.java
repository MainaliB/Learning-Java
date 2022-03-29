/*
Write a method that accepts a large string. This method will return true 
if the string starts with or ends with the word "Java". This word can be any
variation with uppercase or lowercase letters.
 */
public class Problem18 {
      public static void main(String[] args) {
        System.out.println(startsOrEndsWithJava("JavaTest")); // True
        System.out.println(startsOrEndsWithJava("JaVaTest")); // True
        System.out.println(startsOrEndsWithJava("TestJa va")); // False
        System.out.println(startsOrEndsWithJava("TestJava")); // True
        System.out.println(startsOrEndsWithJava("TestJAVA")); // True
    }
    
    public static boolean startsOrEndsWithJava(String phrase) {
        int endLastIndex = phrase.length();
        int endStartIndex = phrase.length()-4;
        
        int startIndex=0;
        int startEndIndex=4;
                
        
        if(((phrase.substring(endStartIndex,endLastIndex)).toLowerCase().compareTo("java") == 0)||
            ((phrase.substring(startIndex,startEndIndex)).toLowerCase().compareTo("java") == 0)){
            return true;
        }
        else{
            return false;
        
        }


// Your code here
    }
    
}
