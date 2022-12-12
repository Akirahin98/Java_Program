package com.Inheritance.Program;

public class SingleLevel_Inheritance {

	public static void main(String[] args) {
		Cow a=new Cow();
		System.out.println(a.eat);
	}
}
class Animal{
	String eat="food";
}
class Cow extends Animal{
	String eat="grass";
}
