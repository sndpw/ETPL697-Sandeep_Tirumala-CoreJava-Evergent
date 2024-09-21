package com.evergent.coreJAVA.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO1_FileDemo {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that doesn't exist
            File file = new File("c:/mydata/myinfo.txt");
        	
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
    }
} 
 