package test_math_class;

import java.util.Random;

public class TestMath {

	public static void main(String[] args) {

		Random r = new Random();

		System.out.println("boolean:" + r.nextBoolean());

		System.out.println("double:" + r.nextDouble());
		System.out.println("float:" + r.nextFloat());
		System.out.println("nextInt:" + r.nextInt());
		System.out.println("nextInt(10):" + r.nextInt(10));
		System.out.println("nextLong:" + r.nextLong());
	}
}