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
		// 模板
		Connection conn = null;
		try {
			// 1 获得连接
			conn = C3p0Utils.getConn();
			// 2 开启事务
			conn.setAutoCommit(false);
			// .....
			// 3 提交事务
			conn.commit();
		} catch (Exception e) {
			// 4 回滚事务
			conn.rollback();
		} finally {
			// 5 释放资源
			if (conn != null) {
				conn.close();
			}
		}
	}
	@Test
	public void demo02() throws SQLException {
		// 转账
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			// 1 获得连接
			conn = C3p0Utils.getConn();
			// 2 开启事务
			conn.setAutoCommit(false);
			String sql = "update account set money=money+? where name=?";
			// 具体操作
			psmt = conn.prepareStatement(sql);
			// @1 汇款
			psmt.setInt(1, -100);
			psmt.setString(2, "jack");
			psmt.executeUpdate();
			// 模拟停电
//			int i = 1 / 0;
			// @2 收款
			psmt.setInt(1, 100);
			psmt.setString(2, "rose");
			psmt.executeUpdate();
			// 3 提交事务
			conn.commit();
		} catch (Exception e) {
			// 4 回滚事务
			conn.rollback();
			throw new RuntimeException("程序回滚", e);
		} finally {
			// 5 释放资源
			if (conn != null) {
				conn.close();
			}
		}
	}
	public void demo03() {
		// 转账
		Connection conn = null;
		QueryRunner queryRunner = new QueryRunner();
		try {
			// 获得连接
			conn = C3p0Utils.getConn();
			// 开启事务
			conn.setAutoCommit(false);

			String sql = "update account set money=money+? where name=?";

			// @1汇款
			 queryRunner.update(conn, sql, -100, "jack");
			// @2收款
			queryRunner.update(conn, sql, 100, "rose");

			// 提交并释放资源
//			dbUtils.commitAndCloseQuietly(conn);
			System.out.println("提交成功");
		} catch (Exception e) {
			e.printStackTrace();
			// 回滚并释放资源
//			dbUtils.rollbackAndCloseQuietly(conn);
			System.out.println("程序回滚");
		}
	}

}
