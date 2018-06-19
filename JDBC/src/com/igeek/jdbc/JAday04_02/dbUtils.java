package com.igeek.jdbc.JAday04_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class dbUtils {
	public static void main(String[] args) {
		select();
	}
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("config/db.properties"));
			// prop.load(Testt102.class.getResourceAsStream("E:\\holle\\.metadata\\Java-Se\\config\\Testt102.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
	}
//注册驱动连接
	public static Connection getConn() throws Exception {
		// 1 加载驱动
		Class.forName(driver);
		// 2 获得连接
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;

	}

	public static void select() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			String sql = "select id,sname from stu";
			// Statement 处理器对象
			stmt = conn.createStatement();
			// ResultSet 结果集对象,里面封装的是查询结果
			rs = stmt.executeQuery(sql);
			for (; rs.next();) {
				System.out.println(rs.getObject("id") + ":" + rs.getObject("sname"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, stmt, rs);
		}
	}

	public static boolean insert() {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = dbUtils.getConn();
			String sql = "insert into category values(4,'家具')";
			// Statement 处理器对象
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(conn, stmt, null);
		return false;
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs!=null)
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(conn!=null)
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
