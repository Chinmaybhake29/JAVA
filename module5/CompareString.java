package module5;

public class CompareString 
{
      public static void main(String args[])
      {
    	  int a=100;
    	  int b=100;
    	  
    	  if(a==b)
    		  System.out.println("same");
    	 String str1="Chinmay";
    	 String str2="Chinmay";
    	 
    	 if(str1==str2)
    		 System.out.println("same");
    	 else
    		 System.out.println("not same");
    	 
    	 String str3=new String("chinmay");
    	 String str4=new String("chinmay");
    	 
    	 if(str3.equals(str4))
    		 System.out.println("same");
      }
	
}
