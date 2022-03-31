/*
Write a method that returns true if a given number is a multiple of 3 or 5
 */
public class Problem27 {
       public static void main(String[] args) {
        System.out.println(multipleOfThreeOrFive(1)); // False
        System.out.println(multipleOfThreeOrFive(3)); // True
        System.out.println(multipleOfThreeOrFive(5)); // True
        System.out.println(multipleOfThreeOrFive(9)); // True
        System.out.println(multipleOfThreeOrFive(15)); // True
    }
    
    public static boolean multipleOfThreeOrFive(int number) {
        if(number % 3 ==0 || number % 5 ==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
