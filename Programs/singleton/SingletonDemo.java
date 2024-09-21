package com.evergent.coreJAVA.singleton;

//Java program implementing Singleton class with using getInstance() method


class MySingleton {
	// Static variable reference of single_instance of type Singleton
	private static MySingleton single_instance = null;

		
	// Here we will be creating private constructor  restricted to this class itself
	private MySingleton()
	{		
	}
	
	// Static method to create instance of Singleton class
	//public static synchronized MySingleton getInstance()
	public static  MySingleton getInstance()
	{
		if (single_instance == null)
			single_instance = new MySingleton();

		return single_instance;
	}
}


//Main class
public class SingletonDemo {
	// Main driver method
	public static void main(String args[])
	{     //The constructor MySingleton() is not visible
	//MySingleton abc=new MySingleton();
		
		// Instantiating Singleton class with variable x
		MySingleton x = MySingleton.getInstance();

		// Instantiating Singleton class with variable y
		MySingleton y = MySingleton.getInstance();

		// Instantiating Singleton class with variable z
		MySingleton z = MySingleton.getInstance();

		// Printing the hash code for above variable as
		// declared
		System.out.println("Hashcode of x is "
						+ x.hashCode());
		System.out.println("Hashcode of y is "
						+ y.hashCode());
		System.out.println("Hashcode of z is "
						+ z.hashCode());

		// Condition check
		if (x == y && y == z) {

			
			System.out.println(
				"Three objects point to the same memory location on the heap :to the same object");
		}

		else {
			
			System.out.println(
				"Three objects DO NOT point to the same memory location on the heap");
		}
	}
}
