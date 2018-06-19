package com.igeek.jdbc.JAday04_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentDao extends Basedao{
	// 添加学生信息
	public  int addStudent(Student stu) {
		String sql = "insert into stu values(?,?,?,?,?)";
		Object[] objs = new Object[] { stu.getId(), stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress() };
		return update(sql, objs);
	}

	// 删除学生信息
	public  void deStudent(String id) {
		String sql = "delete from stu where id=?";
		Object[] objs = new Object[] { id };
		 update(sql, objs);
	}

	// 修改学生信息
	public  void upStudent(Student stu) {
		String sql = "update stu set name=?,age=?,sex=?,address=? where id=?";
		Object[] objs = new Object[] { stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(), stu.getId() };
		update(sql, objs);
	}

	// 查询学生信息
	public  void seStudent(String id) {
		String sql = "select*from stu where id=?";
		Object[] objs = new Object[] { id };
		select(sql, objs);
	}

	// 查询所有
	public static List<Student> findAll() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = dbUtils.getConn();
			String sql = "select*from stu";
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			// List<Student> list=new ArrayList<>();
			while (rs.next()) {
				// Student stu=new
				// Student(rs.getString("id"),rs.getString("name"),rs.getString("age"),rs.getString("sex"),rs.getString("address"));
				System.out.print("\t学号:\t" + rs.getString("id"));
				System.out.print("\t名字:\t" + rs.getString("name"));
				System.out.print("\t年龄:\t" + rs.getString("age"));
				System.out.print("\t性别:\t" + rs.getString("sex"));
				System.out.print("\t地址:\t" + rs.getString("address"));
				System.out.println("");
				// list.add(stu);
			}
			// return list;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, st, rs);
		}
		return null;
	}
}
