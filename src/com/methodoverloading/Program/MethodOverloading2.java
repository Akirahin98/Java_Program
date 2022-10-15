package com.methodoverloading.Program;

public class MethodOverloading2 {

	public static void main(String[] args) {
		B b=new B();
		b.mo2();
		b.mo2(5);
	}
}
class A{
	void mo2(int i) {
		System.out.println("Method 1 with no argument");
	}
}
class B extends A{
	void mo2() {
		System.out.println("Method 2 with no argument ");
	}
}