public class MySelfException extends Exception {

	public MySelfException() {
		super();
	}

	public MySelfException(String message) {
		super(message);
		System.out.println("message:" + message);
	}

}
