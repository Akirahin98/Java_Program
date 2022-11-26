package com.Arrays.Program;

public class FindNumberOfEven_Odd_Integers {
	/*Date: 24/11/2022
	 * 1. Find number of even and odd integers from an Array
	 */
	public static void main(String[] args) {
		int[] arr= {9,8,3,6,1,4,5,12,43};
		evenAndOdd(arr);
	}
	public static void evenAndOdd(int[] arr) {
		int e=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				e++;
			}
		}
		System.out.println("Number of even elements are: "+e);
		System.out.println("Number of odd elements are: "+(arr.length-e));
	}
}
