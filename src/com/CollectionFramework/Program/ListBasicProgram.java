package com.CollectionFramework.Program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListBasicProgram {
	/*Date: 05/11/2022
	 * List Basic Methods
	 */
	public static void main(String[] args) {
		basicProgramlist();
	}
	public static void basicProgramlist() {
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(1, 20);
		lst.add("Man");
		lst.add(null);
		lst.add(null);
		System.out.println(lst);
		System.out.println("========Iterator==========");
		Iterator itl=lst.iterator();
		while(itl.hasNext()) {
			System.out.println(itl.next());
		}
		System.out.println("========ListIterator Forward===========");
		ListIterator lsit=lst.listIterator();
		while(lsit.hasNext()) {
			System.out.println(lsit.next());
		}
		System.out.println("=========ListIterator Backward==========");
		while(lsit.hasPrevious()) {
			System.out.println(lsit.previous());
		}
	}
	
}
