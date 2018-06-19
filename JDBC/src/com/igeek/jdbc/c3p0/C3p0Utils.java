package com.igeek.jdbc.c3p0;


import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Utils {
	private static ComboPooledDataSource ds =new ComboPooledDataSource();
	public static void main(String[] args) throws Exception {
		System.out.println(getConn());
	}
	
	public static Connection getConn() throws SQLException{
		return ds.getConnection();
	}
}
