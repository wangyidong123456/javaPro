package com.igeek.jdbc.liststusysjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao extends BaseDao {

	// addStudent添加学生
	public int addStudent(Student stu) {
		String sql = "insert into stu values(?,?,?,?)";
		Object[] obj = {stu.getId(), stu.getSname(),stu.getAge(),stu.getScores()};
		return update(sql, obj);
	}

	// deleteById 删除学生
	public int deleteById(String id) {
		String sql = "delete from stu where id=?";
		return update(sql, id);
	}

	// upStudent 给学生评分
	public int upStudent(String id, String scores) {
		String sql = "update stu set scores=? where id=?";
		return update(sql, scores, id);
	}

	// findById 查找学生
	public Student findById(String id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Student stu = null;
		try {
			String sql = "select * from stu where id=?";
			conn = MyUtils.getconn();
			st = conn.prepareStatement(sql);
			st.setString(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				stu = new Student(rs.getString("id"), rs.getString("sname"), rs.getString("age"),
						rs.getString("scores"));
			}
			return stu;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyUtils.close(conn, st, rs);
		}
		return stu;
	}

	// findAll 查找学生
	public List<Student> findAll(int ...start) {
		List<Student> stus = new ArrayList<Student>();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Student stu = null;
		try {
			conn = MyUtils.getconn();
			if(start.length==0){
				String sql = "select * from stu order by id";
				st = conn.prepareStatement(sql);
			}else{
				String sql1="select *from stu order by id limit ?,3 ";
				st=conn.prepareStatement(sql1);
				st.setInt(1, (start[0]-1)*3);
			}
			rs = st.executeQuery();
			while (rs.next()) {
				stu = new Student(rs.getString("id"), rs.getString("sname"), rs.getString("age"),
						rs.getString("scores"));
				stus.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyUtils.close(conn, st, rs);
		}
		return stus;
	}

}
