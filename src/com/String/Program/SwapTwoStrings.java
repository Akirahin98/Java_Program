package com.String.Program;

public class SwapTwoStrings {
	/*Date: 15/11/2022
	 * 1. Swapping of two String Without Using temporary variable
	 * 2. Swapping of two String Using temporary variable
	 */
	public static void main(String[] args) {
		String s1="java";
		String s2="developer";
		swappingWithouUsingTemp(s1, s2);
		System.out.println();
		swappingUsingTemp(s1, s2);
	}
	public static void swappingWithouUsingTemp(String s1,String s2) {
		s1=s1+s2;
		s2=s1.replace(s2, "");
		s1=s1.replace(s2, "");
		System.out.println("s1 value is: "+s1);
		System.out.println("s2 value is: "+s2);
	}
	public static void swappingUsingTemp(String s1,String s2) {
		String s3=s1;
		s1=s2;
		s2=s3;
		System.out.println("s1 value is: "+s1);
		System.out.println("s2 value is: "+s2);
	}
	

}
