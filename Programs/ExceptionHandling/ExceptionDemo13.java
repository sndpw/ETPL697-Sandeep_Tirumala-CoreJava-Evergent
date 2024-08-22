package com.evergent.coreJAVA.ExceptionHandling;
//ArrayIndexOutOfBoundException
public class ExceptionDemo13 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println("Accessing the arrayt elements at index 10: "+arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught on AIOOBE: "+e);
			System.out.println("Error: "+e.getMessage());
		}
		System.out.println("program continues");
	}
}