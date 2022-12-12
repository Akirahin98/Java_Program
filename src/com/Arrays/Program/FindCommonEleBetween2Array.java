package com.Arrays.Program;

import java.util.HashSet;
import java.util.Set;

public class FindCommonEleBetween2Array {
	/*Date: 28/11/2022
	 * 1. Find common element between two array
	 */
	public static void main(String[] args) {
		int[] arr1= {2,6,8,4,9,8,11,5,4};
		int[] arr2= {9,1,3,4,6,11,9,12,23};
		commonelement(arr1, arr2);
		System.out.println("=======================");
		commonelementusinghashset(arr1, arr2);
	}
	public static void commonelement(int[] arr1,int[] arr2) {
		Set<Integer> s=new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]==arr2[j]) {
					s.add(arr1[i]);
				}
			}	
		}
		for (Integer no : s) {
			System.out.println(no);
		}
	}
	public static void commonelementusinghashset(int[] arr1,int[] arr2) {
		HashSet<Integer> hs1=new HashSet<>();
		HashSet<Integer> hs2=new HashSet<>();

		for (Integer i1 : arr1) {
			hs1.add(i1);
		}
		for (Integer i2 : arr2) {
			hs2.add(i2);	
		}
		for (Integer i3 : hs2) {
			boolean b=hs1.add(i3);
			if (b==false) {
				System.out.println(i3);
			}
		}
	}
}
