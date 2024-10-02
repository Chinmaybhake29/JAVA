package Assignment5;

public class Bank3 extends Bank{
	protected String name;
    protected int d;
	public Bank3(String name, int d) {
		super();
		this.name = name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Bank3 [name=" + name + ", d=" + d + ", accBal=" + accBal + ", interest=" + interest + "]";
	}
    

}
