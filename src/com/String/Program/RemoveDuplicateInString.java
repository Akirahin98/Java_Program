package com.String.Program;

public class RemoveDuplicateInString {
	/* Date:11/10/2022
	 */
	public static void main(String[] args) {
		duplicate1();
		duplicate2();
	}
	public static void duplicate1() {
		String s="mathematics";
		String s1="";
		for (int i = 0; i <=s.length()-1; i++) {
			if (!s1.contains(""+s.charAt(i))) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
	public static void duplicate2() {
		String s="mathematics";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			int indx=s.indexOf(c, i+1);
			if (indx==-1) {
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}
}
