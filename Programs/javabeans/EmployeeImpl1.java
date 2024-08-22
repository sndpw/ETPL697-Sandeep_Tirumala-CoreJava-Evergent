package com.evergent.coreJAVA.javabeans;

public class EmployeeImpl1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEno(101);
		emp.setEname("Varma");
		emp.setSal(55000);

		System.out.println("Employee No :" + emp.getEno());
		System.out.println("Employee Name :" + emp.getEname());
		System.out.println("Employee Salary :" + emp.getSal());
	}
}
