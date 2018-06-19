package com.igeek.jdbc.studentsystem;

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

public class BaseDao {

	// 增删改
	public int update(String sql, Object...obj) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			// 连接对象
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				st.setObject(i + 1, obj[i]);
			}
			return st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, null);
		}
		return 0;
	}

	// 查询单个值
	public Object getForvalue(String sql, Object...obj) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			// 连接对象
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				st.setObject(i + 1, obj[i]);
			}
			rs = st.executeQuery();
			if (rs.next()) {
				return rs.getObject(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, null);
		}
		return null;
	}

	// 获得单个对象
	public <T> T get(Class<T> clazz, String sql, Object...obj) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		T t = null;
		try {
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				st.setObject(i + 1, obj[i]);
			}
			rs = st.executeQuery();
			// 获得对象
			t = clazz.newInstance();
			// 获得元数据
			ResultSetMetaData rsd = st.getMetaData();
			if (rs.next()) {
				for (int i = 0; i < rsd.getColumnCount(); i++) {// 字段数量
					String value = rsd.getColumnLabel(i + 1);// 字段名称
					Object temp = rs.getObject(value);// 字段内容
					// BeanUtils.setProperty(t, value, temp);
					Field field = clazz.getDeclaredField(value);
					field.setAccessible(true);
					field.set(t, temp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, rs);
		}
		return t; 
	}
//	// 获得单个对象
//	public Map<String,Object> getMap( String sql, Object...obj) {
//		Connection conn = null;
//		PreparedStatement st = null;
//		ResultSet rs = null;
//		Map<String,Object> map=new HashMap<String,Object>();
//		try {
//			conn = DbUtils.getConn();
//			// Statement 处理器对象
//			st = conn.prepareStatement(sql);
//			for (int i = 0; i < obj.length; i++) {
//				st.setObject(i + 1, obj[i]);
//			}
//			rs = st.executeQuery();
//			// 获得元数据
//			ResultSetMetaData rsd = st.getMetaData();
//			if (rs.next()) {
//				for (int i = 0; i < rsd.getColumnCount(); i++) {// 字段数量
//					String value = rsd.getColumnLabel(i + 1);// 字段名称
//					Object temp = rs.getObject(value);// 字段内容
//					map.put(value, temp);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			DbUtils.close(conn, st, rs);
//		}
//		return map;
//		
//	}

	public <T> List<T> getForList(Class<T> clazz, String sql, Object...obj) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<T> list = new ArrayList<T>();
		T t = null;
		try {
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				st.setObject(i + 1, obj[i]);
			}
			rs = st.executeQuery();
			// 获得对象
			// 获得元数据
			ResultSetMetaData rsd = st.getMetaData();
			while (rs.next()) {
				t = clazz.newInstance();
				for (int i = 0; i < rsd.getColumnCount(); i++) {// 字段数量
					String value = rsd.getColumnLabel(i + 1);// 字段名称
					Object temp = rs.getObject(value);// 字段内容
					// BeanUtils.setProperty(t, value, temp);
					Field field = clazz.getDeclaredField(value);
					if(field!=null){
					field.setAccessible(true);
					field.set(t, temp);
					}
				}
				list.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, rs);
		}
		return list;
	}
	
	//查询所有学生用List<map>存起来
	public  List<Map<String,Object>> getForListMap(String sql, Object...obj) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map= new HashMap<String,Object>();
		try {
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				st.setObject(i + 1, obj[i]);
			}
			rs = st.executeQuery();
			// 获得对象
			// 获得元数据
			ResultSetMetaData rsd = st.getMetaData();
			while (rs.next()) {
				for (int i = 0; i < rsd.getColumnCount(); i++) {// 字段数量
					String value = rsd.getColumnLabel(i + 1);// 字段名称
					Object temp = rs.getObject(value);// 字段内容
					// BeanUtils.setProperty(t, value, temp);
					map.put(value, temp);
				}
				list.add(map);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, rs);
		}
		return list;
	}
	
	
	
	// 查询单个学生
	public Student selectStudent(String sql, Object... obj) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Student stu = null;
		try {
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				st.setObject(i + 1, obj[i]);
			}
			rs = st.executeQuery();
			while (rs.next()) {
				stu = new Student(rs.getString("id"), rs.getString("sname"), rs.getString("age"), rs.getString("sex"),
						rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, rs);
		}
		return stu;
	}

	// 查询所有学生
	public List<Student> selectAllStudent(String sql) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Student> stus = new ArrayList<Student>();
		Student stu = null;
		try {
			conn = DbUtils.getConn();
			// Statement 处理器对象
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				stu = new Student(rs.getString("id"), rs.getString("sname"), rs.getString("age"), rs.getString("sex"),
						rs.getString("address"));
				stus.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, rs);
		}
		return stus;
	}
}
