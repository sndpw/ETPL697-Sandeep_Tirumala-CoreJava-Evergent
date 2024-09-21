package com.evergent.coreJAVA.singleton;

class Calculation {
	 
	 	
	int a=100,b=5,c; // attributes
	
	public void addition()  //methods 
	{
		c=a+b; //B.L
		System.out.println("Addition :"+c);
	}
	
	public void sub()  //methods 
	{
		c=a-b;
		System.out.println("Sub :"+c);
	}
}
public class MyCalculation extends Calculation // IS-A
{
	public static void main(String[] args) {
		
		MyCalculation my=new MyCalculation();
		my.addition();
		my.sub();
		
		
		  Calculation cal=new Calculation(); //HAS-A
		  cal.addition();
		  System.out.println("cal :memory location for hashcode :"+cal.hashCode());
		  System.out.println("my :memory location for hashcode :"+my.hashCode());
		  
		  MyCalculation my2=new MyCalculation();
		  System.out.println("my2: memory location for hashcode :"+my2.hashCode());
	}

}
