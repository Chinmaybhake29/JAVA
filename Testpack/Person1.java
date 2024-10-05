package Testpack;

class Person1
{
	protected String name;
	protected String lastname;
	protected String collegename;
	protected int seatno;
	
	public Person1(String name, String lastname, String collegename, int seatno) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.collegename = collegename;
		this.seatno=seatno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", lastname=" + lastname + ", collegename=" + collegename + ", seatno="
				+ seatno + "]";
	}
	
	
}
