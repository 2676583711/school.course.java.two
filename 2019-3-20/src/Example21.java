public class Example21 {

	public static void main(String[] args) {

		// System.out.println(divide(4, 0));

		try {
			System.out.println(divide(4, 0));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		} finally {

			System.out.println("go on.........");
		}
	}

	public static int divide(int x, int y) {
		return x / y;
	}

}