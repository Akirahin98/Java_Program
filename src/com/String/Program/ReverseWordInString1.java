package com.String.Program;

public class ReverseWordInString1 {
	/* Date:11/10/2022
	 */
	public static void main(String[] args) {
		reverse();

	}
	public static void reverse() {
		String s="Never ever give up";
		String [] s1=s.split(" ");
		String s2="";
		for (int i = 0; i < s1.length; i++) {
			String s3=s1[i];
			for (int j =s3.length()-1; j>=0; j--) {
				s2=s2+s3.charAt(j);
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
	
	
}
