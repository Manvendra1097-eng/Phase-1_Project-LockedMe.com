package com.Lockers.LockedMe;

import java.util.Scanner;
/**
 * Class Name: ClientApp
 * This contain main of application
 * Inside class
 * Method Name: main
 * Inside method:
 * 1. Display welcome screen and main menu
 * 2. Take input from user form menu options
 * 3. Perform action according to user input
 *    a.retrive all file
 *    b.file operations
 *    c.exit
 * @author manvendra
 *
 */
public class ClientApp {

	public static void main(String[] args) {
		// Variable declaration
		int choice;
		Scanner scan = new Scanner(System.in);
		do {

			try {
				// Displaying main welcome screen and main menu
				LockedMe.displayMainMenu();

				// Asking for user choice
				System.out.println("Please enter your choice");

				// Storing user input
				choice = Integer.parseInt(scan.nextLine());

				// Checking user input and perform action accordingly
				switch(choice) {
				case 1  -> LockedMe.retrieveAllFiles();
				case 2  -> LockedMe.fileOperations(scan);
				case 3  -> LockedMe.exit();
				default -> System.out.println("Invalid input");
				}
			}
			catch (Exception e) {
				System.out.println("Invalid input");
			}

		}while(true);
	}

}
