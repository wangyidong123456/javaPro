package com.igeek.demo;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import com.igeek.util.dbUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static ComboPooledDataSource ds;

	static {
		Properties prop = new Properties();
		// 从文件流读取数据
		// prop.load(new FileInputStream("db.properties"));
		try {
			prop.load(dbUtils.class.getResourceAsStream("/account.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver = prop.getProperty("driver");
		url = prop.getProperty("url");
		user = prop.getProperty("user");
		password = prop.getProperty("password");

		ds = new ComboPooledDataSource();
		ds.setUser(user);
		ds.setJdbcUrl(url);
		ds.setPassword(password);
		try {
			ds.setDriverClass(driver);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println(getConn());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 获取数据库链接
	public static Connection getConn() throws Exception {
		return ds.getConnection();
	}
}
