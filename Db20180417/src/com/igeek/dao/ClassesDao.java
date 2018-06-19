package com.igeek.dao;


import java.sql.SQLException;
import java.util.List;
import com.igeek.entity.Classes;


public class ClassesDao extends BaseDao {
	// ��Ӱ༶��Ϣ
	public int addClasses(Classes cs) throws Exception {
		String sql = "insert into Classes values(?,?,?)";
		return update(sql, cs.getCid(), cs.getCname(), cs.getCdesc());
	}

	// ɾ���༶��Ϣ
	public int deClasses(String id) throws Exception {
		String sql = "delete from classes where id=?";
		return update(sql, id );
	}

	// �޸İ༶��Ϣ
	public int upClasses(Classes cs) throws SQLException {
		String sql = "update classes set cname=?,cdesc=? where cid=?";
		return update(sql,  cs.getCid(), cs.getCname(), cs.getCdesc());
	}

	// ��ѯ�༶��Ϣ
	public Classes findById(int id) {
		String sql = "select*from classes where cid=?";
		return get(Classes.class, sql, id );

	}

	// ��ѯ����
	public List<Classes> findAll() {
		String sql = "select*from classes";
		return getForList(Classes.class, sql);
	}

}