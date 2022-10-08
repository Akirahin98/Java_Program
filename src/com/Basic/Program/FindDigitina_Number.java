package com.Basic.Program;

public class FindDigitina_Number {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		digit();
	}
	public static void digit() {
		int n=456;
		int d;
		while(n!=0) {
			d=n%10;
			System.out.println(d);
			n=n/10;
		}
	}
}
