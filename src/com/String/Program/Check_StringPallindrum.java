package com.String.Program;

public class Check_StringPallindrum {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		pallindrumcheck();
	}
	public static void pallindrumcheck() {
		String s="mom";
		String val="";
		for (int i =s.length()-1; i>=0; i--) {
			val=val+s.charAt(i);
		}
		if (s.equals(val)) {
			System.out.println("Pallindrum");
		}else {
			System.out.println("Not Pallindrum");
		}
	}
}
