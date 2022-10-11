package com.String.Program;

public class OccuranceOfEachCharacter {
	/* Date:11/10/2022
	 */
	public static void main(String[] args) {
		occurance1();
		occurance2();
	}
	public static void occurance1() {
		String s="mathematics";
		String s1="";
		for (int i = 0; i <=s.length()-1; i++) {
			if (!s1.contains(""+s.charAt(i))) {
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
	public static void occurance2() {
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
