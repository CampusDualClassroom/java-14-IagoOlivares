package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
	protected void getDetails(){
		System.out.println("Name: " + name + " Surname: " + surname + " Area: " + area);
	}
}
