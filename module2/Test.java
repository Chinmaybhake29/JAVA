package module2;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		
		//s1.accept();
		s1.display();
		s1.attendClass();
		s1.appearexam();
		s1.completeassignment();

		
		s2.attendClass();
		s1.display();
		s2.attendClass();
		s2.appearexam();
		s2.completeassignment();
		

	}

}
