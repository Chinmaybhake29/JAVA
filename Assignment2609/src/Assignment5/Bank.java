package Assignment5;

public class Bank 
{
    protected double accBal;
    final double interest=1.3;
	
    public double getBalance()
    {
    	return 0;
    }
    public double applyInterest()
    {
    	double getBalance=accBal/interest;
    	return getBalance;
    }
	@Override
	public String toString() {
		return "Bank [accBal=" + accBal + ", interest=" + interest + "]";
	}

}
