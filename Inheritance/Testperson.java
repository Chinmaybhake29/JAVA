package Inheritance;

public class Testperson {

	public static void main(String[] args) {
		Person p=new Person("Chinmay", 23, 'M');
		System.out.println(p);
		p.display();
		p.func1();
		
		student s1=new student("Chinmay", 25, 'M', 22, "BCA", 84);
		System.out.println(s1);
		s1.display();
		
		Employee e1=new Employee("Chinmay", 25, 'M', 22, "Mtech", 70);
		System.out.println(e1);
		e1.display();
		
		System.out.println("================================================");
		
		Person p2=new Person("YUI", 23, 'F');
		p2=new student("ABC", 23, 'M', 12, "IT", 99);
		p2=new Employee("YASH", 25, 'M', 45,"MTECH", 90);
		System.out.println(p);
	}

}
