package com.Lockers.LockedMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	
	// variable declaration
	static Scanner scan = new Scanner(System.in);
	public final static String path = "D:\\Phase-1 Project\\Files";
	
	static File file = new File(path);
	static List<String> list = Arrays.asList(file.list());
	
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
				e.printStackTrace();
			}
			System.out.println("File added successfully.");
		}
		else
			System.out.println("file name already exits in directory.");
		
	}
	
	public static void deleteFile(){
		System.out.println("Enter name of file need to delete");
		String fileName = scan.nextLine();
		if((list.contains(fileName+".txt"))) {
			File filedelete = new File(path+"\\"+fileName+".txt");
			filedelete.delete();
			System.out.println(filedelete.getName()+" is deleted successfully");
		}
		else
		{
			System.out.println("File not found");
		}
		}
	
	public static void searchFile(){
		System.out.println("Enter name of file need to search");
		String fileName = scan.nextLine();
		if(list.contains(fileName+".txt")) {
			System.out.println("File exit at"+file.getAbsolutePath()+"\\"+fileName+".txt");
		}
		else
		{
			System.out.println("file not found");
		}
		
	}
}
