package com.Interface.Program;

public class Multipleinheritance_Interface {
/*
 * Date:14/10/2022
 */
	public static void main(String[] args) {
		C c=new C();
		c.mea();
		c.meb();
		System.out.println("=================");
		F f=new F();
		f.me();
	}
	
}
/*In this example both the superclass interface having different methods
 * So in Subclass implementation we have to define body for both the methods
 */
interface A{
	void mea();
}
interface B{
	void meb();
}
class C implements A,B{
	public void mea() {//here we are using public because default access modifier which is smaller 
		System.out.println("Interface A");
	}
	public void meb() {
		System.out.println("Interface B");
	}
}
/*In this example both the superclass interface having same methods
 * So in Subclass implementation we have to define body only for once
 */
interface D {
	void me();
}
interface E{
	void me();
}
class F implements D,E{
	public void me() {
		System.out.println("Interface D and E");
	}
}