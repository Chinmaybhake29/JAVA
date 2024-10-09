package DuplicationDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test{
	 private String s;
     public Test() {
  	   s="Hello World";
     }
     public void method1() {
    	 System.out.println("The String is" + s);
     }
     public void method2(int n) {
    	 System.out.println("The Number is" + n);
     }
     private void method3() {
    	 System.out.println("this is private method");
     }
     
}

public class Duplicatedem {
	      public static void main(String args[]) throws Exception {
	    	  Test t=new Test();
	    	  Class cls=t.getClass();
	    	  System.out.println("The class is" + cls.getName());
	    	  
	    	  Constructor cons=cls.getConstructor();
	    	  
	    	  System.out.println("The name of Constructor is" + cons.getName());
	    	  System.out.println("The Public method of class are");
	    	  Method[]methods=cls.getMethods();
	    	  for (Method a : methods) {
				System.out.println(a.getName());
			}
	    	  System.out.println("======================================");
	    	  Method method11=cls.getDeclaredMethod("method2", int.class);
	    	  method11.invoke(t, 22);
	    	  
	    	  Field field=cls.getDeclaredField("s");
	    	  field.setAccessible(true);
	    	  field.set(t, "JAVA");
	    	  
	    	  Method methodcall2=cls.getDeclaredMethod("method1");
	    	  methodcall2.invoke(t);
	    	  
	    	  Method methodcall3=cls.getDeclaredMethod("method3");
	    	  methodcall3.setAccessible(true);
	    	  methodcall3.invoke(t);
	      }
}