package com.Basic.Program;

public class ProductOfDigitina_Number {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		product();
	}
	public static void product() {
		int n=324;
		int p=1;
		while(n!=0) {
			int m=n%10;
			p=p*m;
			n=n/10;
		}
		System.out.println(p);
	}
}
