
import java.util.*;
public class ConvertNumberStringToNumbers {
        public static void main(String[] args){
            System.out.println("Please enter the string number you want to "
                    + " convert: ");
            Scanner input = new Scanner(System.in);
            
            String numString = input.next();
            
            System.out.println("Your converted number is: " + converter(numString));
        }
   
    public static int converter(String s) {
          int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result = result * 10 + (s.charAt(i) - '0');
    }
    return result;
  }
   

    
}
