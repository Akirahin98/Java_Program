package com.Basic.Program;

public class CheckCharacterType {
	/*Date: 25/11/2022
	 * 1. Check given character is LowerCase/UpperCase/special character/Whitespace/Digit
	 */
	public static void main(String[] args) {
		char c=' ';
		verify(c);
	}
	public static void verify(char c) {
		if (Character.isAlphabetic(c)) {
			if (Character.isLowerCase(c)) {
				System.out.println(c+" is lower case character");
			} else {
				System.out.println(c+" is upper case character");
			}
		} else if(Character.isDigit(c)) {
			System.out.println(c+" is didgit");
		}else {
			if (Character.isWhitespace(c)) {
				System.out.println(c+" is whitespace");
			} else {
				System.out.println(c+" is special character");
			}
		}
	}
}
