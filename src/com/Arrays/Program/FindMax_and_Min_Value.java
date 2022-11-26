package com.Arrays.Program;

public class FindMax_and_Min_Value {
	/*Date: 24/11/2022
	 * 1. Find Max value from an Array
	 * 2. Find Min value from an Array
	 */
	public static void main(String[] args) {
		int[] arr= {1,4,6,3,8,9,12,31,42,10,11};
		maximum(arr);
		minimum(arr);
	}
	public static void maximum(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
			if (arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println("Maximum value is: "+arr[0]);
		System.out.println("2nd Maximum value is: "+arr[1]);
	}
	public static void minimum(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
			if (arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		System.out.println("Minimum value is: "+arr[0]);
		System.out.println("2nd Minimum value is: "+arr[1]);
	}
}
