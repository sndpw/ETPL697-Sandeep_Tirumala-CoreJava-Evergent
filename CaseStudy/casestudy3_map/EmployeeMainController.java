package com.evergent.coreJAVA.casestudy_map;

import java.util.Scanner;

public class EmployeeMainController {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		EmployeeService employee = new EmployeeService();

		for (;;) {
			System.out.println(
					"1. Add Employee \n2. Get Employee By Id \n3. Update Employee Details \n4. Remove Employee \n5. Display All Employees Details \n6. Exit");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				Employee e = new Employee();
				System.out.println("Enter Employee Id: ");
				e.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Employee Name: ");
				e.setName(sc.nextLine());
				System.out.println("Enter Employee Department");
				e.setDept(sc.nextLine());
				employee.addEmployee(e);
				break;
			case 2:
				System.out.println("Enter Employee Id: ");
				employee.getById(sc.nextInt());
				break;
			case 3:
				Employee e1 = new Employee();
				System.out.println("Enter Employee Id to be upadated: ");
				int id = sc.nextInt();
				sc.nextLine();
				if(employee.checkContains(id)) {
					e1.setId(id);
					System.out.println("Enter New Employee Name: ");
					e1.setName(sc.nextLine());
					System.out.println("Enter New Employee Department");
					e1.setDept(sc.nextLine());
					employee.updateEmployee(e1);
				} else {
					System.out.println("Employee with Id: " + id + " is not registered");
				}
				break;
			case 4:
				System.out.println("Enter the Employeee Id to be removed");
				int eid = sc.nextInt();
				employee.removeEmployee(eid);
				break;
			case 5:
				employee.displayAllEmployees();
				break;
			case 6:
				System.exit(0);
			}
		}
	}
}
