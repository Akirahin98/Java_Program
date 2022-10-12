package com.String.Program;

public class Check_StringPallindrum_Stringbuffer {
	/* Date:11/10/2022
	 */
	public static void main(String[] args) {
		pallindrum();
	}
	public static void pallindrum() {
		String s="aba";
		StringBuffer bf=new StringBuffer(s);
		bf.reverse();
		String s1=bf.toString();
		if (s.equals(s1)) {
			System.out.println("Pallindrum");
		}else {
			System.out.println("Not pallindrum");
		}
	}
}
