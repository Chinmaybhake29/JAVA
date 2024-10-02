package module2;

public class array3 {
	
	public static void main(String args[])
	{
		int a[]= {10,20,30,40,50,60,70,80};
		int sum=0;
		
		for(int i:a)
		{
			sum=sum+i;
		}
		double avg=sum/a.length;
		System.out.println(avg);
	}
    
}
