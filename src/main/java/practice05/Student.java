package practice05;

import practice05.Person;

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
		super.introduce();
		System.out.println(super.introduce()+" I am a Student. I am at Class "+ getKlass() + ".");
		return super.introduce()+" I am a Student. I am at Class "+ getKlass() + ".";
	}
	
}
