package com.Arrays.Program;

public class FindFirstNonDuplicateValue {
	/*Date: 12/12/2022
	 * 1. Find first non-duplicate value from integer Array
	 */
	public static void main(String[] args) {
		int[] arr= {4,5,3,6,8,7,5,6,8,4};
		nonDuplicate(arr);
	}
	public static void nonDuplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]&&i!=j) {
					count++;
				} 
			}
			if (count==1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
