package com.String.Program;

public class OccuranceOfEachCharacter_String {

	public static void main(String[] args) {
		//occurance();
		occurance1();
	}
	public static void occurance() {
		String s="testengineer";
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s.charAt(i)+" Occurance is "+count);
			s=s.replaceAll(""+s.charAt(i), "");
			i--;
		}
	}
	public static void occurance1() {
		String a="never ever give up";
		a=a.replaceAll(" ", "");
		for(int i=0;i<a.length();i++) {
			int count=1;
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
			}
			System.out.println(a.charAt(i)+" Occurance is "+count);
			a=a.replaceAll(""+a.charAt(i), "");
			i--;
		}
	}
}
