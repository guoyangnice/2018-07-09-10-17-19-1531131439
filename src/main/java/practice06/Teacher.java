package practice06;

public class Teacher extends Person{
	
	private int klass;
	
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age,int klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	
	public int getKlass() {
		return klass;
	}
	
	public String introduce() {
		if(klass > 0) {
			return super.introduce() + " I am a Teacher. I teach Class " +getKlass()+ ".";
		}
		return super.introduce() + " I am a Teacher. I teach " + "No Class.";
		
	}
	
}
