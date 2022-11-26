package com.Basic.Program;

public class Basic1 {
	/* Date:07/10/2022
	 * 1.Area of Circle
	 * 2.Area of Triangle
	 * 3.Simple Interest
	 * 4.Swapping of two number using temporary variable 
	 * 5.Swapping of two number without using temporary variable
	 */
	public static void main(String[] args) {
		areaofcircle();
		areaoftriangle();
		SI();
		swapwithtemp();
		swapwithouttemp();
	}
	public static void  areaofcircle() {
		int r=25;
		double areac=3.141*(r*r);
		System.out.println("area of a circle  "+areac);
	}
	public static void areaoftriangle() {
		int l=4,b=6;
		double areat=0.5*l*b;
		System.out.println("area of a triangle  "+areat);
	}
	public static void SI() {
		int p=4,t=5,r=56;
		double SI=((p*t*r)/100);
		System.out.println("Simple interest  "+SI);
	}
	public static void swapwithtemp() {
		int a=4;
		int b=8;
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("a="+a+" and "+"b="+b);
	}
	public static void swapwithouttemp() {
		int a=4;
		int b=6;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" and "+"b="+b);
	}
}
