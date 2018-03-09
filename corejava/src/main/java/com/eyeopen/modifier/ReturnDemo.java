package com.eyeopen.modifier;

public class ReturnDemo {
	public String getInWords(int n) {
		String res;
		if(n==1) {
			res = "one";
		}else if(n==2) {
			res = "two";
		}else if(n==3) {
			res = "three";
		}else if(n==4) {
			res = "four";
		}else {
			res = "Invalid input";
		}		
		return res;
	}
	public static void main(String[] args) {
		ReturnDemo obj = new ReturnDemo();
		String words = obj.getInWords(5);
		System.out.println(words);
	}
}
