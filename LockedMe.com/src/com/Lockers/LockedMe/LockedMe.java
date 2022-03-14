package com.Lockers.LockedMe;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LockedMe {
	
	public final static String path = "D:\\Phase-1_Project\\Files";
	
	
	/**
	 * Method Name: displayMainMenu()
	 * This method print welcome screen and main menu of LockedMe.com
	 * Menu as below:
	 *  1. Retrieving the file names in an ascending order
	 *  2. Business-level operations - add, delete, search files
	 *  3. Option to close application
	 *  
	 */
	public static void displayMainMenu() {
		System.out.println("::::************************************::::");
		System.out.println("     Welcome to LockedMe.com    ");
		System.out.println("                      developed by Manvendra    ");
		System.out.println("::::************************************::::");
        System.out.println("1. Retrieve all files");
        System.out.println("2. File operation - delete, add or search files");
        System.out.println("3. Exit application");	
	}
	
	/** 
	 * Method Name: retrieveAllFiles()
	 * This function retrieve all files in main directory in ascending order
	 * {@value #path} : it contain main directory path
	 */
	
	public static void retrieveAllFiles() {
		File file = new File(path);
		if(file.exists()) {
			List<String> list = Arrays.asList(file.list());
			Collections.sort(list);
			for(String v : list) {
				System.out.println(v);
			}
		}
		else {
			System.out.println("No file exit.");
		}
      
	}

	public static void fileOperations(Scanner scan) {
		//Scanner scan = new Scanner(System.in);
		boolean run = true ;
		do {
			try {
				System.out.println("Choose operation need to perform from below options");
				System.out.println("===================================================");
				System.out.println("1. Add file");
				System.out.println("2. Delete file");
				System.out.println("3. Search file");
				System.out.println("4. Return to main menu");
				System.out.println("===================================================");
				int choice = Integer.parseInt(scan.nextLine());	
				switch(choice) {
				case 1 -> FileOperations.addFile();
				case 2 -> FileOperations.deleteFile();
				case 3 -> FileOperations.searchFile();
				case 4 -> run = false;		
				default -> System.out.println("Invalid input");
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}while(run == true);
	}
	
	/**
	 * Method Name : exit()
	 * This method is used to exit from application.
	 */

	public static void exit() {
		System.exit(0);
	}

}
