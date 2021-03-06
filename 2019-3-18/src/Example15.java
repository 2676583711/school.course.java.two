public class Example15 implements Fish {

	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();

		Cat c2 = new Cat();

		c.shout();
		d.shout();

		System.out.println("a=" + c.a + ":" + c2.a);

		System.out.println("b=" + c.b);
		Example15 e = new Example15();
		e.a();
		e.b();
		e.c();
	}
}

// abstract class
abstract class Animal {
	// public String a;

	public static final String a = "null";

	// final int a = 5;
	float b = 20f;

	// 方法注释之后，erros:The method shout() of type Cat must override or implement a
	// supertype method
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

// 在接口中测试default关键字
interface Fish {
	default void a() {
		System.out.println("interface fish.a method");
	}

	default void b() {
		System.out.println("interface fish.b method");

	}

	default void c() {
		System.out.println("interface fish.c method");

	}
}