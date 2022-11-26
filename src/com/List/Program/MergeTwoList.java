package com.List.Program;

import java.util.ArrayList;

public class MergeTwoList {
	/*Date: 10/11/2022
	 * Merge Two List
	 */
	public static void main(String[] args) {
		mergeList();
	}
	public static void mergeList() {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("1st List value : "+list);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println("2nd List value : "+list1);
		
		list.addAll(list1);
		System.out.println("After merge List value : "+list);
	}
}
