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

	// �޸ģ���ɾ��
	public int update(String sql, Object... objs) throws SQLException {
		return qr.update(sql, objs);
	}

	// ��ѯ
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... objs) throws Exception {
		return qr.query(sql, rsh, objs);

	}

	// ��ѯ��������
	public Object getForValue(String sql, Object... objs) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			// Statement ����������
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet ���������,�����װ���ǲ�ѯ���
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
	 * ��ѯ��������ʵ����
	 * 
	 * @param clazz
	 *            ʵ�����Ӧ�������
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
			// Statement ����������
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet ���������,�����װ���ǲ�ѯ���
			rs = stmt.executeQuery();
			// �õ��������Ԫ���ݶ���
			ResultSetMetaData rsmd = rs.getMetaData();
			if (rs.next()) {
				// ����һ��T����
				T t = clazz.newInstance();
				// ColumnCount �е�����
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// ColumnLabel �еı�ǩ������
					String columnLabel = rsmd.getColumnLabel(i + 1);

					Object value = rs.getObject(columnLabel);
					// ���������ҵ���������е��ֶζ���
					Field field;
					try {
						field = clazz.getDeclaredField(columnLabel);
						// �����ֶ�ȫ��δ�ɷ���
						if (field != null) {
							field.setAccessible(true);
							// ����ָ�������ָ���ֶε�ֵ
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
	 * ��ȡһ��ʵ������б�
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
			// Statement ����������
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet ���������,�����װ���ǲ�ѯ���
			rs = stmt.executeQuery();
			// �õ��������Ԫ���ݶ���
			ResultSetMetaData rsmd = rs.getMetaData();
			List<T> list = new ArrayList<>();
			// ����һ��T���� 6210 1356 3933 3779
			while (rs.next()) {
				T t = clazz.newInstance();
				// ColumnCount �е�����
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// ColumnLabel �еı�ǩ������
					String columnLabel = rsmd.getColumnLabel(i + 1);
					// ͨ����ǩ����ȡ���ж�Ӧ��ֵ
					Object value = rs.getObject(columnLabel);
					// ���������ҵ���������е��ֶζ���
					Field field;
					try {
						// ͨ��������BEAN���еĳ�Ա�ı���������ȡ�ֶζ���
						field = clazz.getDeclaredField(columnLabel);
						// �����ֶ�ȫ��δ�ɷ���
						if (field != null) {
							field.setAccessible(true);
							// ����ָ�������ָ���ֶε�ֵ
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
	 * ��ѯһ����¼����Ϣ���洢Ϊ��ֵ��
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
			// Statement ����������
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet ���������,�����װ���ǲ�ѯ���
			rs = stmt.executeQuery();
			// �õ��������Ԫ���ݶ���
			ResultSetMetaData rsmd = rs.getMetaData();
			// ����һ��T����
			if (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				// ColumnCount �е�����
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// ColumnLabel �еı�ǩ������
					String columnLabel = rsmd.getColumnLabel(i + 1);
					// ͨ����ǩ����ȡ���ж�Ӧ��ֵ
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
	 * ��ѯ������¼����Ϣ���洢Ϊ��ֵ��
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
			// Statement ����������
			stmt = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				stmt.setObject(i + 1, objs[i]);
			}
			// ResultSet ���������,�����װ���ǲ�ѯ���
			rs = stmt.executeQuery();
			// �õ��������Ԫ���ݶ���
			ResultSetMetaData rsmd = rs.getMetaData();
			// ����һ��T����
			List<Map<String, Object>> list = new ArrayList<>();
			while (rs.next()) {
				Map<String, Object> map = new HashMap<>();
				// ColumnCount �е�����
				for (int i = 0; i < rsmd.getColumnCount(); i++) {
					// �õ���i+1�еı�ǩ��
					String columnLabel = rsmd.getColumnLabel(i + 1);
					// ͨ����ǩ����ȡ���ж�Ӧ��ֵ
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