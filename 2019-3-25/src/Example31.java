public class Example31 {
	public static int divide(int x, int y) throws Exception {
		return x / y;
	}

	public static void main(String[] args) throws MySelfException { // throws MySelfException
		try {
			System.out.println("dibvide=" + divide(5, 0));
		 
		} catch (Exception e) {  //catch (MySelfException e) {
			//throw new MySelfException("���ܞ�0");
			//e.printStackTrace();
			throw new MySelfException("���ܞ�0");
		}
		// System.out.println("dibvide="+divide(5,0));

	}
}
