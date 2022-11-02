package com.Arrays.Program;

public class Arrays_2D {
	/*Date: 02/11/2022
	 * Matrix Array
	 * Jagged Array
	 */
	public static void main(String[] args) {
		Matrix_Arrays();
		Jagged_Arrays();
	}
	public static void Matrix_Arrays() {
		int[][] arr= {{23,42,45,11,66,11,86,111},{23,42,56,11,45,19,47,23}};
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println("======================");
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Jagged_Arrays() {
		int[][] arr= {{23,42,45,11,86,111},{34,67,20,90},{23,42,56,11,45,19,47,23},{34,23}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
}
