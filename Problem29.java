/*
Write a method that accepts 4 integers and returns true if these 4 integers
are evenly spaced out (that is, they all have the same number of integers 
between them)
 */
public class Problem29 {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(1,2,3,4)); // True
        System.out.println(evenlySpaced(1,3,4,5)); // False
        System.out.println(evenlySpaced(1,3,5,7)); // True
        System.out.println(evenlySpaced(1,11,21,31)); // True
        System.out.println(evenlySpaced(10, 20, 30, 39)); // False
    }
    
    public static boolean evenlySpaced(int a, int b, int c, int d) {
        // Your code here
        if((b-a==c-b) && (d-c == c-b)){
            return true;
        
        }
        else{
            return false;
        }
    }
    
    
}
