import java.util.*;

public class RowWithLargestSum {
    public static void main(String[] args){
        //intialize a two dimensional array of 5 rows and 5 columns
        
        int [] [] matrix = new int [5][5];
        
       
        
        Scanner input = new Scanner(System.in);
        
         //prompt user to put the value
         
         System.out.println("Please enter " + matrix.length + " rows "
                 + "and "+ matrix[0].length+ " columns: ");
         
         for (int row = 0; row < matrix.length; row++){
             for (int column = 0; column < matrix[row].length; column++){
                 matrix[row][column] = input.nextInt();
             
             }
         
         
         }
         /*
          for (int row = 0; row < matrix.length; row++){
             for (int column = 0; column < matrix[row].length; column++){
                 System.out.print(matrix[row][column] + " ");
             
             
             }
             System.out.println();
          
          }
         */
         //initialize integer var max row and index of max row
         int maxRow = 0;
         int indexOfMaxRow = 0;
         
        //get the sum of first row, this will allow us to compare the sum 
         for (int column = 0; column < matrix[0].length; column++){
             maxRow += matrix[0][column];
         }
         for (int row = 1; row < matrix.length; row++){
             int totalOfThisRow = 0;
             for (int column= 0; column<matrix[row].length;column++){
                 totalOfThisRow += matrix[row][column];   
             }
             if (totalOfThisRow > maxRow){
                 maxRow = totalOfThisRow;
                 indexOfMaxRow = row;
             }
         }
    
    System.out.println("For the matrix the Row " + (indexOfMaxRow + 1)+" has the"
            + " maximum sum of "+maxRow );
    }
    
}
