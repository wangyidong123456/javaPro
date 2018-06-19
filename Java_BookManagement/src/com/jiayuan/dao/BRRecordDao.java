package com.jiayuan.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.jiayuan.entiy.BRRecord;

public class BRRecordDao extends BaseDao {
	// 添加借书记录
	public int abrecord(BRRecord brr) throws SQLException {
		String sql = "insert into brrecord values(?,?,?,?,?,?,?,?)";
		return update(sql, brr.getId(), brr.getUid(), brr.getUname(), brr.getBid(), brr.getBname(), brr.getBorrowdate(),
				brr.getBackdate_should(), brr.getBackdate_reality());
	}

	// 添加还书记录
	public int arrecord(int id, Date back_reality) throws SQLException {
		String sql = "update brrecord set  backdate_reality=? where id=?";
		return update(sql, back_reality, id);

	}
	//查询bid未还书的记录
	public BRRecord seBidBorrowing(String bid) throws Exception {
		String sql = "select*from brrecord where bid=? and backdate_reality is null";
		return query(sql, new BeanHandler<BRRecord>(BRRecord.class), bid);
	}
	// 用Map键值对查询用户Uid的 借阅记录
	public List<Map<String, Object>> seUidRecord(String uid) throws Exception {
		String sql = "select*from brrecord where uid=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), uid);
		return list;
	}

	// 用Map键值对查询书籍Uname的 借阅记录
	public List<Map<String, Object>> seUnameRecord(String uname) throws Exception {
		String sql = "select*from brrecord where uname=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), uname);
		return list;
	}

	// 用Map键值对查询书籍Bid的 借阅记录
	public List<Map<String, Object>> seBidRecord(String bid) throws Exception {
		String sql = "select*from brrecord where bid=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), bid);
		return list;
	}

	// 用Map键值对查询用户Bname的 借阅记录
	public List<Map<String, Object>> seBnameRecord(String bname) throws Exception {
		String sql = "select*from brrecord where bname=?";
		List<Map<String, Object>> list = query(sql, new MapListHandler(), bname);
		return list;
	}
}
