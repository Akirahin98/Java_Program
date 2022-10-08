package com.Basic.Program;

public class MultiplesOf3 {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		multiple();
	}
	public static void multiple() {
		for (int i = 0; i <=10; i++) {
			if (i%3==0) {
				System.out.println("Multiples of 3==> "+i);
			}
		}
	}
}
