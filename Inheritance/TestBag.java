package Inheritance;

public class TestBag {

	public static void main(String[] args) {
		Bag b=new Bag(29, "Magnum", "College");
		
		System.out.println(b);
		
		System.out.println("=========================================================================================================================");
		
		College c=new College(29, "Skybags", "College Bag", "S23443434", "3", 1.5);
		
		System.out.println(c);
		
		System.out.println("=========================================================================================================================");
		
		Trolly t=new Trolly("M2375547", 60, "Magnum", "Trolly", 6.7, 4, 6);
		
		System.out.println(t);
		
	}

}
