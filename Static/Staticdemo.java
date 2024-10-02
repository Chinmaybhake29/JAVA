package Static;

public class Staticdemo {
		static int num=1678;
		
		public void display() {
			num++;
			System.out.println(num);
		}
		public static void main(String args[]) {
			System.out.println(num);
			System.out.println(Staticdemo.num);
			
			
		}
}
