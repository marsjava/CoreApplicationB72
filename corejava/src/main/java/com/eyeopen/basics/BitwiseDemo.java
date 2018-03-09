package com.eyeopen.basics;

class Bitwise{
	int a = 63;		
	int b = 12;
	int c;
	public void operation() {
		c = a&b;		//bitwise AND	//Exp.output 12
		System.out.println("a & b -> "+c);
		c = a|b;		//bitwise OR	//Exp. output 63
		System.out.println("a | b -> "+c);
		c = a^b;		//bitwise XOR	//Exp. output 54
		System.out.println("a ^ b -> "+c);
		c = ~a;			//unary NOT		//Exp. output -64
		System.out.println("~a -> "+c);		
		c = a<<2;		//left shift 	//Exp. output 252
		System.out.println("a << 2 -> "+c);
		c = a>>>1;		//right shift with zero fill //Exp. output 31
		System.out.println("a >>> 1 -> "+c);		
	}
}
public class BitwiseDemo {
	public static void main(String[] args) {
//		Bitwise obj = new Bitwise();
//		obj.operation();
		int a = 63;		
		int b = 12;
		int c;
		c = a&b;		//bitwise AND	//Exp.output 12
		System.out.println("a & b -> "+c);
		c = a|b;		//bitwise OR	//Exp. output 63
		System.out.println("a | b -> "+c);
		c = a^b;		//bitwise XOR	//Exp. output 54
		System.out.println("a ^ b -> "+c);
		c = ~a;			//unary NOT		//Exp. output -64
		System.out.println("~a -> "+c);					
		c = a<<2;		//left shift 	//Exp. output 252
		System.out.println("a << 2 -> "+c);
		c = a>>>1;		//right shift with zero fill //Exp. output 31
		System.out.println("a >>> 1 -> "+c);	
	}	
}
