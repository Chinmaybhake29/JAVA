package module5;

public class functionoverloading 
{
    static public int add(int a, int b) {
    	return(a+b);
    }
    static public int add(int a, int b, int c)
    {
    	return(a+b+c);
    }
    static public double add(int a, double b)
    {
    	return(a+b);
    }
	public static void main(String[] args) 
	{
          int result=add(10,20);
          System.out.println(result);
          
          int resul1=add(12,89);
          System.out.println(resul1);
          
          int result2=add(78,45);
          System.out.println(result2);
	}

}
