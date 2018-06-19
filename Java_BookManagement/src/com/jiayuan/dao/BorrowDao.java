package com.jiayuan.dao;

import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;
import com.jiayuan.demo.C3p0Utils;
/**
 * 借书
 * @author student
 *
 */
public class BorrowDao {
	//添加(修改)书籍借书记录
	public void abbr(String bid) throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update books set state='已借' where  bid=?  ";
		qr.update(sql,bid);	
		}
	
    //添加 (修改)用户借书记录
	public void aubr(String id) throws SQLException{
		QueryRunner qr = new QueryRunner(C3p0Utils.getDataSource());
		String sql = "update user set borrownumber=borrownumber+1 where id=?";	
		qr.update(sql, id);	
		}
}
