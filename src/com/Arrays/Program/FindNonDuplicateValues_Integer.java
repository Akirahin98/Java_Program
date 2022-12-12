package com.Arrays.Program;

import java.util.HashMap;
import java.util.Map;

public class FindNonDuplicateValues_Integer {
	/*Date: 12/12/2022
	 * 1. Find Non Duplicate Values from Arrays
	 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3,2,1,8,9};
		nonDuplicate(arr);
	}
	public static void nonDuplicate(int[] arr) {
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
		for (Map.Entry<Integer, Integer> data : m.entrySet()) {
			if (data.getValue()==1) {
				System.out.println(data.getKey());
			}
		}
	}
}
