package exception;

public class ArrayException {

	public static void main(String[] args) {
		int[] arr= {10,200,30,400,50};
		try {
			System.out.println("The element at given index is : "+arr[10]);
			System.out.println("The size of array is : "+arr.length);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of range...");
			System.out.println(e.getMessage());
		}

	}

}
