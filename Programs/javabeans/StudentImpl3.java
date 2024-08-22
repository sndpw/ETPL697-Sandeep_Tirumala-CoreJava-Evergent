package com.evergent.coreJAVA.javabeans;

public class StudentImpl3 {

	public static void main(String[] args) {
		StudentBean student = new StudentBean();
		
		student.setSno(100);
		student.setSname("Ram");
		student.setAddress("Hyderabad");
		System.out.println(student);
	}
}
