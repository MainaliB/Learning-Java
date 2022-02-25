/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the radius and the length of the "
                + "cylinder");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        double areaOfCylinder = radius * radius * Math.PI;
        
        double volumeOfCylinder = areaOfCylinder * length;
        
        
        System.out.println("The area is " + areaOfCylinder);
        System.out.println("The volume is " + volumeOfCylinder);
        
    
    }
    
}
