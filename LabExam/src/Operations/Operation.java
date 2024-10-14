package Operations;

import entity.Vehicle;

public class Operation {
	double check;
	public boolean isAvilabel (Vehicle v, int availabel) {
		check = v.getIsAvailabel();
		if(check<availabel) {
			System.out.println("Sorry Havn't car available");
			return false;
		} else if(availabel<=0){
			System.out.println("Yes the car is availabel");
			return true;
		}
		else
		{
			check=check-availabel;
			v.setIsAvailabel(availabel);
			return true;
		}
	}
		public boolean checkvehicle(Vehicle v1) {
			if(check<0) {
				System.out.println("Currently Vehicle not availabel");
				return false;
			} else if(check > 100)
			{
				System.out.println("avaialbel");
				return false;
			} else {
				return true;
			}
		}
//		public boolean carownername(String name) {
//			char ch;
//			boolean valid false;
//			boolean valid true;
//			
//			if(valid==true) {
//				System.out.println("The vehicle is availabel");
//			} else {
//				System.out.println("The vehicle in not availbel");
//			}
//			return false;
//			
//		}
}
