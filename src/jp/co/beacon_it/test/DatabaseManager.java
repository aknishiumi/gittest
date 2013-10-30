package jp.co.beacon_it.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class DatabaseManager {

	private boolean usable;
	private String url;
	private String user;
	private String password;

	public DatabaseManager(String driver, String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		
		try {
			Class.forName(driver);
			this.usable = true;
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int update(String sql) {
		int result = -1;
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	public Map<String, Object> getData(String sql) {
		Map<String, Object> data = null;
		
		return data;
	}

}
