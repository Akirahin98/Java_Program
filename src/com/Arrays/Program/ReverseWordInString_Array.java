package com.Arrays.Program;

public class ReverseWordInString_Array {
	/*Date: 14/11/2022
	 * 1. Reverse MidString ===>O/P: Java, Python, lreP, Rubby, Jscript, 
	 * 2. Reverse 1st and Last String ===>O/P: avaJ, Python, Perl, Rubby, tpircsJ, 
	 */
	static String arr[]= {"Java","Python","Perl","Rubby","Jscript"};
	static String arr1[]= {"Java","Python","Perl","Rubby","Jscript"};
	public static void main(String[] args) {
		reverseMidString(arr);
		System.out.println();
		reverseFirstandLastArray(arr1);
	}
	public static void reverseMidString(String[] arr) {
		for (int i = 0; i <arr.length; i++) {
			if (i==arr.length/2) {
				String a=arr[i];
				char[] b=a.toCharArray();
				String c="";
				for (int j =b.length-1; j>=0; j--) {
					c=c+b[j];
				}
				arr[i]=c;
			}
			System.out.print(arr[i]+", ");
		}
	}
	public static void reverseFirstandLastArray(String[] arr1) {
		for (int i = 0; i <arr1.length; i++) {
			if (i==0||i==arr1.length-1) {
				String a=arr1[i];
				char[] b=a.toCharArray();
				String c="";
				for (int j =b.length-1; j>=0; j--) {
					c=c+b[j];
				}
				arr1[i]=c;
			}
			System.out.print(arr1[i]+", ");
		}
	}
}
