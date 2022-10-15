package com.methodoverriding.Program;

public class MethodOverriding2 {

	public static void main(String[] args) {
	
}
}
class G{
	 void mo() {
		System.out.println("Method G ");
	}
}
class H extends G{
	 void mo() {
		System.out.println("Method H");
	}
}
class I extends H{
	 void mo() {
		System.out.println("Method I");
	}
}
class J extends I{
	 void mo() {
		System.out.println("Method J");
	}
}