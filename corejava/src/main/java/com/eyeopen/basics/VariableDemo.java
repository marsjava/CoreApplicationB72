package com.eyeopen.basics;

//Object.java	-> java.lang
//A.java
//class A extends Object{	
//}
//class B extends A{
//}


class Employee{
	long empId = 1025;
	double empSalary = 45000;
	float empTax = 14.5f;
	int empDaysOfWork = 24;
	long eTax = (long)empSalary;
	public Employee(String msg){
		System.out.println(msg);
	}
	//boolean status = false;
	//int priod = status;
	//float eid = empId;
	//float eS = empSalary;
	public void calculatePF() {
		float pfRate = 10.5f;
		System.out.println("The PF rate of the employee is "+pfRate);
		display();
	}
	public void display() {
		System.out.println("Thank you. Visit Again.");
	}
}
public class VariableDemo {
	public static void main(String[] args) {
		Employee e = new Employee("Eyeopen Technologies.");
		System.out.println("The Id of the Employee is "+e.empId);
		System.out.println("The Salary of the Employee is "+e.empSalary);
		System.out.println("The % tax needs to pay "+e.empTax);
		System.out.println("The total no. of working days "+e.empDaysOfWork);
		e.calculatePF();
	}
}
