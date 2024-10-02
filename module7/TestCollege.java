package module7;

class Stream {
	private String type;
	private int fees;
	private int noofstudent;

	public Stream(String type, int fees, int noofstudent) {
		super();
		this.type = type;
		this.fees = fees;
		this.noofstudent = noofstudent;
	}

	@Override
	public String toString() {
		return "Stream [type=" + type + ", fees=" + fees + ", noofstudent=" + noofstudent + "]";
	}

}

class College {
	private String name;
	private char grade;
	private String address;
	private String contactNo;

	public College(String name, char grade, String address, String contactNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.address = address;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", grade=" + grade + ", address=" + address + ", contactNo=" + contactNo + "]";
	}

}

public class TestCollege {

	public static void main(String[] args) {
		College c = new College("MET", 'A', "Nashik", "34545454");
		Stream s1 = new Stream("CS", 70000, 90);
		Stream s2 = new Stream("IT", 60000, 89);
		Stream s3 = new Stream("Mech", 80000, 92);
		Stream s4 = new Stream("Civil", 90000, 91);
		Stream s5 = new Stream("Ele", 70000, 92);

		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
