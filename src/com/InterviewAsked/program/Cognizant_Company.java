package com.InterviewAsked.program;


public class Cognizant_Company {
	/*
	 * It's a concept of Method Overriding so always it will give o/p as child class because
	 * in child class parent class method has overridden 
	 */
	public static void main(String[] args) {
		Parent p=new Child();//So it does not matter what is the return type of created object 
		p.run();
	}
}


class Parent
{
	void run()
	{
		System.out.println("in parent");
	}
}
class Child extends Parent
{
	void run()
	{
		System.out.println("in child");
	}
}