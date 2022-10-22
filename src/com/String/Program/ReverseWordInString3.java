package com.String.Program;

public class ReverseWordInString3 {
	/* Date:22/10/2022
	 * Output: up give ever never (reverse the position of word in String)
	 */
	public static void main(String[] args) {
		reverse3();
	}
	public static void reverse3() {
		String s="never ever give up";
		String [] s1=s.split(" ");//remove the space from string and give the array of word
		String s2="";
		for (int i =s1.length-1; i>=0; i--) {
			s2=s2+s1[i];
			s2=s2+" ";//Which ever space i had removed using split() , again i added those space here
		}
		System.out.println(s2);
	}
}
