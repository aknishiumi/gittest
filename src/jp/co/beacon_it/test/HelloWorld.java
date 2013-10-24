package jp.co.beacon_it.test;

/*
 * comment
 * comment
 * comment
 */
public class HelloWorld {

	private static String name;
	private static String type;
	private static int age;

	public static void setName(String n) {
		name = n;
	}

	public static String getName() {
		return name;
	}

	public String toString() {
		return "Hello, " + name;
	}

}
