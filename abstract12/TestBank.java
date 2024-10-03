package abstract12;

abstract class Bank
{
	protected int id;
	protected float balance;
	
	public abstract float calculateInterest();

	public Bank(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
}
class CurrentAccount extends Bank
{

	public CurrentAccount(int id, float balance) {
		super(id, balance);
	}

	public float calculateInterest() {
		return (balance*0.7f);
	}
	
}
class Loan extends Bank
{

	public Loan(int id, float balance) {
		super(id, balance);
	}

	@Override
	public float calculateInterest() {
		
		return (balance*0.1f);
	}
}
class SavingAccount extends Bank
{
	public SavingAccount(int id, float balance) {
		super(id, balance);
	}

	@Override
	public float calculateInterest() {
		return (balance * 0.56f);
	}
}
class TestBank
{
	public static void main(String args[]) {
		CurrentAccount c=new CurrentAccount(1, 6734);
		System.out.println(c.calculateInterest());
		
		SavingAccount s=new SavingAccount(2, 8989);
		System.out.println(s.calculateInterest());
		
		Loan l=new Loan(3, 7896);
		System.out.println(l.calculateInterest());
	}
}