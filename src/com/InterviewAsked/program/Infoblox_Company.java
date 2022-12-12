package com.InterviewAsked.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Infoblox_Company {

	//Abc , cba
	//abccba  //cab
	public static void main(String[] args) {
		List<String> l1= new ArrayList<>();
		l1.add("acb");
		
		List<String> l2= new ArrayList<>();
		l2.add("cba");
		List<String> l4= new ArrayList<>();
		for (String string : l2) {
			l4.add(string);

		}
		
		List<String> l3=new ArrayList<>();
		for (String s1 : l1) {
			l3.add(s1);
		}
		for (String s2 : l2) {
			l3.add(s2);
		}
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l1.size()+" "+l2.size());
		
		if (l1.size()==l2.size()&&l3.containsAll(l4)) {
			System.out.println("Anagram");
		}else {
			System.out.println("not an Anagram");
		}
	}
	
	
}
