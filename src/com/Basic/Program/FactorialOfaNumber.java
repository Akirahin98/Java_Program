package com.Basic.Program;

public class FactorialOfaNumber {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		fact();
	}
	public static void fact() {
		int n=5;
		int fact=1;
		while(n!=0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}
}
