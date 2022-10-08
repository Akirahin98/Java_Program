package com.Basic.Program;

public class FibonaciiSeries {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		fibonacii();
	}
	public static void fibonacii() {
		int count=0,a=0,b=1,c=0;
		while(count<5) {
			System.out.println(a+"  "+b);
			c=a+b;
			a=b;
			b=c;
			count++;
		}
	}
}
