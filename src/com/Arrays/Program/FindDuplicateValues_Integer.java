package com.Arrays.Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateValues_Integer {
	/*Date: 24/11/2022
	 * 1. Find Duplicate values from an Integer Array
	 */
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,3,3,4,4,4,8,9};
		findDuplicate(arr);
	}
	public static void findDuplicate(int[] arr) {
		Map<Integer, Integer> m=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			Integer count=m.get(arr[i]);
			if (count==null) {
				m.put(arr[i], 1);
			} else {
				count=count+1;
				m.put(arr[i], count);
			}
		}
		Set<Map.Entry<Integer,Integer>> sm=m.entrySet();
		for (Map.Entry<Integer, Integer> entry : sm) {
			if (entry.getValue()>2) {
				System.out.println(entry.getKey());
			}
		}
	}
	
}
