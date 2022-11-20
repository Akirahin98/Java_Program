package com.Basic.Program;

public class Print1st10PrimeNumber {
	/*Date: 11/11/2022
	 * 1st 10 Prime Number
	 */
	public static void main(String[] args) {
		int count=0;
		for (int j = 1; j <=100; j++) {
			if (primeNumber(j)) {
				System.out.println(j);
				count++;
				if (count==10) {
					break;
				}
			} 		
		}
		System.out.println("count val  "+count);		
	}
	public static boolean primeNumber(int n) {
		if (n<2) {
			return false;
		}
		for (int i =2; i <=n/2; i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}
