package com.evergent.java8.lambda;

 @FunctionalInterface
 interface Person4
 {
	abstract public void eat(String foodName1,String foodName2);
 }

public class Lambda4Prog {

	public static void main(String[] args) {
		 
		Person4 p4=(foodName1,foodName2) -> {  
			{
			
				System.out.println("Drink  .."+foodName1+"  with " +foodName2);
				System.out.println("Hello");
			}
						
		};
        p4.eat("Milk","Sugar");
	}

}
