package com.evergent.coreJAVA.casestudy_map;

import java.util.LinkedHashMap;

public class EmployeeService {
	LinkedHashMap<Integer, Employee> hmap = new LinkedHashMap<>();

	public void addEmployee(Employee e) {
		hmap.put(e.getId(), e);
		System.out.println("Successfully Added Employee With Id: " + e.getId());
	}

	public void getById(int id) {
		if (hmap.containsKey(id)) {
			System.out.println(hmap.get(id));
		} else {
			System.out.println("Employee with Id: " + id + " is not registered");
		}
	}
	
	public boolean checkContains(int id) {
		if (hmap.containsKey(id)) {
			return true;
		}
		return false;
	}

	public void updateEmployee(Employee e) {
			hmap.put(e.getId(), e);
	}

	public void removeEmployee(int id) {
		if (hmap.containsKey(id)) {
			hmap.remove(id);
			System.out.println("Removed Employee with Id: " + id);
		} else {
			System.out.println("Employee with Id: " + id + " is not registered");
		}
	}
	
	public void displayAllEmployees() {
		for(Employee emp : hmap.values()) {
			System.out.println(emp);
		}
	}
}
