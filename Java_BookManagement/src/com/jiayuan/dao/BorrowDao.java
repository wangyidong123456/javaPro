package com.jiayuan.dao;

import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import com.jiayuan.demo.C3p0Utils;
/**
 * ����
 * @author student
 *
 */
public class BorrowDao {
	//���(�޸�)�鼮�����¼
	public void abbr(String bid) throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update books set state='�ѽ�' where  bid=?  ";
		qr.update(sql,bid);	
		}
	
    //��� (�޸�)�û������¼
	public void aubr(String id) throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update user set borrownumber=borrownumber+1 where id=?";	
		qr.update(sql, id);	
		}
}
