/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class TotalArea {
    //create an array or circle 
    public static CircleWithPrivateDataFields[] createCircleArray(){
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        
        for (int i = 0; i < circleArray.length; i ++){
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
       return circleArray; 
    }
    //print an array of circles and their total area
    public static void printCircleArray(CircleWithPrivateDataFields[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius", "Area");
        
        for (int i = 0; i < circleArray.length; i ++){
            System.out.printf("%-30s%-15f\n", circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }
        System.out.println("___________________________________________");
        
        System.out.printf("%-30s%-15f\n","The total area of circle is", sum(circleArray));
        
}
    
    //add circle area
    public static double sum(CircleWithPrivateDataFields[] circleArray){
        double sum = 0;
        
        
        //add areas to sum
        for (int i = 0 ; i< circleArray.length; i ++){
            sum += circleArray[i].getArea();
        }
        return sum;
    }
    
    
    public static void main(String[] args){
        //declare circle array
        CircleWithPrivateDataFields[] circleArray;
        
        //create a circle array
        circleArray = createCircleArray();
        
        //print circle array and total areas of the circle
        printCircleArray(circleArray);
        
    
    
    
    
    }
    

}
    
