package com.Lockers.LockedMe;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		
		try {
			// Variable declaration
			int choice;
		    try (Scanner scan = new Scanner(System.in)) {
				do {
					// Displaying main welcome screen and main menu
					LockedMe.displayMainMenu();
					
					// Asking for user choice
					System.out.println("Please enter your choice");
					
					// Storing user input
					choice = Integer.parseInt(scan.nextLine());
					
					// Checking user input and perform action accordingly
					switch(choice) {
					case 1  -> LockedMe.retrieveAllFiles();
					case 2  -> LockedMe.fileOperations();
					case 3  -> LockedMe.exit();
					default -> System.out.println("Invalid input");
					}	
				}while(true);
			}
		} 
		
		catch (Exception e) {
			System.out.println("Error occur contact administrator");
		}

	}

}
