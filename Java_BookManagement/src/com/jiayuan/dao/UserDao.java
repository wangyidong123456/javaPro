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
import com.jiayuan.entiy.User;

public class UserDao extends BaseDao {
	// ����û���Ϣ
	public int addUser(User user) throws SQLException {
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		return update(sql, user.getId(), user.getName(), user.getPassword(), user.getSex(), user.getDepartment(),
				user.getMajor(), user.getAge(), user.getAddress(), user.getPhonenumber(), user.getBorrownumber());
	}

	// ɾ���û���Ϣ
	public int deUser(String id) throws SQLException {
		String sql = "delete from user where id=?";
//		Object[] objs = new Object[] { id };
		return update(sql, id);
	}

	// �޸��û���Ϣ
	public int upUser(User user) throws SQLException {
		String sql = "update user set name=?,password=?,sex=?,department=?,major=?,age=?,address=?,phonenumber=?,borrownumber=? where id=?";
		return update(sql, user.getName(), user.getPassword(), user.getSex(), user.getDepartment(), user.getMajor(),
				user.getAge(), user.getAddress(), user.getPhonenumber(), user.getBorrownumber(), user.getId());

	}

	// id��ѯ�û���Ϣ
	public User findById(String id) throws Exception {
		String sql = "select*from user where id=?";
//		User user = 
		return query(sql, new BeanHandler<User>(User.class), id);
	}

	// ��Map��ֵ�Բ�ѯѧ����Ϣ
	public Map<String, Object> findMapId(String id) throws Exception {
		String sql = "select * from user where id=?";
		return qr.query(sql, new MapHandler(), id);
	}

	// ��Array�����ѯѧ����Ϣ
	public Object[] findArrayId(String id) throws Exception {
		String sql = "select * from user where id=?";
		return qr.query(sql, new ArrayHandler(), id);
	}

	// ��ѯ����
	public List<User> findAll() throws Exception {
		String sql = "select*from user";
		List<User> list = query(sql, new BeanListHandler<User>(User.class));
		return list;
	}

	// ��Map��ֵ�Բ�ѯ����
	public List<Map<String, Object>> findMapAll() throws Exception {
		String sql = "select*from user";
		List<Map<String, Object>> list = query(sql, new MapListHandler());
		return list;
	}

	// ��Array�����ѯ����
	public List<Object[]> findArrayAll() throws Exception {
		String sql = "select*from user";
		List<Object[]> list = query(sql, new ArrayListHandler());
		return list;
	}

	// ��ѯ����
	public Map<Object, Map<String, Object>> findKeyAll() throws Exception {
		String sql = "select * from user ";
		return query(sql, new KeyedHandler<>(1));
	}

	// ������������ĳһ��
	public List<String> findColumnL(String id) throws Exception {
		String sql = "select*from user";
		List<String> list = query(sql, new ColumnListHandler<>(id));
		return list;
	}

	// ��ѯѧ�����ж���������
	public Long findcount() throws Exception {
		String sql = "select count(*) from user";
		return qr.query(sql, new ScalarHandler<Long>());
	}

}
