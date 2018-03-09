package com.eyeopen.modifier;
class Test1{
	void displayMessage() {
		System.out.println("Non-static: other class");
		//printMessage();
	}
	static void printMessage() {
		System.out.println("static Method: other class.");
	}	
}


public class StaticMethodDemo {
	static void printData() {
		System.out.println("This static method: within a class.");
	}
	public static void main(String[] args) {
		printData();
		new Test1().displayMessage();
		Test1.printMessage();
	}
}
