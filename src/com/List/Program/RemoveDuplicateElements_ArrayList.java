package com.List.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements_ArrayList {
	/*Date: 23/11/2022
	 * 1. Remove duplicate elements from ArrayList
	 */
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(1,2,2,2,3,3,3,4,4,4,1,1));
		removeduplicates(l);
	}
	public static void removeduplicates(List<Integer> l) {
		for (int i = 0; i <l.size() ; i++) {
			for (int j = i+1; j <l.size(); j++) {
				if (l.get(i)==l.get(j)) {
					l.remove(j);
					j--;
				}
			}
		}
		System.out.println(l);
	}
}
