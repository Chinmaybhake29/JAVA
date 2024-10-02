package module2;

public class array4 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int n=a.length-2;
		for(int i=n;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		// start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            
            // return the first element which is not equal to the 
            // largest element
            if (a[i] != a[n - 1]) {
                return;
            }
        }
	}

}
