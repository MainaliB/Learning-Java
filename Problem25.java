/*
Write a method that will take in a double value and round it upto the
nearest whole number and return it as an integer.
 */
public class Problem25 {
     public static void main(String[] args) {
        System.out.println(roundUp(1.9)); // 2
        System.out.println(roundUp(3.2)); // 4
        System.out.println(roundUp(3.0)); // 3
        System.out.println(roundUp(17.9999)); // 18
    }
    
    public static int roundUp(double number) {
        // Your code here
        return (int)Math.ceil(number);
    }
    
}
