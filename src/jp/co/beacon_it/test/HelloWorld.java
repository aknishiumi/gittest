package jp.co.beacon_it.test;

/*
 * comment
 * comment
 * comment
 */
public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString(){
		return "Hello, " + message;
	}
}
