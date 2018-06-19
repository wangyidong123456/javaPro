package com.igeek.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import com.igeek.demo.C3p0Utils;

public class Test01 {
	@Test
	public void demo01() throws SQLException {
		// ģ��
		Connection conn = null;
		try {
			// 1 �������
			conn = C3p0Utils.getConn();
			// 2 ��������
			conn.setAutoCommit(false);
			// .....
			// 3 �ύ����
			conn.commit();
		} catch (Exception e) {
			// 4 �ع�����
			conn.rollback();
		} finally {
			// 5 �ͷ���Դ
			if (conn != null) {
				conn.close();
			}
		}
	}
	@Test
	public void demo02() throws SQLException {
		// ת��
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			// 1 �������
			conn = C3p0Utils.getConn();
			// 2 ��������
			conn.setAutoCommit(false);
			String sql = "update account set money=money+? where name=?";
			// �������
			psmt = conn.prepareStatement(sql);
			// @1 ���
			psmt.setInt(1, -100);
			psmt.setString(2, "jack");
			psmt.executeUpdate();
			// ģ��ͣ��
//			int i = 1 / 0;
			// @2 �տ�
			psmt.setInt(1, 100);
			psmt.setString(2, "rose");
			psmt.executeUpdate();
			// 3 �ύ����
			conn.commit();
		} catch (Exception e) {
			// 4 �ع�����
			conn.rollback();
			throw new RuntimeException("����ع�", e);
		} finally {
			// 5 �ͷ���Դ
			if (conn != null) {
				conn.close();
			}
		}
	}
	public void demo03() {
		// ת��
		Connection conn = null;
		QueryRunner queryRunner = new QueryRunner();
		try {
			// �������
			conn = C3p0Utils.getConn();
			// ��������
			conn.setAutoCommit(false);

			String sql = "update account set money=money+? where name=?";

			// @1���
			 queryRunner.update(conn, sql, -100, "jack");
			// @2�տ�
			queryRunner.update(conn, sql, 100, "rose");

			// �ύ���ͷ���Դ
//			dbUtils.commitAndCloseQuietly(conn);
			System.out.println("�ύ�ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			// �ع����ͷ���Դ
//			dbUtils.rollbackAndCloseQuietly(conn);
			System.out.println("����ع�");
		}
	}

}
