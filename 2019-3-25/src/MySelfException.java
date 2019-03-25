public class MySelfException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MySelfException() {
		super();
	}

	public MySelfException(String message) {
		super(message);
		System.out.println("message:" + message);
	}

}
