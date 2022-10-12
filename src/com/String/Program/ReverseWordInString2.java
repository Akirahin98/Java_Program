package com.String.Program;

public class ReverseWordInString2 {
	/* Date:11/10/2022
	 */
	public static void main(String[] args) {
		reverse2();
	}
	public static void reverse2() {
		String s="Never ever give up";
		String [] s1=s.split(" ");
		String s2="";
		for (int i = 0; i < s1.length; i++) {
			String s3=s1[i];
			if (i==0||i==3) {
				for (int j =s3.length()-1; j>=0; j--) {
					s2=s2+s3.charAt(j);
				}
			}if(i==1||i==2) {
				for (int k = 0; k < s3.length(); k++) {
					s2=s2+s3.charAt(k);
				}
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
}
