package com.tns.ifet.dayseven.array;

public class Student {
	
	private int rollno;
	private String name;
	
	public Student(int roolno, String name) {
		super();
		this.rollno = roolno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
