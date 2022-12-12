package com.Arrays.Program;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateValue {
	/*Date: 12/12/2022
	 * 1. Find first duplicate value from integer Array
	 */
	public static void main(String[] args) {
		int[] arr= {4,5,6,8,7,5,6,8};
		duplicate(arr);
	}
	public static void duplicate(int[] arr) {
		Set<Integer> s=new HashSet<>();
		int temp=-1;
		for (int i = arr.length-1; i>=0; i--) {
			if (s.contains(arr[i])) {
				temp=i;
			}else {
				s.add(arr[i]);
			}
		}
		System.out.println("First duplicate element is: "+arr[temp]);
	}
}
