package Inheritance;

public class Employee extends Person
{
	protected int empno;
	protected String department;
	protected int company;
	public Employee(String name, int age, char gender, int empno, String department, int company) {
		super(name, age, gender);
		this.empno = empno;
		this.department = department;
		this.company = company;
	}
	public void display()
	{
		super.display();
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", department=" + department + ", company=" + company + ", name=" + name
				+ ", age=" + age + ", gender=" + gender + "]";
	}
	

	
}
