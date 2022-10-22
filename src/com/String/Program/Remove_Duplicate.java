package com.String.Program;

public class Remove_Duplicate {

	public static void main(String[] args) {
		duplicate();
	}
	public static void duplicate() {
		String s="qqwweerrrrttt";
		String dup=" ";
		for (int i = 0; i < s.length(); i++) {
			if (!dup.contains(""+s.charAt(i))) {
				dup=dup+s.charAt(i);
			}
		}
		System.out.println(dup);
	}
}
