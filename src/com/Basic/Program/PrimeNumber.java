package com.Basic.Program;

public class PrimeNumber {
	/* Date:07/10/2022
	 * 1.Check prime number 
	 * 2.Print prime number in range
	 */
	public static void main(String[] args) {
		prime();
		primeinRange();
	}
	public static void prime() {
		int n=99;
		int count=2;
		for (int i =2; i <=n-1; i++) {
			if (n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
	public static void primeinRange() {
		for (int i =1; i<=100; i++) {
			int count=2;
			for (int j =2; j<=i-1; j++) {
				if (i%j==0) {
					count++;
					break;
				}
			
				}
			if (count==2) {
				System.out.println(i);
			}
		}
	}
}
