package abstract12;

abstract class Animal {
	final int legs=4;
	abstract public void sound();
	
	public void classinfo(String type) {
		System.out.println("I belongs to " + type + " has " + legs + " legs ");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("Dog Barks");
	}
}
class Lion extends Animal{
	public void sound() {
		System.out.println("Lion Rorr.......");
	}
}
class TestAnimal
{
	public static void main(String args[]) {
		Dog d=new Dog();
		d.sound();
		d.classinfo("Dog");
		Lion simba=new Lion();
		simba.sound();
		simba.classinfo("Lion");
	}
}
