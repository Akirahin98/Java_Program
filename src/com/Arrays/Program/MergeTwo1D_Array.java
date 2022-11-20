package com.Arrays.Program;

import java.util.Arrays;

public class MergeTwo1D_Array {
	/*Date: 14/11/2022
	 * Merge two 1-D Array
	 * 1. Without Using Predefined Method
	 * 2. Using Predefined Method
	 */
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {6,7,8,9};
		mergearray(arr, arr1);
		System.out.println();
		mergearray1(arr, arr1);
	}
	public static void mergearray(int arr[],int arr1[]) {
		int a=arr.length;
		int b=arr1.length;
		int []arr2=new int[a+b];
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			arr2[i+a]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	public static void mergearray1(int arr[],int arr1[]) {
		int a=arr.length;
		int b=arr1.length;
		int []arr2=new int[a+b];
		System.arraycopy(arr, 0, arr2, 0, a);
		System.arraycopy(arr1, 0, arr2, a, b);
		System.out.println(Arrays.toString(arr2));
	}
}
