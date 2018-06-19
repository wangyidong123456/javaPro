package com.igeek.jdbc.JAday04_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentDao extends Basedao{
	// ���ѧ����Ϣ
	public  int addStudent(Student stu) {
		String sql = "insert into stu values(?,?,?,?,?)";
		Object[] objs = new Object[] { stu.getId(), stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress() };
		return update(sql, objs);
	}

	// ɾ��ѧ����Ϣ
	public  void deStudent(String id) {
		String sql = "delete from stu where id=?";
		Object[] objs = new Object[] { id };
		 update(sql, objs);
	}

	// �޸�ѧ����Ϣ
	public  void upStudent(Student stu) {
		String sql = "update stu set name=?,age=?,sex=?,address=? where id=?";
		Object[] objs = new Object[] { stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(), stu.getId() };
		update(sql, objs);
	}

	// ��ѯѧ����Ϣ
	public  void seStudent(String id) {
		String sql = "select*from stu where id=?";
		Object[] objs = new Object[] { id };
		select(sql, objs);
	}

	// ��ѯ����
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
				System.out.print("\tѧ��:\t" + rs.getString("id"));
				System.out.print("\t����:\t" + rs.getString("name"));
				System.out.print("\t����:\t" + rs.getString("age"));
				System.out.print("\t�Ա�:\t" + rs.getString("sex"));
				System.out.print("\t��ַ:\t" + rs.getString("address"));
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
