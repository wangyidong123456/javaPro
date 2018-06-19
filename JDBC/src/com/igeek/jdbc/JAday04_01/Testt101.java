package com.igeek.jdbc.JAday04_01;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Testt101 {
	static {
		// ��̬�����
	}

	{
         //��������
	}

	public static void main(String[] args) throws SQLException {
		getConn();
	}

	public static Connection getConn() throws SQLException {
		// 1.�õ���������
		Driver driver = new com.mysql.jdbc.Driver();
		// url:���ݿ�����ӵ�ַ
		// info:�������ݿ����Ϣ:�û���������
		String url = "jdbc:mysql://localhost:3306/mydb";
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "root");
		// 2.�õ�connection
		Connection conn = driver.connect(url, info);
		System.out.println(conn);
		return conn;

	}

	public static Connection getConn2() throws Exception {
		// 1.�õ���������
//		Driver driver = new com.mysql.jdbc.Driver();
		Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");
		Driver driver1 = (Driver) clazz.newInstance();
		// url:���ݿ�����ӵ�ַ
		// info:�������ݿ����Ϣ:�û���������
		String url = "jdbc:mysql://localhost:3306/mydb";
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "root");
		// 2.�õ�connection
		Connection conn = driver1.connect(url, info);
		System.out.println(conn);
		return conn;

	}

	public static Connection getConn4() throws Exception {
		// 1 ��������
		Class.forName("com.mysql.jdbc.Driver");
		// 2 �������
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		System.out.println(conn);
		return conn;
	}
}
