package com.igeek.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.igeek.demo.C3p0Utils2;

public class AccountDao {

	/**
	 * 付款的方法
	 * @param name
	 * @param money
	 * @return 
	 * @throws SQLException 
	 */
	public int out(Connection conn,String name,double money) throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils2.getDataSource());
		String sql = "update account set money=money-? where aname=?";
		return qr.update(conn,sql, money,name);	
		}
	
	public int in(Connection conn,String name,double money) throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils2.getDataSource());
		String sql = "update account set money=money+? where aname=?";
		return qr.update(conn,sql, money,name);	
		}
}
