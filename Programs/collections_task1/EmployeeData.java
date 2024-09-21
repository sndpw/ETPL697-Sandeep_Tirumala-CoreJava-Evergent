package com.evergent.coreJAVA.collections_task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class EmployeeData {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details");
		for (int i = 0; i < 3; i++) {
			Employee obj = new Employee();
			System.out.println("Enter the id");
			obj.setId(sc.nextInt());
			System.out.println("Enter the name");
			obj.setName(sc.next());
			System.out.println("Enter the salary");
			obj.setSalary(sc.nextFloat());
			list.add(obj);
			System.out.println(list);
		}

//		Iterator<Employee> obj = list.iterator();
//		while (obj.hasNext()) {
//			System.out.println("Iterator order");
//			Employee ob = obj.next();
//			System.out.println(ob.getId() + " " + ob.getName() + " " + ob.getSalary());
//		}

		for (Employee emp : list) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
		}
	}

}
