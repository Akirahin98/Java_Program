package com.List.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListElement {
	/*Date: 23/11/2022
	 * 1. Sort the elements present in List
	 */
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(1,5,2,8,3,4,12,34,83,31,35));
		sortElements(l);
	}
	public static void sortElements(List<Integer> l) {
		Collections.sort(l);
		System.out.println(l);
	}
}
