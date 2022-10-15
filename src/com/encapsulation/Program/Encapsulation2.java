package com.encapsulation.Program;

public class Encapsulation2 {

	public static void main(String[] args) {
		ComanndoRegister cmdr=new ComanndoRegister();
		cmdr.setname("King");
		cmdr.setemail("king@gmail.com");
		cmdr.setpassword("Queen");
		cmdr.setage(24);
		cmdr.setgender('M');
		System.out.println("Name     :"+cmdr.getname());
		System.out.println("Email    :"+cmdr.getemail());
		System.out.println("Password :"+cmdr.getpassword());
		System.out.println("Age      :"+cmdr.getage());
		System.out.println("Gender   :"+cmdr.getgender());


	}
}
class ComanndoRegister {
	private String name,email,password;
	private int age; 
	private char gender;

	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}

	public void setemail(String email) {
		this.email=email;
	}
	public String getemail() {
		return email;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	public String getpassword() {
		return password;
	}
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	public void setgender(char gender) {
		this.gender=gender;
	}
	public char getgender() {
		return gender;
	}
}