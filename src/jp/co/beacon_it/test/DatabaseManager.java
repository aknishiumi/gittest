package jp.co.beacon_it.test;

public class DatabaseManager {

	private String driver;
	private String url;
	private String user;
	private String password;

	public DatabaseManager(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
		
		try {
			Class.forName(driver);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


}
