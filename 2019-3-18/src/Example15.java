public class Example15 {

	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();

		Cat c2 = new Cat();

		c.shout();
		d.shout();

		System.out.println("a=" + c.a + ":" + c2.a);

		System.out.println("b=" + c.b);

	}
}

// abstract class
abstract class Animal {
	//public String a;
	
	public static final String a = "null";
	
	//final int a = 5;
	float b = 20f;

	public abstract void shout();

	public void say() {

	}

	// public abstract void speak();
}

// extends class
class Cat extends Animal {

	final int a = 502;

	// private a=56;

	@Override
	public void shout() {
		System.out.println("it is a cat.....");

	}

	@Override
	public void say() {
		// TODO Auto-generated method stub

	}

}

// extends class
class Dog extends Animal {

	@Override
	public void shout() {
		System.out.println("it is a dog.....");

	}

}