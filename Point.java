/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Point {
    private double xValue;
    private double yValue;
    
    public Point(){
    }
    
    public Point(double xvalue, double yvalue){
        this.xValue = xvalue;
        this.yValue = yvalue;
    }
    
    public double getXValue(){
        return xValue;
    }
    
    public double getYValue(){
        return yValue;
    }
    
    public String toString(){
        return "x-coordinate " + xValue + " and y-coordinate " + yValue;
    }
    
    
}
