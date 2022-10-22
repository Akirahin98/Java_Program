package com.Basic.Program;

import java.util.Iterator;

public class OccuranceOfNumberInArray {

	public static void main(String[] args) {
		occurance();
	}


	public static void occurance() {
		int[] a= {2,6,2,3,6,4,6,3,4};
		//array b will store frequency of element 
		int[] b=new int[a.length];
		int c=-1;
		for (int i = 0; i <a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
					//To avoid counting same element again  
					b[j]=c;
				}
			}
			if (b[i]!=c) {
				b[i]=count;
			}		
		}
		for(int i = 0; i < b.length; i++){  
			if(b[i] != c)  
				System.out.println( a[i] + " occurance is " + b[i]);  
		}

	}
}