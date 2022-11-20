package com.CollectionFramework.Program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionProgram {
	/*Date: 05/11/2022
	 * Collection Basic Methods
	 */
	public static void main(String[] args) {
		BasicMethods();
	}
	public static void BasicMethods() {
		Collection cl=new ArrayList<>();
		cl.add(10);
		cl.add("obj");
		cl.add('k');
		cl.add(2.5);
		Collection cl1=new ArrayList<>();
		cl1.add(10);
		cl1.add("King");
		cl1.add(8.4);
		
		//cl.addAll(cl1);
		//cl.remove("obj");
		//cl.removeAll(cl1);//It will remove duplicate element from cl and give rest of element of cl
		cl.retainAll(cl1);
		
		System.out.println(cl);
		System.out.println("==================");
		Iterator it=cl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
