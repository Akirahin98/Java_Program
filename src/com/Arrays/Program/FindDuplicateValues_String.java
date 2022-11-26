package com.Arrays.Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateValues_String {
	/*Date: 24/11/2022
	 * 1. Find Duplicate values from an String Array
	 */
	public static void main(String[] args) {
		String[] arr= {"raja","raja","raja","rima","runu","tuna","rima","rima","mama","mama","mama"};
		findDuplicate(arr);
	}
	public static void findDuplicate(String[] arr) {
		Map<String, Integer> m=new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			Integer count=m.get(arr[i]);
			if (count==null) {
				m.put(arr[i], 1);
			} else {
				count=count+1;
				m.put(arr[i], count);
			}
		}
		Set<Map.Entry<String, Integer>> sm=m.entrySet();
		for (Map.Entry<String, Integer> entry : sm) {
			if (entry.getValue()>2) {
				System.out.println(entry.getKey());
			}
		}
	}
}
