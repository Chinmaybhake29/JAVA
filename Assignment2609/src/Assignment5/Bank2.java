package Assignment5;

public class Bank2 extends Bank{
	protected String name;
    protected int d;
	public Bank2(String name, int d) {
		super();
		this.name = name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Bank2 [name=" + name + ", d=" + d + ", accBal=" + accBal + ", interest=" + interest + "]";
	}
    
    
}
