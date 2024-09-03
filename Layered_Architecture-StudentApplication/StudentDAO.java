package com.evergent.coreJAVA.studentapplication;

import java.util.ArrayList;

public class StudentDAO {
	public static int addStudent(StudentBean studentBean) {
		try {
			ArrayList studentList = new ArrayList();
			studentList.add(studentBean.getStudentId());
			studentList.add(studentBean.getName());
			studentList.add(studentBean.getCourse());
			studentList.add(studentBean.getTest1());
			studentList.add(studentBean.getTest2());
			studentList.add(studentBean.getGrade());

			System.out.println(studentList);
			System.out.println();
			System.out.println("Student ID :" + studentBean.getStudentId());
			System.out.println("Student Name :" + studentBean.getName());
			System.out.println("Student Course :" + studentBean.getCourse());
			System.out.println("Test1 Marks :" + studentBean.getTest1());
			System.out.println("Test2 Marks :" + studentBean.getTest2());
			System.out.println("Grade :" + studentBean.getGrade());

			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

}
