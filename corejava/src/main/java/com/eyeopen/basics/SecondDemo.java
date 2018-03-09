package com.eyeopen.basics;

class Emp{
	public int _empId;
	String empName;
	double $salary;
	public void displayEmpInfo() {
		String desig="SSE";
		System.out.println("Id "+_empId);
		System.out.println("Name "+empName);
		System.out.println("Desig "+desig);
		System.out.println("Salary "+$salary);
	}
	public void accountInfo() {
		System.out.println("Emp Id "+_empId);
		//System.out.println("Desig "+desig);
	}
}
public class SecondDemo {
	public static void main(String[] args) {
		Emp e = new Emp();
		e._empId = 1250;
		e.empName = "Ram";
		e.$salary = 50000;
		e.displayEmpInfo();
	}
}
