package com.Arrays.Program;

public class Linear_and_BinarySearch {
	/*Date: 21/11/2022
	 * 1. Linear Search
	 * 2. Binary Search
	 */
	public static void main(String[] args) {
		int[] liarr= {2,5,9,1,7,34,98,37,3,32,65,43};
		int[] biarr= {1,3,4,6,8,9,11,23,45,68,98,99};
		int sch=98;
		int fi=0;
		int li=biarr.length-1;
		int mi=(fi+li)/2;
		linearSearch(liarr, sch);
		binarySearch(biarr, sch, fi, li, mi);
	}
	public static void linearSearch(int[] arr,int sch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sch) {
				System.out.println("Present");
			} 
		}
	}
	public static void binarySearch(int[] biarr,int sch,int fi,int li,int mi) {
		while(fi<=li) {
		if (biarr[mi]==sch) {
			System.out.println("Element Present in "+mi+" index");
			break;
		} else if(biarr[mi]<sch){
			fi=mi+1;
		}else {
			li=mi-1;
		}
		mi=(fi+li)/2;
		}
		if (fi>li) {
			System.out.println("Element not found");
		}
	}
}
