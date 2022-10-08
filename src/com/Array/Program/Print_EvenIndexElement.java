package com.Array.Program;

public class Print_EvenIndexElement {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		evenelement();
	}
	public static void evenelement() {
		int[] arr1= {3,6,9,2,67,4,87,94};
		for (int i = 0; i<= arr1.length-1; i++) {
			if (i%2==0) {
				System.out.println(arr1[i]);
			}
		}
	}
}
