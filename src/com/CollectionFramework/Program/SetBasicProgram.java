package com.CollectionFramework.Program;

import java.util.HashSet;
import java.util.Iterator;

public class SetBasicProgram {
	/*Date: 05/11/2022
	 * Set Basic Methods
	 */
	public static void main(String[] args) {
		basicProgramset();
	}
	public static void basicProgramset() {
		HashSet st=new HashSet();
		st.add(20);
		st.add(20);
		st.add(null);
		st.add("test");
		st.add(30);
		st.add(90);
		st.add(null);
		System.out.println(st);
		System.out.println("==================");
		Iterator it2=st.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
