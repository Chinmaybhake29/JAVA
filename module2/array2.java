package module2;

public class array2 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
