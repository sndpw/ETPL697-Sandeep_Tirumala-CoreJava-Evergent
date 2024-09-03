package com.evergent.coreJAVA.studentapplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int sid = 0;
		String sname = "";
		String course = "";
		float test1 = 0;
		float test2 = 0;

		Scanner sin = new Scanner(System.in);

		System.out.println("Enter Student ID");
		sid = sin.nextInt();
		System.out.println(("Enter Student Name"));
		sname = sin.next();
		System.out.println("Enter the Course");
		course = sin.next();
		System.out.println("Enter the Marks obtained for Test 1");
		test1 = sin.nextFloat();
		System.out.println("Enter the Marks obtained for Test 2");
		test2 = sin.nextFloat();

		StudentService studentService = new StudentService();

		int updateCount = StudentService.addStudentService(sid, sname, course, test1, test2);

		// last
		System.out.println("Inserted :" + updateCount + " record Success");

	}

}
