package practice03;

import practice02.Person;

public class Student extends Person{

	private int klass;
	
	public Student(String name, int age,int klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	
	public int getKlass() {
		return klass;
	}
	
	public String introduce() {
		return "I am a Student. I am at Class "+ getKlass() + ".";
	}
	
}
