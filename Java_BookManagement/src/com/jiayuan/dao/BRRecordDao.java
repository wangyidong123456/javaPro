package com.jiayuan.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.jiayuan.entiy.BRRecord;

public class BRRecordDao extends BaseDao {
	// ��ӽ����¼
	public int abrecord(BRRecord brr) throws SQLException {
		String sql = "insert into brrecord values(?,?,?,?,?,?,?,?)";
		return update(sql, brr.getId(), brr.getUid(), brr.getUname(), brr.getBid(), brr.getBname(), brr.getBorrowdate(),
				brr.getBackdate_should(), brr.getBackdate_reality());
	}

	// ��ӻ����¼
	public int arrecord(int id, Date back_reality) throws SQLException {
		String sql = "update brrecord set  backdate_reality=? where id=?";
		return update(sql, back_reality, id);

	}
	//��ѯbidδ����ļ�¼
	public BRRecord seBidBorrowing(String bid) throws Exception {
		String sql = "select*from brrecord where bid=? and backdate_reality is null";
		return query(sql, new BeanHandler<BRRecord>(BRRecord.class), bid);
	}
	// ��Map��ֵ�Բ�ѯ�û�Uid�� ���ļ�¼
	public List<Map<String, Object>> seUidRecord(String uid) throws Exception {
		String sql = "select*from brrecord where uid=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), uid);
		return list;
	}

	// ��Map��ֵ�Բ�ѯ�鼮Uname�� ���ļ�¼
	public List<Map<String, Object>> seUnameRecord(String uname) throws Exception {
		String sql = "select*from brrecord where uname=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), uname);
		return list;
	}

	// ��Map��ֵ�Բ�ѯ�鼮Bid�� ���ļ�¼
	public List<Map<String, Object>> seBidRecord(String bid) throws Exception {
		String sql = "select*from brrecord where bid=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), bid);
		return list;
	}

	// ��Map��ֵ�Բ�ѯ�û�Bname�� ���ļ�¼
	public List<Map<String, Object>> seBnameRecord(String bname) throws Exception {
		String sql = "select*from brrecord where bname=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), bname);
		return list;
	}
}
