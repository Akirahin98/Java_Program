package com.Basic.Program;

public class VerifyArmstrongNumber {

	public static void main(String[] args) {
		int n=2;
		armstrong(n);
	}
	public static void armstrong(int n) {
		int temp=n,length=0;
		while (temp!=0) {
			length=length+1;
			temp=temp/10;
		} 
		int temp1=n,r,s=0;
		while (temp1!=0) {
			r=temp1%10;
			int m=1;
			for (int i = 1; i <=length; i++) {
				m=m*r;
			}
			s=s+m;
			temp1=temp1/10;
		}
		if (n==s) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
}
