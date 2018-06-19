package com.jiayuan.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jiayuan.demo.C3p0Utils;

public class ReturnBookDao {
	// 添加(修改)书籍还书记录
	public void abrr(String bid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update books set state='未借' where  bid=?  ";
		qr.update(sql, bid);
	}

	// 添加(修改)用户还书记录
	public void aurr(String id) throws SQLException {
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update user set borrownumber=borrownumber-1 where id=?";
		qr.update(sql, id);
	}
	//遗失书籍处理
	public void Mislaid(String bid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update books set state='遗失' where  bid=?  ";
		qr.update(sql, bid);
	}
}
