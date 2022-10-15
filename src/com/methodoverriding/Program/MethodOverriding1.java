package com.methodoverriding.Program;

public class MethodOverriding1 {

	public static void main(String[] args) {
		System.out.println("====Single level inheritance====");
		E e=new E();
		e.mor();
		System.out.println("====Hierarchical level inheritance====");
		F f=new F();
		f.mor();

	}
}
class D{
	void mor() {
		System.out.println("Method D implimentation");
	}
}
class E extends D{
	void mor() {
		System.out.println("Method E implimentation");
	}
}
class F extends D{
	void mor() {
		System.out.println("Method F implimentation");
	}
}