package com.Arrays.Program;

public class Print_MultiplesOf3 {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		evenelement2();
	}
	public static void evenelement2() {
		int[] arr3= {3,6,9,2,67,4,87,94};
		for (int i = 0; i<= arr3.length-1; i++) {
			if (arr3[i]%3==0) {
				System.out.println(arr3[i]);
			}
		}
	}
}
