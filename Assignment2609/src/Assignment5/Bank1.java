package Assignment5;

public class Bank1 extends Bank
{
    protected String name;
    protected int d;
	public Bank1(String name, int d) {
		super();
		this.name = name;
		this.d = d;
	}
	@Override
	public String toString() {
		return "Bank1 [name=" + name + ", d=" + d + ", accBal=" + accBal + ", interest=" + interest + "]";
	}
	
    
    
    
	
}
