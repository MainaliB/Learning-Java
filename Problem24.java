/*
Write a method that will take in a double value and round it down to 
the nearest whole number and return it as an integer.
 */
public class Problem24 {
        public static void main(String[] args) {
        System.out.println(roundDown(1.9)); // 1
        System.out.println(roundDown(3.2)); // 3
        System.out.println(roundDown(3.0)); // 3
        System.out.println(roundDown(17.9999)); // 17
    }
    
    public static int roundDown(double number) {
        return (int)(number); 
        // Your code here
    }
    
}
