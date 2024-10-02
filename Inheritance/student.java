package Inheritance;

public class student extends Person{
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", score=" + score + ", name=" + name + ", age="
				+ age + ", gender=" + gender + "]";
	}

	protected int rollno;
	
	protected int score;
	
	
	public student(String name, int age, char gender, int rollno, String stream, int score) {
		super(name, age, gender);
		this.rollno = rollno;
		this.score = score;
	}


	public void display(){
		super.display(); //Calling from parent class
		super.func1();
	}

	
	
	
	
}
