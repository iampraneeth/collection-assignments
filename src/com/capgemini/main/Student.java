package com.capgemini.main;

public class Student {
	private String name;
	private int rollno;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollno, String city) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
