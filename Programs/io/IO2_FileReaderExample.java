package com.evergent.coreJAVA.io;
/*
 * The FileReader class in Java is a part of the java.io package and
 *  is used for reading character files. It is designed to read streams 
 *  of characters, making it suitable for reading text files. 
 *  FileReader reads the file character by character, and it can be 
 *  wrapped by a BufferedReader for efficient reading of lines of text.
 * 
 */
import java.io.FileReader;
import java.io.IOException;

public class IO2_FileReaderExample {
    public static void main(String[] args) {
        // The path to the file to be read
         
    	String filePath = "c:/mydata/myexample.txt";
        // Using FileReader to read the file
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            
            // Read the file character by character
            while ((character = fileReader.read()) != -1) {
                // Print each character to the console
                System.out.print((char) character);
            }
 
        } catch (IOException e) {
            // Handle potential IOException
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
