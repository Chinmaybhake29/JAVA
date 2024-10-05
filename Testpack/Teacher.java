package Testpack;

public class Teacher extends Student {

	private int id;
	private String sub;
	private int sal;
	
	public Teacher(String name, String lastname, String collegename, int seatno, int rollno, int marks, String course,
			int id, String sub, int sal) {
		super(name, lastname, collegename, seatno, rollno, marks, course);
		this.id = id;
		this.sub = sub;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", sub=" + sub + ", sal=" + sal + "]";
	}
	

}
