package com.CharacterClass.Program;

public class CountEachCharacterinString {
	/*Date: 20/11/2022
	 * Count each character present in String
	 * O/P: UpperCase count is: 5
			LowerCase count is: 10
			DigitCount is: 3
			Whitespace count is: 8
			SpecialCharacter count is: 8
	 */

	public static void main(String[] args) {
		String s="Oh My God @# Are $o d@m%^ G**d 143";
		getcount(s);
	}

	public static void getcount(String s) {
		char[] ch=s.toCharArray();
		int uppercasecount=0,lowercasecount=0,digitcount=0,whitespacecount=0,specialcharactercount=0;
		for (int i = 0; i < ch.length; i++) {

			if (Character.isAlphabetic(ch[i])) {
				if (Character.isUpperCase(ch[i])) {
					uppercasecount++;
				}else {
					lowercasecount++;
				}

			} else if(Character.isDigit(ch[i])) {
				digitcount++;
			}else {
				if (Character.isWhitespace(ch[i])) {
					whitespacecount++;
				} else {
					specialcharactercount++;
				}
			}
		}
		System.out.println("Uppercase count is: "+uppercasecount);
		System.out.println("Lowercase count is: "+lowercasecount);
		System.out.println("Digitcount is: "+digitcount);
		System.out.println("Whitespace count is: "+whitespacecount);
		System.out.println("SpecialCharacter count is: "+specialcharactercount);

	}
}
