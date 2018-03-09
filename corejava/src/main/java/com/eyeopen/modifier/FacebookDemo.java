package com.eyeopen.modifier;

import java.util.Scanner;

public class FacebookDemo {
	private Facebook fb;
	private Scanner scan;
	public Facebook getFbDetails() {
		fb = new Facebook();
		scan = new Scanner(System.in);
		System.out.println("Enter your name.");
		fb.setName(scan.next());
		System.out.println("Enter your contact no.");
		fb.setContactNo(scan.nextLong());
		System.out.println("Enter your marital status.");
		fb.setMaritalStatus(scan.next());
		System.out.println("Enter your age.");
		fb.setAge(scan.nextInt());
		return fb;
	}
	public void displayFbInfo(Facebook fb) {
		System.out.println("Facebook Details.");
		System.out.println("-----------------");
		System.out.println("Name: "+fb.getName());
		System.out.println("Age: "+fb.getAge());
		System.out.println("Contact No: "+fb.getContactNo());
		System.out.println("Status: "+fb.getMaritalStatus());
		System.out.println("--------------------------------");
	}
	public static void main(String[] args) {
		FacebookDemo obj = new FacebookDemo();
		Facebook fBook = obj.getFbDetails();
		obj.displayFbInfo(fBook);
	}
}

// primitive & ref.


