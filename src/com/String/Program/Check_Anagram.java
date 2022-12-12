package com.String.Program;

import java.util.Arrays;

public class Check_Anagram {
	/*Date: 12/12/2022
	 * 1. To check 2 String are Anagram or not
	 */
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		anagram(s1, s2);
	}
	public static void anagram(String s1,String s2) {
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if (s1.length()!=s2.length()) {
			System.out.println("Not an Anagram");
			System.exit(0);
		}
		Arrays.sort(c1);//EILNST
		Arrays.sort(c2);//EILNST
		for (int i = 0; i < c1.length; i++) {
			if (c1[i]!=c2[i]) {
				System.out.println("Not an Anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}
}
