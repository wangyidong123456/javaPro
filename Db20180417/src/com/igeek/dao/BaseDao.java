package com.igeek.dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import com.igeek.demo.C3p0Utils2;
import com.igeek.util.dbUtils;

public class BaseDao {
	QueryRunner qr = new QueryRunner(C3p0Utils2.getDataSource());

	// 修改：增删改
	public int update(String sql, Object... objs) throws SQLException {
		return qr.update(sql, objs);
	}

	// 查询
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... objs) throws Exception {
		return qr.query(sql, rsh, objs);

	}

	// 查询单个数据
	public Object getForValue(String sql, Object... objs) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			// Statement 处理器对象
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet 结果集对象,里面封装的是查询结果
			rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getObject(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, stmt, rs);
		}
		return null;

	}

	/**
	 * 查询：单个的实体类
	 * 
	 * @param clazz
	 *            实体类对应的类对象
	 * @param sql
	 * @param objs
	 * @return
	 */
	public <T> T get(Class<T> clazz, String sql, Object... objs) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			// Statement 处理器对象
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet 结果集对象,里面封装的是查询结果
			rs = stmt.executeQuery();
			// 拿到结果集的元数据对象
			ResultSetMetaData rsmd = rs.getMetaData();
			if (rs.next()) {
				// 创建一个T对象
				T t = clazz.newInstance();
				// ColumnCount 列的数量
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// ColumnLabel 列的标签，列名
					String columnLabel = rsmd.getColumnLabel(i + 1);

					Object value = rs.getObject(columnLabel);
					// 根据列明找到该类对象中的字段对象
					Field field;
					try {
						field = clazz.getDeclaredField(columnLabel);
						// 设置字段全新未可访问
						if (field != null) {
							field.setAccessible(true);
							// 设置指定对象的指定字段的值
							field.set(t, value);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				return t;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, stmt, rs);
		}
		return null;
	}

	/**
	 * 获取一组实体对象列表
	 * 
	 * @param clazz
	 * @param sql
	 * @param objs
	 * @return
	 */
	public <T> List<T> getForList(Class<T> clazz, String sql, Object ... objs) {

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			// Statement 处理器对象
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet 结果集对象,里面封装的是查询结果
			rs = stmt.executeQuery();
			// 拿到结果集的元数据对象
			ResultSetMetaData rsmd = rs.getMetaData();
			List<T> list = new ArrayList<>();
			// 创建一个T对象 6210 1356 3933 3779
			while (rs.next()) {
				T t = clazz.newInstance();
				// ColumnCount 列的数量
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// ColumnLabel 列的标签，列名
					String columnLabel = rsmd.getColumnLabel(i + 1);
					// 通过标签名获取该列对应的值
					Object value = rs.getObject(columnLabel);
					// 根据列名找到该类对象中的字段对象
					Field field;
					try {
						// 通过列名即BEAN类中的成员的变量名，获取字段对象
						field = clazz.getDeclaredField(columnLabel);
						// 设置字段全新未可访问
						if (field != null) {
							field.setAccessible(true);
							// 设置指定对象的指定字段的值
							field.set(t, value);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				list.add(t);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, stmt, rs);
		}

		return null;
	}

	/**
	 * 查询一条记录的信息：存储为键值对
	 * 
	 * @param sql
	 * @param objs
	 * @return
	 */
	public Map<String, Object> getForMap(String sql, Object... objs) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			// Statement 处理器对象
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet 结果集对象,里面封装的是查询结果
			rs = stmt.executeQuery();
			// 拿到结果集的元数据对象
			ResultSetMetaData rsmd = rs.getMetaData();
			// 创建一个T对象
			if (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				// ColumnCount 列的数量
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// ColumnLabel 列的标签，列名
					String columnLabel = rsmd.getColumnLabel(i + 1);
					// 通过标签名获取该列对应的值
					Object value = rs.getObject(columnLabel);
					map.put(columnLabel, value);
				}
				return map;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, stmt, rs);
		}
		return null;
	}

	/**
	 * 查询多条记录的信息：存储为键值对
	 * 
	 * @param sql
	 * @param objs
	 * @return
	 */
	public List<Map<String, Object>> getForMapList(String sql, Object... objs) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			// Statement 处理器对象
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet 结果集对象,里面封装的是查询结果
			rs = stmt.executeQuery();
			// 拿到结果集的元数据对象
			ResultSetMetaData rsmd = rs.getMetaData();
			// 创建一个T对象
			List<Map<String, Object>> list = new ArrayList<>();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				// ColumnCount 列的数量
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// 拿到第i+1列的标签名
					String columnLabel = rsmd.getColumnLabel(i + 1);
					// 通过标签名获取该列对应的值
					Object value = rs.getObject(columnLabel);
					map.put(columnLabel, value);
				}
				list.add(map);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, stmt, rs);
		}
		return null;
	}
}