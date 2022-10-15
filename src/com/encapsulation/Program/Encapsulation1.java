package com.encapsulation.Program;

public class Encapsulation1 {
	public static void main(String[] args) {
		Employee a=new Employee();
		a.setid(5);
		a.setname("King");
		System.out.println(a.getid());
		System.out.println(a.getname());
	}
}
class Employee{
	private int id;
	private String name;

	public void setid(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
}
