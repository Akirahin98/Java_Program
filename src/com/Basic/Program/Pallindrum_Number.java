package com.Basic.Program;

public class Pallindrum_Number {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		pallindrum();
	}
	public static void pallindrum() { 
		int n=232;
		int o=n;
		int p=0;
		while(n!=0) {
			int m=n%10;
			p=(p*10)+m;
			n=n/10;
		}
		System.out.println(p);
		if (o==p) {
			System.out.println("Pallindrum");
		} else {
			System.out.println("Not Pallindrum"); 
		}
	}
}
