package com.igeek.jdbc.JAday04_01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Testt101 {
	static {
		// 静态代码块
	}

	{
         //构造代码块
	}

	public static void main(String[] args) throws SQLException {
		getConn();
	}

	public static Connection getConn() throws SQLException {
		// 1.拿到驱动对象
		Driver driver = new com.mysql.jdbc.Driver();
		// url:数据库的链接地址
		// info:链接数据库的信息:用户名的密码
		String url = "jdbc:mysql://localhost:3306/mydb";
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "root");
		// 2.拿到connection
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
		return conn;

	}

	public static Connection getConn2() throws Exception {
		// 1.拿到驱动对象
//		Driver driver = new com.mysql.jdbc.Driver();
		Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
		Driver driver1 = (Driver) clazz.newInstance();
		// url:数据库的链接地址
		// info:链接数据库的信息:用户名的密码
		String url = "jdbc:mysql://localhost:3306/mydb";
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "root");
		// 2.拿到connection
		Connection conn = driver1.connect(url, info);
		System.out.println(conn);
		return conn;

	}

	public static Connection getConn4() throws Exception {
		// 1 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2 获得连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		System.out.println(conn);
		return conn;
	}
}
