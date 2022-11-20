package com.Basic.Program;

public class PrimeNumberPrint_1to100 {
	/*Date: 11/11/2022
	 * Prime Number 1-100
	 */
	public static void main(String[] args) {
		for (int j = 1; j <=100; j++) {
			if (isPrime(j)) {
				System.out.println(j+" is Prime Number");
			} 
		}
	}
	public static boolean isPrime(int n) {
		for (int i =2; i <=n/2; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
