/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Asteroid {
    private double goldOre;
    private double silverOre;
    private double platinumOre;
    private double cubicYards;
    
    public Asteroid(){
    }
    
    public Asteroid(double goldore, double silverore, double platinumore, 
            double cubicyards){
        this.goldOre = goldore;
        this.silverOre = silverore;
        this.platinumOre = platinumore;
        this.cubicYards = cubicyards;
    }
    
    public Double getGoldOre(){
        return goldOre;
    }
    
    public boolean mineGoldORe(double number){
        goldOre = getGoldOre()- number;
        cubicYards = getCubicYards() - number;
        
        if (getCubicYards() < 0){
            return false;
        }
        else{
            return true;
        }
        
        
    }
    
    public double getSilverOre(){
        return silverOre;
    }
    
    
    public boolean mineSilverOre(double number){
        silverOre = getSilverOre()- number;
        cubicYards = getCubicYards() - number;
        
        if (getCubicYards() < 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    public double getPlatinumOre(){
        return platinumOre;
    }
    
    public boolean minePlatinumOre(double number){
        platinumOre = getPlatinumOre()- number;
        cubicYards = getCubicYards() - number;
        
        if (getCubicYards() < 0){
            return false;
        }
        else{
            return true;
        }
    
    
    }
    public double getCubicYards(){
        return cubicYards;
    }
    
    public String toString(){
        return goldOre + " " + silverOre+ " "+ platinumOre + " "+ cubicYards;
    
    }
    
    
        
        
}
