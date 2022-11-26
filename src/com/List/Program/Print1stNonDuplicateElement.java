package com.List.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print1stNonDuplicateElement {

	/*Date: 23/11/2022
	 * 1. Print 1st Non-duplicate element from List
	 */
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(1,2,2,2,3,3,3,5,4,4,7,4,1,1,9));
		nonDuplicateElement(l);
	}
	public static void nonDuplicateElement(List<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			for (int j = i+1; j < l.size(); j++) {
				if (l.get(i)==l.get(j)) {
					l.remove(i);
					l.remove(j);
				}
			}
		}
		System.out.println(l);
	}
}
