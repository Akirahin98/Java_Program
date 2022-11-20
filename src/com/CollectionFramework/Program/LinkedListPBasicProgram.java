package com.CollectionFramework.Program;

import java.util.LinkedList;

public class LinkedListPBasicProgram {
	/*Date: 07/11/2022
	 * LinkedList Basic Methods
	 */
	public static void main(String[] args) {
		basicProgram();
	}
	public static void basicProgram() {
		
		LinkedList ll=new LinkedList<>();
		ll.add(20);
		ll.add(30);
		ll.add(50);
		ll.add(20);
		ll.add(50);
		ll.add(20);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		ll.addFirst("King");
		ll.addLast("Queen");
		System.out.println(ll);
		Object obj1=ll.getFirst();
		Object obj2=ll.getLast();
		System.out.println(obj1+"  "+obj2);
		LinkedList ll2=new LinkedList<>(ll);
		System.out.println(ll2.size());
		System.out.println(ll2);
		
	}
}
