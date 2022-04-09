/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Tanker {
    private double totalCapacity;
    private double oxygenContainer;
    private double waterContainer;
    private double liquidContainer;
    private double gasContainer;
    
    public Tanker(){
    }
    
    public Tanker(double totalcapacity){
        this.totalCapacity= totalcapacity;
    }
    
    public boolean addOxygen(double oxygen){
        return true;
    }
    
    public boolean removeOxygen(double oxygen){
        return true;
    }
    
    public boolean addWater(double water){
        return true;
    }
    
    public boolean removeWater(double water){
        return true;
    }
    
    public boolean addLiquid(double liqid){
        return true;
    }
    
    public boolean removeLiquid(double liquid){
        return true;
    }
    
    public boolean addGas(double gas){
        return true;
    }
    
    public boolean removeGas(double gas){
        return true;
    }
    
    public String toString(){
        return totalCapacity + " " + oxygenContainer + " " + waterContainer + " " +
                liquidContainer + " " + gasContainer;
    }
}
