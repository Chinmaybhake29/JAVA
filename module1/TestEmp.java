package module1;

import module2.Employee;

public class TestEmp {
	public static void main() {
		Employee e = new Employee();
		e.accept();
		e.display();
		e.completeProject();
		e.checkAttendand();
		e.applyLoan();
	}
}
