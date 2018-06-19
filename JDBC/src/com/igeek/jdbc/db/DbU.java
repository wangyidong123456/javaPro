package com.igeek.jdbc.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbU {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		Properties prop = new Properties();
		try {
			// 文件流读取数据
			// prop.load(new FileInputStream("config/db.properties"));
			prop.load(DbU.class.getResourceAsStream("/db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}

	public static void main(String[] args) {
		getConn();
	}

	// 获得数据库连接
	public static Connection getConn() {
		Connection conn = null;
		try {
			// 1.加载驱动
			Class.forName(driver);
			// 2.拿到connection
			conn = DriverManager.getConnection(url, user, password);
			// Connection conn =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
			// System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
