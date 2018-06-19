package com.igeek.jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class DbTest {
	static{
		//静态代码块
	}
	
	{
		//构造代码块：输入构造代码，但是在构造方法之前执行
	}
	public static void main(String[] args) {
	

	}

	@Test
	public void getConn() {
		Connection conn = null;
		try {
			// 1.拿到驱动对象
			Driver driver = new com.mysql.jdbc.Driver();
			// url:数据库的链接地址
			// info:链接数据库的信息：用户名和密码
			String url = "jdbc:mysql://localhost:3306/mydb";
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "root");
			// 2.拿到connection
			conn = driver.connect(url, info);
			System.out.println(conn);
			// conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getConn1() {
		Connection conn = null;
		try {
			// 1.拿到驱动对象
			Class<?> clazz=Class.forName("com.mysql.jdbc.Driver");
			Driver driver=(Driver)clazz.newInstance();
			// url:数据库的链接地址
			// info:链接数据库的信息：用户名和密码
			String url = "jdbc:mysql://localhost:3306/mydb";
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "root");
			// 2.拿到connection
			conn = driver.connect(url, info);
			System.out.println(conn);
			// conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void getConn2() {
		try {
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.拿到connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
