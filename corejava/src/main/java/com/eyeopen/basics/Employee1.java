package com.eyeopen.basics;

public class Employee1 {
	int empId;
	 String empName;
	 String desig;
	 long contactNo;
	 short salary;
	 public void displayData(){
	  System.out.println("Employee Id::"+empId);
	  System.out.println("Employee Name::"+empName);
	  System.out.println("Designation::"+desig);
	  System.out.println("Contact No::"+contactNo);
	  System.out.println("Salary::"+salary);
	 }
	 public static void main(String[] args){
	   //Employee e = null;		
	   //e = new Employee();
	   Employee1 e = new Employee1();  //Object decl. instantaiation 
	   e.displayData();
	   e.empId = 1201;
	   e.empName = "Ram";
	   e.desig = "Developer";
	   e.contactNo=9884220686L;
	   e.salary=25000;
	   e.displayData();
	  }
}
