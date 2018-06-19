package com.igeek.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.KeyedHandler;

import com.igeek.entity.Scores;


public class ScoresDao extends BaseDao {
	// ��Ӱ༶��Ϣ
	public int addScores(Scores ss) throws SQLException {
		String sql = "insert into Scores values(?,?,?,?)";
		return update(sql, ss.getId(), ss.getSid(), ss.getSubjects(),ss.getScore() );
	}

	// ɾ���༶��Ϣ
	public int deScores(String id) throws SQLException {
		String sql = "delete from Scores where id=?";
		return update(sql,  id );
	}

	// �޸İ༶��Ϣ
	public int upScores(Scores ss) throws SQLException {
		String sql = "update Scores set sid=?,subjects=? ,score=? where id=?";
		return update(sql, ss.getScore(), ss.getSid(), ss.getSubjects(),ss.getId());
	}

	// ��ѯ�༶��Ϣ
	public Scores findById(int id) {
		String sql = "select*from Scores where sid=?";
		return get(Scores.class, sql, id );

	}

	// ��ѯ����
	public List<Scores> findAll() {
		String sql = "select*from Scores";
		return getForList(Scores.class, sql);
	}
	public Map<Object, Map<String, Object>> findMaxScore() throws Exception {
		String sql = "select * from score order by sco asc";
		return query(sql, new KeyedHandler<>(4));
	}
}