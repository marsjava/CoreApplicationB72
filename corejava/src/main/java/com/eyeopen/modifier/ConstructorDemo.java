package com.eyeopen.modifier;

class Employee{
	int empId;
	String empName;
	String desig;
	String doj;
	long basicPay;
	public Employee(int empId, String empName, String desig, String doj, long basicPay) {
		this.empId = empId;
		this.empName = empName;
		this.desig = desig;
		this.doj = doj;
		this.basicPay = basicPay;
	}
	@Override
	public String toString() {		// we are received from Object.java
		return "Employee [empId=" + empId + ", empName=" + empName + ", desig=" + desig + ", doj=" + doj + ", basicPay="
				+ basicPay + "]";
	}
	
}


class Box{
	Box(){
		this("Santhan Rao");
		System.out.println("This is default constructor.");
	}
	Box(String name){			// param-constructor method 
		this(10, 20);
		System.out.println("This is Box Constructor method. "+name);
	}
	// constructor overloading
	Box(int a, int b){
		System.out.println("a value is "+a+" b value is "+b);
	}
	void display() {
		System.out.println("This is user defined method.");
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Box obj1 = new Box();
		//Box obj2 = new Box("Santhan Rao");
		//Box obj3 = new Box(10,20);
		//obj.display();
		//Employee e = new Employee(1001, "Naresh", "HR", "26-03-2018", 55000);
		//System.out.println(e);
	}
}
