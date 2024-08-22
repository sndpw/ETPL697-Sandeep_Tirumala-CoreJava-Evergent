package com.evergent.coreJAVA.constructors;

class Car {
	String color;
	int maxSpeed;
	
	Car() {
		color = "White";
		maxSpeed = 120;
	}
	
	Car(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	void display() {
		System.out.println("Color :" + color);
		System.out.println("Max Speed :" + maxSpeed);
	}
}

public class MyCars7 extends Car{
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Red", 150);
		car1.display();
		car2.display();
	}
}
