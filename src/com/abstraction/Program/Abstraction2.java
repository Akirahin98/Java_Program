package com.abstraction.Program;

public class Abstraction2 {

	public static void main(String[] args) {
		C c=new C();
		c.mea();
		c.mea1();
		c.meb();
	}
}
abstract class A{
	abstract void mea();
	void mea1() {
		System.out.println("concreat method");
	}
}
abstract class B extends A{
	abstract void meb();
	void mea() {
		System.out.println("abstract method of class A");
	}
}
class C extends B{
	void meb() {
		System.out.println("abstract method of class B");
	}
}