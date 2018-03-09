package com.eyeopen.modifier;

class Acer{
	static int x = 5;			//non-static 
	static int y = 8;	//static
	void display() {	//non-static method
		x++;
		y+=10;	// y = y + 10;
		System.out.println("x value is "+x+" y value is "+y);
	}
	static void display1() {	// static method
		x++;	
		y+=10;
		System.out.println("x value is "+x+" y value is "+y);
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		Acer obj1 = new Acer();
		obj1.display();
		Acer obj2 = new Acer();
		obj2.display();
		Acer obj3 = new Acer();
		obj3.display();
	}
}
