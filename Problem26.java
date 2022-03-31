/*
Write a method that will take in a double value and round it to 
the nearest whole number. Return this number as an integer.
 */
public class Problem26 {
       public static void main(String[] args) {
        System.out.println(round(1.9)); // 2
        System.out.println(round(3.2)); // 3
        System.out.println(round(3.0)); // 3
        System.out.println(round(17.9999)); // 18
        System.out.println(round(6.500001)); // 7
        System.out.println(round(6.499999)); // 6
    }
    
    public static int round(double number) {
        // Your code here
        return (int) Math.round(number);
    }
    
}
