package com.InterviewAsked.program;


public class CGI_Company {
	public static void main(String[] args) {

		//It will give the o/p for child class because return type is Honda3 which is child class type
		Honda3 h=new Honda3();
		System.out.println(h.speedlimit);

		//It will give the o/p for Parent class because return type is Bike which is Parent class type
		Bike b=new Honda3();
		System.out.println(b.speedlimit);
	}
}


class Bike{  
	int speedlimit=90;  
}  
class Honda3 extends Bike{  
	int speedlimit=150;  
}
