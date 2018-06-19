package com.igeek.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.KeyedHandler;

import com.igeek.entity.Scores;


public class ScoresDao extends BaseDao {
	// 添加班级信息
	public int addScores(Scores ss) throws SQLException {
		String sql = "insert into Scores values(?,?,?,?)";
		return update(sql, ss.getId(), ss.getSid(), ss.getSubjects(),ss.getScore() );
	}

	// 删除班级信息
	public int deScores(String id) throws SQLException {
		String sql = "delete from Scores where id=?";
		return update(sql,  id );
	}

	// 修改班级信息
	public int upScores(Scores ss) throws SQLException {
		String sql = "update Scores set sid=?,subjects=? ,score=? where id=?";
		return update(sql, ss.getScore(), ss.getSid(), ss.getSubjects(),ss.getId());
	}

	// 查询班级信息
	public Scores findById(int id) {
		String sql = "select*from Scores where sid=?";
		return get(Scores.class, sql, id );

	}

	// 查询所有
	public List<Scores> findAll() {
		String sql = "select*from Scores";
		return getForList(Scores.class, sql);
	}
	public Map<Object, Map<String, Object>> findMaxScore() throws Exception {
		String sql = "select * from score order by sco asc";
		return query(sql, new KeyedHandler<>(4));
	}
}