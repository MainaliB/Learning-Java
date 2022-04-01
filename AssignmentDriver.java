/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
import java.util.Scanner;
public class AssignmentDriver {
    StudentMethods studentMethods = new StudentMethods();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AssignmentDriver();
	}

	public AssignmentDriver() {
		String[] cargohold = new String[10];
		System.out.println("Welcome to the Revenge Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the cargo hold.");
			System.out.println("2: Remove an item from the cargo hold.");
			System.out.println("3: Sort the contents of the cargo hold.");
			System.out.println("4: Search for an item.");
			System.out.println("5: Display the items in the cargo hold.");
			System.out.println("0: Exit the Discipulus Cargo Hold interface.");
			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			switch (userChoice) {
				case 1:
					studentMethods.addItem(cargohold);
					break;
				case 2:
					studentMethods.removeItem(cargohold);
					break;
				case 3:
					studentMethods.sortItems(cargohold);
					break;
				case 4:
					studentMethods.searchItems(cargohold);
					break;
				case 5:
					studentMethods.displayItems(cargohold);
					break;
				case 0:
					System.out.println("Thank you for using the Discipulus Cargo Hold interface. See you again soon!");
					System.exit(0);
			}
		}
	}
    
}
