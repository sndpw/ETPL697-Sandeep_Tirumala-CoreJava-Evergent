package com.evergent.coreJAVA.ExceptionHandling;

//FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExceptionDemo15 {
	public static void main(String[] args) {
		try {
			File file = new File("c:/mydata/myinfo/.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}