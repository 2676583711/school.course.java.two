public class Example15 {

	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();

		c.shout();
		d.shout();

		System.out.println("a=" + c.a);

		System.out.println("b=" + c.b);

	}
}

abstract class Animal {
	final int a = 5;
	float b = 20f;

	public abstract void shout();
}

class Cat extends Animal {

	final int a = 502;

	// private a=56;

	@Override
	public void shout() {
		System.out.println("it is a cat.....");

	}

}

class Dog extends Animal {

	@Override
	public void shout() {
		System.out.println("it is a dog.....");

	}

}