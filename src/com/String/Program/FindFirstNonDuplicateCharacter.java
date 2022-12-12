package com.String.Program;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonDuplicateCharacter {
	/*Date: 12/12/2022
	 * 1. Find first non-duplicate value from String using String method and Using Collection
	 */
	public static void main(String[] args) {
		String s="AABCDEDCAB";
		nonDuplicate(s);
		System.out.println("======");
		nonDuplicate1(s);
	}
	//Approach-1
	public static void nonDuplicate(String s) {
		for (int i = 0; i < s.length(); i++) {
			boolean val=true;
			for (int j = 0; j < s.length(); j++) {
				if (i!=j&&s.charAt(i)==s.charAt(j)) {
					val=false;
				}
			}
			if (val) {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
	//Approach-2
	public static void nonDuplicate1(String s) {
		Map<Character, Integer> m=new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Integer count=m.get(s.charAt(i));
			if (count==null) {
				m.put(s.charAt(i), 1);
			} else {
				count=count+1;
				m.put(s.charAt(i), count);
			}
		}
		for (Map.Entry<Character, Integer> data : m.entrySet()) {
			if (data.getValue()==1) {
				System.out.println(data.getKey());
				break;
			}
		}

	}
}
