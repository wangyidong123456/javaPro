package com.jiayuan.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.jiayuan.entiy.Books;

public class BooksDao extends BaseDao {
	// ����鼮
	public int addBooks(Books books) throws SQLException {
		String sql = "insert into books values(?,?,?,?,?)";
		return update(sql, books.getBid(), books.getName(), books.getCid(), books.getAuthor(), books.getState());
	}

	// ɾ���鼮
	public int deBooks(String bid) throws SQLException {
		String sql = "delete from books where bid=?";
		return update(sql, bid);
	}

	// �޸��鼮
	public int upBooks(Books books) throws SQLException {
		String sql = "update books set name=?,cid=?,author=?,state=? where bid=?";
		return update(sql, books.getName(), books.getCid(), books.getAuthor(), books.getState(), books.getBid());

	}

	// bid��ѯ�鼮
	public Books findBybid(String bid) throws Exception {
		String sql = "select*from books where bid=?";
		return query(sql, new BeanHandler<Books>(Books.class), bid);
	}

	// name��ѯ�鼮
	public Books findByname(String name) throws Exception {
		String sql = "select*from books where name=?";
		return query(sql, new BeanHandler<Books>(Books.class), name);
	}

	// cid��ѯ�鼮
	public Books findBycid(String cid) throws Exception {
		String sql = "select*from books where cid=?";
		return query(sql, new BeanHandler<Books>(Books.class), cid);
	}

	// author��ѯ�鼮
	public Books findByauthor(String author) throws Exception {
		String sql = "select*from books where author=?";
		return query(sql, new BeanHandler<Books>(Books.class), author);
	}

	// state��ѯ�鼮
	public Books findBystate(String state) throws Exception {
		String sql = "select*from books where state=?";
		return query(sql, new BeanHandler<Books>(Books.class), state);
	}

	// ��Map��ֵ�Բ�ѯ�鼮
	public Map<String, Object> findMapbid(String bid) throws Exception {
		String sql = "select * from books where bid=?";
		return qr.query(sql, new MapHandler(), bid);
	}

	// ��Array�����ѯ�鼮
	public Object[] findArraybid(String bid) throws Exception {
		String sql = "select * from books where bid=?";
		return qr.query(sql, new ArrayHandler(), bid);
	}

	// ��ѯ����
	public List<Books> findAll() throws Exception {
		String sql = "select*from books";
		return query(sql, new BeanListHandler<Books>(Books.class));
	}

	// ��Map��ֵ�Բ�ѯ����
	public List<Map<String, Object>> findMapAll() throws Exception {
		String sql = "select*from books";
		return query(sql, new MapListHandler());
	}

	// ��Array�����ѯ����
	public List<Object[]> findArrayAll() throws Exception {
		String sql = "select*from books";
		return query(sql, new ArrayListHandler());
	}

	// ��ѯ����
	public Map<Object, Map<String, Object>> findKeyAll() throws Exception {
		String sql = "select * from books ";
		return query(sql, new KeyedHandler<>(1));
	}

	// ������������ĳһ��
	public List<String> findColumnL(String bid) throws Exception {
		String sql = "select*from books";
		return query(sql, new ColumnListHandler<>(bid));
	}

	// ��ѯ�ж���������
	public Long findcount() throws Exception {
		String sql = "select count(*) from books";
		return qr.query(sql, new ScalarHandler<Long>());
	}

}
