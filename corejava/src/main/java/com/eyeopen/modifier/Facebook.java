package com.eyeopen.modifier;

public class Facebook {
	private String name;			//get+name			//set+name
	private long contactNo;			//get+contactNo		//set+contactNo
	private String maritalStatus;	//get+maritalStatus	//set+maritalStatus
	private int age;				//get+age			//set+age
	// create the getter method for name variable;
	// create auto-generated code for getter/setter
	// alt+shift+s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
