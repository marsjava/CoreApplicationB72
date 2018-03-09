package com.eyeopen.modifier;

import java.util.Scanner;

public class Circle {
	public double calculateArea(double radius) {
		double result = (22/7)*radius*radius;
		return result;
	}
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);		
//		System.out.println("Enter the radius value. ");
//		double radius = scan.nextDouble();
		Circle obj = new Circle();
		double aoc = obj.calculateArea(12.5);
		System.out.println("Area of circle is "+aoc);
//		scan.close();
	}
}
