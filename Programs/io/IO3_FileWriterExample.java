package com.evergent.coreJAVA.io;

import java.io.FileWriter;
import java.io.IOException;
/*
 *FileWriter is a class in the java.io package that is used for
 * writing character files. It is a convenient class for writing
 *  text files in Java, as it can write individual characters, 
 *  arrays of characters, and strings. Below is a simple example demonstrating 
 *how to use FileWriter to write text to a file.
 */
public class IO3_FileWriterExample {
    public static void main(String[] args) {
    
    	String filename = "c:/mydata/myexample.txt";
     
        String content = "Hello, World!\nWelcome to Java FileWriter example.";

        FileWriter fileWriter = null;
        try {
            // Create a FileWriter object with the given filename
            fileWriter = new FileWriter(filename);
 
            // Write content to the file
            fileWriter.write(content);
            System.out.println("Successfully wrote to the file: " + filename);
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        } finally {
            // Close the FileWriter to free up resources
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.err.println("Failed to close the FileWriter: " + e.getMessage());
                }
            }
        }
    }
}
