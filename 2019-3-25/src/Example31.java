public class Example31 {

	public static int divide(int x, int y) throws Exception {
		return x / y;
	}

	public static void main(String[] args) throws Exception {
		try {
			System.out.println("dibvide=" + divide(5, 0));
		} catch (MySelfException e) {
			// e.printStackTrace();
			throw new MySelfException("���ܞ�0");
		}
		System.out.println();
		// System.out.println("dibvide="+divide(5,0));

	}
}
