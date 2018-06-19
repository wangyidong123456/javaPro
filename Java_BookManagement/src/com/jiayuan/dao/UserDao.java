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
	// 添加用户信息
	public int addUser(User user) throws SQLException {
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		return update(sql, user.getId(), user.getName(), user.getPassword(), user.getSex(), user.getDepartment(),
				user.getMajor(), user.getAge(), user.getAddress(), user.getPhonenumber(), user.getBorrownumber());
	}

	// 删除用户信息
	public int deUser(String id) throws SQLException {
		String sql = "delete from user where id=?";
//		Object[] objs = new Object[] { id };
		return update(sql, id);
	}

	// 修改用户信息
	public int upUser(User user) throws SQLException {
		String sql = "update user set name=?,password=?,sex=?,department=?,major=?,age=?,address=?,phonenumber=?,borrownumber=? where id=?";
		return update(sql, user.getName(), user.getPassword(), user.getSex(), user.getDepartment(), user.getMajor(),
				user.getAge(), user.getAddress(), user.getPhonenumber(), user.getBorrownumber(), user.getId());

	}

	// id查询用户信息
	public User findById(String id) throws Exception {
		String sql = "select*from user where id=?";
//		User user = 
		return query(sql, new BeanHandler<User>(User.class), id);
	}

	// 用Map键值对查询学生信息
	public Map<String, Object> findMapId(String id) throws Exception {
		String sql = "select * from user where id=?";
		return qr.query(sql, new MapHandler(), id);
	}

	// 用Array数组查询学生信息
	public Object[] findArrayId(String id) throws Exception {
		String sql = "select * from user where id=?";
		return qr.query(sql, new ArrayHandler(), id);
	}

	// 查询所有
	public List<User> findAll() throws Exception {
		String sql = "select*from user";
		List<User> list = query(sql, new BeanListHandler<User>(User.class));
		return list;
	}

	// 用Map键值对查询所有
	public List<Map<String, Object>> findMapAll() throws Exception {
		String sql = "select*from user";
		List<Map<String, Object>> list = query(sql, new MapListHandler());
		return list;
	}

	// 用Array数组查询所有
	public List<Object[]> findArrayAll() throws Exception {
		String sql = "select*from user";
		List<Object[]> list = query(sql, new ArrayListHandler());
		return list;
	}

	// 查询所有
	public Map<Object, Map<String, Object>> findKeyAll() throws Exception {
		String sql = "select * from user ";
		return query(sql, new KeyedHandler<>(1));
	}

	// 根据列名查找某一列
	public List<String> findColumnL(String id) throws Exception {
		String sql = "select*from user";
		List<String> list = query(sql, new ColumnListHandler<>(id));
		return list;
	}

	// 查询学生表有多少条数据
	public Long findcount() throws Exception {
		String sql = "select count(*) from user";
		return qr.query(sql, new ScalarHandler<Long>());
	}

}
