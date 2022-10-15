package com.methodoverloading.Program;

public class MethodOverloading1 {
	/*
	 * Date:15/10/2022
	 */
	public static void main(String[] args) {
		overloading();
		MethodOverloading1 mo1=new MethodOverloading1();
		mo1.overloading(35242);
		mo1.overloading("a@.com");
		mo1.overloading(23, "King");
		
	}
	 static void overloading() {
		System.out.println("Method 1 with no argument");//we can overload static method
	}
	 void overloading(int rollnumber) {
		System.out.println("Method 2 with int argument "+rollnumber);//we can overload non=static method
	}
	 private void overloading(String mailid) {
		 System.out.println("Method 3 with Sring argument "+mailid);//we can overload private method
	 }
	 final void overloading(int id,String name) {
	System.out.println("Method 4 with int & String arguments "+id+" "+name);//we can overload final method
	 }
}
