package entity;

public class customer {
	
	
	private int customerid;
	private String name;
	
	public customer(int customerid, String name) {
		super();
		this.customerid = customerid;
		this.name = name;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "customer [customerid=" + customerid + ", name=" + name + "]";
	}		
}
