package com.eyeopen.modifier;
class A{
 void display(){
  System.out.println("Hi, this is display() default");
 }
 void display(String name){
  System.out.println("Hi, "+name);
 }
 void display(int a, int b){
   System.out.println("a value is "+a+" b value is "+b);
 }
 double display(double radius) {
	 double aoc = (22/7)*radius*radius;
	 return aoc;
 }
 public static void main(String[] args){
   A obj = new A();
   obj.display(10, 12); 
   obj.display();
   obj.display("Santhan");
   double res = obj.display(6.5);
   System.out.println("Area of circle is "+res);
 } 
}