package com.Basic.Program;

public class PrintAllEvenNumber {
	/* Date:07/10/2022
	 */
	public static void main(String[] args) {
		evennumber();
	
}
	public static void evennumber() {
		for (int i = 0; i<=10; i++) {
			if (i%2==0) {
				System.out.println("even number "+i);
			}
		}
	}
}
