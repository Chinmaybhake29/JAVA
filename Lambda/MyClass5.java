package Lambda;

import java.util.ArrayList;
public class MyClass5 {

	public static void main(String[] args) {
		ArrayList<Integer> arrlList=new ArrayList<Integer>();
		arrlList.add(1000);
		arrlList.add(56);
		arrlList.add(34);
		arrlList.add(51);
		arrlList.add(2);
		arrlList.add(34);
		
		arrlList.forEach(n -> System.out.println(n));
		
		System.out.println("Even number");
		arrlList.forEach(n -> {
			if(n%2==0) {
				System.out.println(" " + n);
			}
			
		});
	}

}
