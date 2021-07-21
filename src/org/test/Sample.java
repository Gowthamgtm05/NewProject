package org.test;

public class Sample {
	
	
	public static void login() {
		System.out.println("Login to click the button");
	}
	public static void login1() {
	System.out.println("Login");
		login();
	}
	private static void userName() {
		System.out.println("username");
		userName();
	}
	public void hello() {
		
		System.out.println("Helllo");
	}
	
	
	public static void main(String[] args) {
		login();
	}
	
	
}
