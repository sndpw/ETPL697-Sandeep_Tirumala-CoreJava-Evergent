package com.evergent.java8.lambda;

 interface Person3
 {
	abstract public void eat(String foodName);
 }

public class Lambda3Prog {

	public static void main(String[] args) {
		 
		Person3 p3=(name) -> { 
			
			 {
				System.out.println("Drink ..."+name);
			  } 			
		};
        p3.eat("Milk");
	}

}
