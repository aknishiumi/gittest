package jp.co.beacon_it.test;

/*
 * comment
 * comment
 * comment
 */
public class HelloWorld {

	private static String name;

	public static void setName(String n) {
		name = n;
	}

	public static String getName() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		HelloWorld.setName("Pero");
		System.out.println(HelloWorld.getName());
	}

}
