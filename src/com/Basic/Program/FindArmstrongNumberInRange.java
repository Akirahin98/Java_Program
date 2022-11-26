package com.Basic.Program;

public class FindArmstrongNumberInRange {
	/*Date: 25/11/2022
	 * 1. Find Armstrong number within 1-1000
	 */
	public static void main(String[] args) {
		int n=153;
		for (int i = 1; i <=1000; i++) {
			armstrong(i);
		}
	}
	public static void armstrong(int n) {
		int temp=n,length=0;
		while (temp!=0) {
			length=length+1;
			temp=temp/10;
		}
		int temp1=n,s=0,r;
		while (temp1!=0) {
			r=temp1%10;
			int m=1;
			for (int i =1; i <=length; i++) {
				m=m*r;
			}
			s=s+m;
			temp1=temp1/10;
		}
		if (n==s) {
			System.out.println(n);
		} else {

		}
	}
}
