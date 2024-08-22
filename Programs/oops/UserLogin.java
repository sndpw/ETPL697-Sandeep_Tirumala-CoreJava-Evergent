package com.evergent.coreJAVA.oops;
//Method Overloading
public class UserLogin {
	public void loginDetails() {
		System.out.println("Login Details");
	}
	
	public void loginDetails(String username, String pass) {
		System.out.println("Username :" + username);
		System.out.println("Password :" + pass);
	}
	
	public void loginDetails(String username, String pass, String captcha){
		System.out.println("Username :" + username);
		System.out.println("Password :" + pass);
		System.out.println("Captcha :" + captcha);
	}
	
	public void loginDetails(int mobile, String pass) {
		System.out.println("Mobile :" + mobile);
		System.out.println("Password :" + pass);
	}
	
	public static void main(String[] args) {
		UserLogin ulogin = new UserLogin();
		ulogin.loginDetails();
		ulogin.loginDetails("Raj", "raj123");
		ulogin.loginDetails("Ravi", "Ravi123", "captcha");
		ulogin.loginDetails(999999999, "123abc");
	}
}
