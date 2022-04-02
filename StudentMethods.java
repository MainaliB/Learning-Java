/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.*;

public class StudentMethods {
    
    //create a scanner object to read user input
    
    Scanner input = new Scanner(System.in);
	public void addItem(String cargohold[]) {
                
		System.out.println("Please enter the item you want to add: ");
		String newItem = input.nextLine();
		// Add an item that is specified by the user
			for (int i = 0;  i< cargohold.length; i++) {
                            
                            if (cargohold[i]!= null){
                                continue;
                            }
                            else{
                                ///if cargohold
				cargohold[i]= newItem;
                                break;
                            }  
				
			}
			
			
			
		
	}

	public void removeItem(String cargohold[]) {
		//  Remove an item that is 
                
		System.out.println("Please enter the item you would like to remove: ");
		String itemToRemove = input.nextLine();
                
                int count = 0;
                for(int i = 0; i < cargohold.length; i++){
                    if(cargohold[i]!= null){
                        count++;
                    }
                }
                String [] tempArray = new String[count];
                for (int i = 0; i<count; i ++){
                    tempArray[i] = cargohold[i];
                }
                for (int i = 0; i<count; i ++){
                    if (itemToRemove.equals(tempArray[i])){
                        tempArray[i]=null;
                        break;
                        
                    }
                }
                for (int i = 0; i<count; i ++){
                    System.out.println(tempArray[i]);
                }
                
                
    
	}

        
	public void sortItems(String cargohold[]) {
		// TODO: Sort the items in the cargo hold (No need to display them here) - Use
		// Selection or Insertion sorts
		// NOTE: Special care is needed when dealing with strings! research the
		// compareTo() method with strings
                int count = 0;
                for(int i = 0; i < cargohold.length; i++){
                    if(cargohold[i]!= null){
                        count++;
                    }
                }
                if(count <1){
                    System.out.println("The cargohold is empty. Please add items");
                }
                else{
                    String [] tempArray = new String[count];
                    for (int i = 0; i<count; i ++){
                        tempArray[i] = cargohold[i];
                    }
                    if (tempArray.length < 2){
                        System.out.println(tempArray[0]);
                    }
                    else{
                       
                        
                        for (int i = 0; i< tempArray.length-1; i ++){
                            for (int j = i+1; j < tempArray.length; j++){
                                if (tempArray[i].compareTo(tempArray[j]) >0){
                                    String temp = tempArray[i];
                                    tempArray[i]=tempArray[j];
                                    tempArray[j]=temp;
                                    
                                }
                            
                            }
                                
                        
                        }
                    for (int i = 0; i < tempArray.length; i ++){
                        System.out.println(tempArray[i]);
                    }
                    
                    }
                    
                    }
                
                
                
                }
                
                
                
	

	public void searchItems(String cargohold[]) {
		// TODO: Search for a user specified item
		System.out.println("Please enter the item you would like to search: ");
		String itemToSearch = input.nextLine();
		for (int i = 0; i <cargohold.length;i++) {
			if(cargohold[i].compareTo(itemToSearch)==0) {
				System.out.println("The item is already present in the cargohold");
                                break;
			}
			else {
				System.out.println("The item is not in the cargohold");
                                break;
			}
			
		}
	}

	public void displayItems(String cargohold[]) {
		// TODO: Display only the unique items along with a count of any duplicates
		// For example it should say
		// Food - 2
		// Water - 3
		// Ammunition - 5
                int count = 0;
                for(int i = 0; i < cargohold.length; i++){
                    if(cargohold[i]!= null){
                        count++;
                    }
                }
                String [] tempArray = new String[count];
                for (int i = 0; i<count; i ++){
                    tempArray[i] = cargohold[i];
                }
		boolean visited [] = new boolean[tempArray.length];
		
		Arrays.fill(visited,  false);
		
		for (int i = 0; i < tempArray.length; i ++) {
			if (visited[i] == true)
				continue;
			int count1 = 1;
			for (int j = i+1; j < tempArray.length; j++) {
				if ((tempArray[i].compareTo(tempArray[j])==0)) {
					visited[j]=true;
					count1 ++;
					
				}
                                
                              
			}
                
			System.out.println(tempArray[i] + " - " + count1 );
                }
	}
    
}
