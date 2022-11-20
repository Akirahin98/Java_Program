package com.String.Program;

public class CheckRotationOfString {
	/*Date: 19/11/2022
	 * 1. To check one string is rotation of other string or not
	 * eg: "CDAB" rotation of "ABCD" or not
	 */
	public static void main(String[] args) {
		String s1="ABCD";
		String s2="CDAB";
		if (isRotation(s1, s2)) {
			System.out.println("Rotation found");
		} else {
			System.out.println("Rotation not found");
		}
	}
	public static boolean isRotation(String s1,String s2) {
		if (s1.length()==s2.length()&&(s1+s2).indexOf(s2)!=-1) {
			return true;
		}else {
			return false;
		}
	}

}
