package com.evergent.coreJAVA.io;
// : Handling file paths and directories

/*
 *Handling file paths and directories is an essential part of
 * file I/O operations in Java. The java.io package provides
 *  the File class, which is a powerful and flexible way to
 *   handle file paths, directories, and file attributes. 
 *    how to use the File class to handle file paths and directories.
 */
import java.io.File;

public class IO5_FileExistsExample {
	public static void main(String[] args) {
		// Creating a File object
		// File file = new File("example.txt");
		File file = new File("c:/mydata/myexample.txt");

		// Checking if the file or directory exists
		if (file.exists()) {
			System.out.println("File or directory exists: " + file.getName());
		} else {
			System.out.println("File or directory does not exist: " + file.getName());
		}
	}
}
