package com.igeek.dao;


import java.sql.SQLException;
import java.util.List;
import com.igeek.entity.Classes;


public class ClassesDao extends BaseDao {
	// 添加班级信息
	public int addClasses(Classes cs) throws Exception {
		String sql = "insert into Classes values(?,?,?)";
		return update(sql, cs.getCid(), cs.getCname(), cs.getCdesc());
	}

	// 删除班级信息
	public int deClasses(String id) throws Exception {
		String sql = "delete from classes where id=?";
		return update(sql, id );
	}

	// 修改班级信息
	public int upClasses(Classes cs) throws SQLException {
		String sql = "update classes set cname=?,cdesc=? where cid=?";
		return update(sql,  cs.getCid(), cs.getCname(), cs.getCdesc());
	}

	// 查询班级信息
	public Classes findById(int id) {
		String sql = "select*from classes where cid=?";
		return get(Classes.class, sql, id );

	}

	// 查询所有
	public List<Classes> findAll() {
		String sql = "select*from classes";
		return getForList(Classes.class, sql);
	}

}