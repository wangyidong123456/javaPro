package com.igeek.jdbc.studentsystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtils {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		Properties prop = new Properties();
		try {
			// �ļ�����ȡ����
			prop.load(new FileInputStream("config/db.properties"));
			// prop.load(DbU.class.getResourceAsStream("/db.properties"));
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

	// ������ݿ�����
	public static Connection getConn() {
		Connection conn = null;
		try {
			// 1.��������
			Class.forName(driver);
			// 2.�õ�connection
			conn = DriverManager.getConnection(url, user, password);
			// Connection conn =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
			// System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// ��ɾ��
	public static boolean insert(String sql) {
		Connection conn = null;
		Statement st = null;
		try {
			// ���Ӷ���
			conn = getConn();
			// Statement ����������
			st = conn.createStatement();
			return st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st, null);
		}
		return false;
	}

	// ��ѯ
	public static void select(String sql) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = getConn();
			// Statement ����������
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getObject(1) + ":" + rs.getObject(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, st, rs);
		}

	}

	// �ر���
	public static void close(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
