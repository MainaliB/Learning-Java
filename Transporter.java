/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Transporter {
    private double cargoCapacity;
    private int personelleCapacity;
    private String[][] cargo;
    private String [] personelle;
    
    
    public Transporter(){
    
    }
    
    public Transporter(int cargocapacity, int personellecapacity){
        this.cargo = new String [cargocapacity][cargocapacity];
        this.personelle = new String[personellecapacity];
    
    }
    
    public boolean addCargo(String nameItem, double weightItem){
        for (int i = 0; i < cargo.length-1; i++){
            for (int j = 0; j < cargo[0].length; j++){
                if (cargo[i][j] == null){
                    cargo[i][j] = nameItem;
                    cargo[i+1][j] = Double.toString(weightItem);
                    return true;
            }
            
            
            }
            
        }
        return false;
    }
    
    
    public boolean removeCargo(String nameItem){
        for (int i = 0; i < cargo.length-1; i++){
            for (int j = 0; j < cargo[0].length; j++){
                if (cargo[i][j].compareTo(nameItem)== 0){
                    cargo[i][j] = null;
                    cargo[i+1][j] = null;
                    return true;
            }
            
            
            }
            
        }
        return false;
    }
    
    public boolean addPersonelle(String name){
        for (int i = 0; i < personelle.length; i ++){
            if (personelle[i]==null){
                personelle[i]=name;
                return true;
            }
        
        }
        return false;
    
    }
    
    public boolean removePersonelle(String name){
        for (int i = 0; i < personelle.length; i ++){
            if (personelle[i].compareTo(name)==0){
                personelle[i]=null;
                return true;
            }
        
        }
        return false;
    }
    
    public String toString(){
        return "Transporter Cargo Capacity: " + cargoCapacity + 
                "Personelle Capacity: " + personelleCapacity +
                "Cargo: " + cargo +
                " Personelle: " + personelle;
                
    
    }
}
