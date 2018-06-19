package com.igeek.jdbc.studentsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class ClassesDao extends BaseDao {

	public Classes findbyId(int id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		Classes cla = null;
		try {
			conn = DbUtils.getConn();
			String sql = "select * from classes where cid=?";
			// Statement ����������
			st = conn.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();
			while (rs.next()) {
				cla = new Classes(rs.getInt("cid"), rs.getString("cname"), rs.getString("cdesc"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(conn, st, rs);
		}
		return cla;
	}
	//ͨ��ID ��ѯ�༶
	public Classes findClasses(int cid){
		String sql="select *from classes where cid=?";
		return get(Classes.class, sql, cid);
	}
	//ͨ��ID ��ѯ�༶
//	public Map<String,Object> findClassesMap(int cid){
//		String sql="select *from classes where cid=?";
//		return getMap( sql, cid);
//	}
	//ͨ��ID ��ѯ�༶
	public List<Map<String,Object>> findClassesMapList(){
		String sql="select *from classes ";
		return getForListMap(sql);
	}
	//��ѯ���а༶
	public List<Classes> findClassesAll(){
		String sql="select *from classes ";
		return getForList(Classes.class, sql);
	}
}
