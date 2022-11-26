package com.Arrays.Program;

public class FindMissingNumberInArray {
	/*Date: 24/11/2022
	 * 1. Find missing number from an Array
	 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6,7,9,10,11,13,16};
		missingNumber(arr);
	}
	public static void missingNumber(int[] arr) {
		int[] arr1=new int[17];
		for (int i : arr) {
			arr1[i]=1;
		}
		for (int i =1; i < arr1.length; i++) {
			if (arr1[i]==0) {
				System.out.println(i);
			}
		}
		
	}
}
