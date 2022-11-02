package com.Arrays.Program;

public class Arrays_3D {
	/*Date: 02/11/2022
	 * Matrix Array
	 * Jagged Array
	 */
	public static void main(String[] args) {
		Matrix_Arrays();
		Jagged_Arrays();
	}
	public static void Matrix_Arrays() {
		int[][][] arr= {{{23,42,45,11,66,11,86,111},{23,42,56,11,45,19,47,23}}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					System.out.print(arr[i][j][j2]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("======================================");
	}
	public static void Jagged_Arrays() {
		int[][][] arr1= {{{23,42,45,11,86,111},{34,67,20,90},{23,42,56,11,45,19,47,23},{34,23}}};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int j2 = 0; j2 < arr1[i][j].length; j2++) {
					System.out.print(arr1[i][j][j2]+" ");
				}
				System.out.println();
			}
		}
	}
}
