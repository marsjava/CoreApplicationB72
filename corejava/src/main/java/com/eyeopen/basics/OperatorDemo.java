package com.eyeopen.basics;

import java.util.Scanner;

class Arithmetic{
	int num1, num2, result; //instance variable 
	public Arithmetic(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void addition() {
		result = num1+num2;
		System.out.println("The sum of two numbers "+num1+" and "+num2+" is "+result);
	}
	public void subtraction() {
		result = num1-num2;
		System.out.println("The subtraction of two numbers "+num1+" and "+num2+" is "+result);
	}
	public void printSmaller() {
		result = (num1<num2)?num1:num2;
		System.out.println("The smallest of two numbers "+num1+" and "+num2+" is "+result);
	}
}

public class OperatorDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num1 value: ");
		int a = scan.nextInt();
		System.out.println("Enter the num2 value: ");
		int b = scan.nextInt();
		//scan.close();
		// System.in
		Arithmetic arith = new Arithmetic(a, b);
		arith.addition();
		arith.subtraction();
		arith.printSmaller();		
	}
}
