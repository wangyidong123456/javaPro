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
	// ���ѧ����Ϣ
	public int addStudent(Student stu) throws SQLException {
		String sql = "insert into stu values(?,?,?,?,?,?)";
		Object[] objs = new Object[] { stu.getId(), stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(),
				stu.getCid() };
		return update(sql, objs);
	}

	// ɾ��ѧ����Ϣ
	public int deStudent(String id) throws SQLException {
		String sql = "delete from stu where id=?";
		return update(sql, id);
	}

	// �޸�ѧ����Ϣ
	public int upStudent(Student stu) throws SQLException {
		String sql = "update stu set name=?,age=?,sex=?,address=? where id=?";
		return update(sql, stu.getName(), stu.getAge(), stu.getSex(), stu.getAddress(), stu.getId());
	}

	// id��ѯѧ����Ϣ
	public Student findById(String id) throws Exception {
		String sql = "select*from stu where id=?";
		return query(sql, new BeanHandler<Student>(Student.class), id);
	}

	// ��Map��ֵ�Բ�ѯѧ����Ϣ
	public Map<String, Object> findMapId(String id) throws Exception {
		String sql = "select * from stu where id=?";
		return qr.query(sql, new MapHandler(), id);
	}

	// ��Array�����ѯѧ����Ϣ
	public Object[] findArrayId(String id) throws Exception {
		String sql = "select * from stu where id=?";
		return qr.query(sql, new ArrayHandler(), id);
	}

	// ��ѯ����
	public List<Student> findAll() throws Exception {
		String sql = "select*from stu";
		return query(sql, new BeanListHandler<Student>(Student.class));
	}

	// ��Map��ֵ�Բ�ѯ����
	public List<Map<String, Object>> findMapAll() throws Exception {
		String sql = "select*from stu";
		return query(sql, new MapListHandler());
	}

	// ��Array�����ѯ����
	public List<Object[]> findArrayAll() throws Exception {
		String sql = "select*from stu";
		return query(sql, new ArrayListHandler());
	}

	// ��ѯ����
	public Map<Object, Map<String, Object>> findKeyAll() throws Exception {
		String sql = "select * from stu ";
		return query(sql, new KeyedHandler<>(1));
	}
    //������������ĳһ��
	public List<String> findColumnL(String id) throws Exception {
		String sql = "select*from stu";
		return query(sql, new ColumnListHandler<>(id));
	}

	// ��ѯѧ�����ж���������
	public Long findcount() throws Exception {
		String sql = "select count(*) from stu";
		return qr.query(sql, new ScalarHandler<Long>());
	}

	// ���հ༶cid ��ѯѧ����Ϣ ��Ŀ������
	public List<Student> findc(String cid) {
		String sql = "select s.*,c.cname ,ss.asco from stu s left join classes c on s.cid=c.cid "
				+ "left join(select avg(score) asco,sid from scores group by sid) ss on s.id=ss.sid where c.cid =?";
		return getForList(Student.class, sql, cid);
	}
}
