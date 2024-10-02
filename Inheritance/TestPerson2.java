package Inheritance;

public class TestPerson2 
{
    public static void main(String args[]) {
    	Person[] a=new Person[5];
    	a[0]=new Person("A", 23, 'M');
    	a[1]=new Person("B", 23, 'M');
    	a[2]=new Person("C", 23, 'M');
    	a[3]=new Person("D", 23, 'F');
    	a[4]=new Person("E", 23, 'F');
    	
    	for(int i=0;i<a.length;i++)
    	{
    		System.out.println(a[i].getName() + " is " + a[i].getAge() + " years old and gender is " + a[i].getGender());
    	}
    }

}
