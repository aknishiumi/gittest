package jp.co.beacon_it.test;

import java.util.Map;

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

	public int update(String sql) {
		int result = -1;
		
		return result;
	}
	
	public Map<String, Object> getData(String sql) {
		Map<String, Object> data = null;
		
		return data;
	}

}
