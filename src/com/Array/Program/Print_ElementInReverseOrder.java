package com.Array.Program;

public class Print_ElementInReverseOrder {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		reversearray();
	}
	public static void reversearray() {
		int[] arr= {3,6,9,2,67,4,87,94};
		for (int i =arr.length-1; i>0; i--) {
			System.out.println(arr[i]);
		}
	}
}
