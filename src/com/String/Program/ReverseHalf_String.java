package com.String.Program;

public class ReverseHalf_String {
	/*Date: 10/11/2022
	 * Input: mama#12345
	 * Output: mama#54321
	 */
	public static void main(String[] args) {
		String s="mama#12345";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (i<=4) {
				s1=s1+s.charAt(i);
			} else{
				for (int j =s.length()-1; j>4; j--) {
					s1=s1+s.charAt(j);
				}
				break;
			}
		}
		System.out.println(s1);
	}
}
