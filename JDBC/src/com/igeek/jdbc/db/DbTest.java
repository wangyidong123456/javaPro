package com.igeek.jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class DbTest {
	static{
		//��̬�����
	}
	
	{
		//�������飺���빹����룬�����ڹ��췽��֮ǰִ��
	}
	public static void main(String[] args) {
	

	}

	@Test
	public void getConn() {
		Connection conn = null;
		try {
			// 1.�õ���������
			Driver driver = new com.mysql.jdbc.Driver();
			// url:���ݿ�����ӵ�ַ
			// info:�������ݿ����Ϣ���û���������
			String url = "jdbc:mysql://localhost:3306/mydb";
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "root");
			// 2.�õ�connection
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
			// 1.�õ���������
			Class<?> clazz=Class.forName("com.mysql.jdbc.Driver");
			Driver driver=(Driver)clazz.newInstance();
			// url:���ݿ�����ӵ�ַ
			// info:�������ݿ����Ϣ���û���������
			String url = "jdbc:mysql://localhost:3306/mydb";
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "root");
			// 2.�õ�connection
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
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.�õ�connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
