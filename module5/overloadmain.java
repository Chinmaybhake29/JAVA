package module5;

public class overloadmain {
	static public void main() {
		System.out.println("Main method without any parameter");
	}

	static public void main(int a, int b) {
		System.out.println("Main With 2 Parameters");
	}

	static public void main(int a) {
		System.out.println("Main with 1 parameter");
	}

	public static void main(String[] args) {

		main();
		main(83);
		main(10, 33);

	}

}
