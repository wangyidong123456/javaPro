package com.jiayuan.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.jiayuan.demo.C3p0Utils;

public class ReturnBookDao {
	// ���(�޸�)�鼮�����¼
	public void abrr(String bid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update books set state='δ��' where  bid=?  ";
		qr.update(sql, bid);
	}

	// ���(�޸�)�û������¼
	public void aurr(String id) throws SQLException {
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update user set borrownumber=borrownumber-1 where id=?";
		qr.update(sql, id);
	}
	//��ʧ�鼮����
	public void Mislaid(String bid) throws SQLException {
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update books set state='��ʧ' where  bid=?  ";
		qr.update(sql, bid);
	}
}
