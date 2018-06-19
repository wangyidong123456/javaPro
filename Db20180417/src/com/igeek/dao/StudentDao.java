package com.igeek.dao;

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

import com.igeek.entity.Student;

public class StudentDao extends BaseDao {
	// 添加学生信息
	public int addStudent(Student stu) throws SQLException {
		String sql = "insert into stu values(?,?,?,?,?,?)";
		Object[] objs = new Object[] { stu.getId(), stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(),
				stu.getCid() };
		return update(sql, objs);
	}

	// 删除学生信息
	public int deStudent(String id) throws SQLException {
		String sql = "delete from stu where id=?";
		return update(sql, id);
	}

	// 修改学生信息
	public int upStudent(Student stu) throws SQLException {
		String sql = "update stu set name=?,age=?,sex=?,address=? where id=?";
		return update(sql, stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(), stu.getId());
	}

	// id查询学生信息
	public Student findById(String id) throws Exception {
		String sql = "select*from stu where id=?";
		return query(sql, new BeanHandler<Student>(Student.class), id);
	}

	// 用Map键值对查询学生信息
	public Map<String, Object> findMapId(String id) throws Exception {
		String sql = "select * from stu where id=?";
		return qr.query(sql, new MapHandler(), id);
	}

	// 用Array数组查询学生信息
	public Object[] findArrayId(String id) throws Exception {
		String sql = "select * from stu where id=?";
		return qr.query(sql, new ArrayHandler(), id);
	}

	// 查询所有
	public List<Student> findAll() throws Exception {
		String sql = "select*from stu";
		return query(sql, new BeanListHandler<Student>(Student.class));
	}

	// 用Map键值对查询所有
	public List<Map<String, Object>> findMapAll() throws Exception {
		String sql = "select*from stu";
		return query(sql, new MapListHandler());
	}

	// 用Array数组查询所有
	public List<Object[]> findArrayAll() throws Exception {
		String sql = "select*from stu";
		return query(sql, new ArrayListHandler());
	}

	// 查询所有
	public Map<Object, Map<String, Object>> findKeyAll() throws Exception {
		String sql = "select * from stu ";
		return query(sql, new KeyedHandler<>(1));
	}
    //根据列名查找某一列
	public List<String> findColumnL(String id) throws Exception {
		String sql = "select*from stu";
		return query(sql, new ColumnListHandler<>(id));
	}

	// 查询学生表有多少条数据
	public Long findcount() throws Exception {
		String sql = "select count(*) from stu";
		return qr.query(sql, new ScalarHandler<Long>());
	}

	// 按照班级cid 查询学生信息 题目三！！
	public List<Student> findc(String cid) {
		String sql = "select s.*,c.cname ,ss.asco from stu s left join classes c on s.cid=c.cid "
				+ "left join(select avg(score) asco,sid from scores group by sid) ss on s.id=ss.sid where c.cid =?";
		return getForList(Student.class, sql, cid);
	}
}
