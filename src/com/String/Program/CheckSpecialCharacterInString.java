package com.String.Program;

public class CheckSpecialCharacterInString {
	/* Date:19/11/2022
	 * String: J@v@d#v$lop*r
	 * 1. Print number of special character present in String
	 * 2. Print String without special character
	 * 3. Print String only special character
	 */
	public static void main(String[] args) {
		String s="j@v$a143";
		findspecialcharacter(s);
	}
	public static void findspecialcharacter(String s) {
		String s1="";
		String s2="";
		int count=0;
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (!Character.isDigit(c[i])&&!Character.isLetter(c[i])&&!Character.isWhitespace(c[i])) {
				s1=s1+c[i];
				count++;
			}else {
				s2=s2+c[i];
			}
		}
		System.out.println("Print number of special character present in String: "+count);
		System.out.println("Print String without special character: "+s2);
		System.out.println("Print String only special character: "+s1);
	}
}
