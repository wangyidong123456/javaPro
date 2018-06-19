package com.igeek.jdbc.studentsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao extends BaseDao {
	// ���ѧ��
	public int addStudent(Student stu) {
		String sql = "insert into stu values(?,?,?,?,?)";
		Object[] obj = { stu.getId(), stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress() };
		return update(sql, obj);
	}

	// ɾ��ѧ��
	public int deleteStudent(String id) {
		String sql = "delete from stu where id=?";
		return update(sql, id);
	}

	// �޸�ѧ��
	public int upStudent(Student stu) {
		String sql = "update stu set sname=?,age=?,sex=?,address=? where id=?";
		return update(sql, stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(), stu.getId());
	}

	// ��ѧ�Ų�ѯѧ��
	public Student seStudent(String id) {
		String sql = "select * from stu where id=?";
		return selectStudent(sql, id);
	}

	// ��ѯ����ѧ���ü��ϴ�����
	public List<Student> seAllStudents() {
		String sql = "select * from stu";
		return selectAllStudent(sql);
	}

	// ��ѧ�Ų�ѯѧ��
	public Student findbyId(String id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Student stu = null;
		try {
			conn = DbUtils.getConn();
			String sql = "select * from stu where id=?";
			// Statement ����������
			st = conn.prepareStatement(sql);
			st.setString(1, id);
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
}
