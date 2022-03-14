package com.Lockers.LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Class Name: FileOperations
 * This class contain all methods related to file operation
 * Inside Class:
 *  1. method addFile() -> to add file
 *  2. method deleteFile() -> to delete file
 *  3. method searchFile() -> to search file
 * @author Manvendra
 *
 */
public class FileOperations {

	// variable declaration
	static Scanner scan = new Scanner(System.in);
	public final static String path = "D:\\Phase-1_Project\\Files";


	/**
	 * Method Name: addFile()
	 * This function is used to add user defined file in directory
	 * Inside method:
	 *  1.Take file name from user
	 *  2.Check if file not exit create file
	 *  3.Ask user for number for line needed to write
	 *  4.write user provide lines in file
	 */
	public static void addFile(){
		File file = new File(path);
		List<String> list = Arrays.asList(file.list());
		System.out.println("Enter name for file");
		String fileName = scan.nextLine();
		if(!(list.contains(fileName+".txt"))) {
			System.out.println("How may line want to write?");
			int lineCount = Integer.parseInt(scan.nextLine());
			System.out.println("Enter file content here");
			try {
				FileWriter fr = new FileWriter(path+"\\"+fileName+".txt");
				for(int i =0; i< lineCount;i++) {
					fr.write(scan.nextLine());
					fr.write('\n');
				}
				fr.close();
			} 
			catch (IOException e) {
				System.out.println("Invalid Input");
			}
			System.out.println("File added successfully.\n");
		}
		else
			System.out.println("file name already exits in directory.");

	}

	/**
	 * Method Name: deleteFile()
	 * this method is used to delete file exist in main directory
	 * Inside method:
	 *  1. Asked user for file name to delete
	 *  2. Check for file is it exist in directory
	 *  3. If file exist delete file otherwise show message "file not found"
	 */
	public static void deleteFile(){
		File file = new File(path);
		List<String> list = Arrays.asList(file.list());
		System.out.println("Enter name of file need to delete");
		try {
			String fileName = scan.nextLine()+".txt";
			if((list.contains(fileName))) {
				File filedelete = new File(path+"\\"+fileName);
				filedelete.delete();
				System.out.println(filedelete.getName()+" is deleted successfully\n");
			}
			else
			{
				System.out.println("File not found");
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}

	}

	/**
	 * Method Name: searchFile()
	 * This method is used to search file from main directory
	 * Inside method:
	 *  1. Asked user for file name to search in main directory
	 *  2. Check if file exist show file path otherwise show message 'file not found"
	 */
	public static void searchFile(){
		File file = new File(path);
		List<String> list = Arrays.asList(file.list());
		System.out.println("Enter name of file need to search");
		try {
			String fileName = scan.nextLine();
			if(list.contains(fileName+".txt")) {
				System.out.println("File exit at "+file.getAbsolutePath()+"\\"+fileName+".txt");
			}
			else
			{
				System.out.println("file not found");
			}
		}	
		catch(Exception e) {
			System.out.println("Invalid input");
		}

	}
}
