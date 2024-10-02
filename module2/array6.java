package module2;

public class array6 {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=0;
		a[1]=1;
		
		System.out.println(a[0]+"\n"+a[1]);
		for(int i=2;i<a.length;i++)
		{
			a[i]=a[i-1]+a[i-2];
			System.out.println(""+a[i]);
		}

	}

}
