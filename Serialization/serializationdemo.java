package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
	private int empid;
	private String name;
	private double salary;
	public Emp(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class serializationdemo 
{
	public static void main(String[] args) {
		Emp e=new Emp(101, "Chinmay", 56780);
		try {
			FileOutputStream f=new FileOutputStream("d:\\chinmay\\file_emp.txt");
			ObjectOutputStream out=new ObjectOutputStream(f);
			out.writeObject(e);
			
			FileInputStream fs=new FileInputStream("d:\\\\chinmay\\\\file_emp.txt");
			ObjectInputStream in=new ObjectInputStream(fs);
			e=(Emp)in.readObject();
			in.close();
			fs.close();
			
			out.close();
			f.close();
		
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
			
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
			e2.printStackTrace();
		}
		System.out.println("DeSerialization is complete");
		System.out.println("id is " + e.getEmpid());
		System.out.println("ename is: " + e.getName());
		System.out.println("Salary is: " + e.getSalary());
	}

}
