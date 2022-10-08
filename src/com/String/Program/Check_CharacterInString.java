package com.String.Program;

public class Check_CharacterInString {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		character();
	}
	public static void character() {
		String s="Testengineer";
		char c='g';
		char[] c1=s.toCharArray();
		for (int i = 0; i <=c1.length-1; i++) {
			if (c==c1[i]) {
				System.out.println("Present");
			}
		}
	}
}
