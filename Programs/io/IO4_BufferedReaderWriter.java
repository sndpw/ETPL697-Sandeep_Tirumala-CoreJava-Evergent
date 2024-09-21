package com.evergent.coreJAVA.io;

/*
 * The BufferedReader and BufferedWriter classes in the java.io package are used to handle 
 * input and output efficiently by using buffering. This buffering mechanism improves performance by reducing
 *  the number of I/O operations, making it faster to read from and write to files.
 * 
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO4_BufferedReaderWriter {
    public static void main(String[] args) {
        String filename = "c:/mydata/buffered_example.txt";
        String contentToWrite = "Hello, World!\nThis is a BufferedWriter and BufferedReader example.";

        // Writing to a file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(contentToWrite);
            System.out.println("Content written to the file: " + filename);
        } catch (IOException e) {
            System.err.println("An IOException occurred while writing: " + e.getMessage());
        }

        // Reading from the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from the file: " + filename);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An IOException occurred while reading: " + e.getMessage());
        }
    }
}
