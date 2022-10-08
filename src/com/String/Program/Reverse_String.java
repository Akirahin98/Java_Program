package com.String.Program;

public class Reverse_String {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		reverse1();
		reverse2();
	}
	public static void reverse1() {
		String s="Testengineer";
		String val="";
		for (int i =s.length()-1; i>=0; i--) {
			val=val+s.charAt(i);
		}
		System.out.println(val);
	}
	public static void reverse2() {
		String s1="Javadeveloper";
		char[] c=s1.toCharArray();
		String val1="";
		for (int i =c.length-1; i>=0; i--) {
			val1=val1+c[i];
		}
		System.out.println(val1);
	}
}
