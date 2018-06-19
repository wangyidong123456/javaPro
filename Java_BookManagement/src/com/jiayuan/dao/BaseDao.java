package com.jiayuan.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import com.jiayuan.demo.C3p0Utils;

public class BaseDao {
	QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());

	// 修改：增删改
	public int update(String sql, Object... objs) throws SQLException {
		return qr.update(sql, objs);
	}

	// 查询
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... objs) throws Exception {
		return qr.query(sql, rsh, objs);
	}
}