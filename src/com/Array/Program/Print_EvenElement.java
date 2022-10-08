package com.Array.Program;

public class Print_EvenElement {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		evenelement1();
	}
	public static void evenelement1() {
		int[] arr2= {3,6,9,2,67,4,87,94};
		for (int i = 0; i<= arr2.length-1; i++) {
			if (arr2[i]%2==0) {
				System.out.println(arr2[i]);
			}
		}
	}
}
