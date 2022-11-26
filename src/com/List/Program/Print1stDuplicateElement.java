package com.List.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print1stDuplicateElement {
	/*Date: 23/11/2022
	 * 1. Print 1st duplicate element from List
	 */
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(1,2,2,2,3,3,3,4,4,4,1,1));
		printduplicate(l);
	}
	public static void printduplicate(List<Integer> l) {
		List<Integer> l1=new ArrayList<>();
		for (int i = 0; i <l.size() ; i++) {
			if (!l1.contains(l.get(i))) {
				l1.add(l.get(i));
				break;
			}
		}
		System.out.println(l1);
	}
}
