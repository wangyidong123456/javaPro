package com.igeek.demo;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;



public class C3p0Utils2 {
	private static ComboPooledDataSource ds= new ComboPooledDataSource();	
	public static void main(String[] args) {
		try {
			System.out.println(getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 获取数据库链接
	public static DataSource getDataSource()  {
		return ds;
	}
	public static Connection getConnection() throws SQLException {
		// 将从连接池中获得连接
		return ds.getConnection();
	}
}
