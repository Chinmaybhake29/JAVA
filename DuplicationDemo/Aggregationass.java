package DuplicationDemo;

public class Aggregationass {

	public static void main(String args[])
	{
		Address add=new Address("Nagpur", "MH", "India");
		add.toString();
		System.out.println(add);
		
		Name n=new Name("Chinmay", "Hemant", "Bhake");
		n.toString();
		System.out.println(n);
		
		Student s=new Student(101, null, add);
		s.display();
		
	}
}
