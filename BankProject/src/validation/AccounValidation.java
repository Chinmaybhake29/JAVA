package validation;

public class AccounValidation {
	public boolean checkAccNo(int accNo) {
		if (accNo <= 0) {
			System.out.println("Invalid Account Number");
			return false;

		} else {
			return true;
		}
	}
	public boolean checkBalance(double balance) {
		if(balance <=0) {
			System.out.println("The Balance is invalid");
			return false;
		} else if(balance > 100000){
			System.out.println("Please show the proof");
			return false;
		} else {
			return true;
		}
	}
	public boolean checkAccountHolderName(String accHolder) {
		boolean valid=false;
		char ch;
		
		for(int i=0;i<accHolder.length();i++) {
			ch=accHolder.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
				valid=true;
			} else {
				valid=false;
				break;
			}
		}
		if(valid=true) {
			System.out.println("Name is valid");
			return true;
		} else {
			System.out.println("Name is invalid;");
			return false;
		}
	}
	public boolean checkinformation(int accNo, String accHolderName, double balance) {
		if(!checkAccNo(accNo))
			return false;
		else if(!checkAccountHolderName(accHolderName))
			return false;
		else if(!checkBalance(balance))
			return false;
		else 
			return true;
	}
}
