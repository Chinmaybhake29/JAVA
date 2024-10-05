package Testpack;

public class Student extends Person1{

	private int rollno;
	private int marks;
	private String course;
	public Student(String name, String lastname, String collegename, int seatno, int rollno, int marks, String course) {
		super(name, collegename, course, seatno);
		this.rollno = rollno;
		this.marks = marks;
		this.course = course;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void tolearn() {
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", course=" + course + "]";
	}
	
}
