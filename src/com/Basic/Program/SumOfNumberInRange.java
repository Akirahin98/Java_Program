package com.Basic.Program;

public class SumOfNumberInRange {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		sum();
	}
	public static void sum() {
		int sum=0;
		for (int i = 0; i <=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
