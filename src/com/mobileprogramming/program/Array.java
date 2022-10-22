package com.mobileprogramming.program;

/*
 * Q.1. From a given array, make n elements rotate without using any built-in function.
 eg. given Array:[21,54,11,35,4,18], index:3; output Array: [4,18,21,54,11,35]
 */

public class Array {

	public static void main(String[] args) {
		elementsrotate();
	}
	public static void elementsrotate() {
	int a[]= {21,54,11,35,4,18};
	int b[]=new int[a.length];
	for (int i =0; i<a.length; i++) {
		if(i==4) {
			b[0]=a[i];
			
		}if(i==5){
			b[1]=a[i];
		
		}else {
			
			b[2]=a[0];
			b[3]=a[1];
			b[4]=a[2];
			b[5]=a[3];
			
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	}
}
