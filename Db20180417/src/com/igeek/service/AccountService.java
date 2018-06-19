package com.igeek.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.igeek.dao.AccountDao;
import com.igeek.demo.C3p0Utils2;

public class AccountService {

	public void transfer(String outUser, String inUser, double money) throws SQLException {
		// 创建dao对象
		AccountDao accountDao = new AccountDao();
		// 调用转出转入方法
		Connection conn = C3p0Utils2.getConnection();
		try{
		conn.setAutoCommit(false);
		
		int onum=accountDao.out(conn, outUser, money);
		int inum=accountDao.in(conn, inUser, money);
		if(onum<=0||inum<=0){
			conn.rollback();
			System.out.println("转账失败");
			return;
		}
		conn.commit();
		System.out.println("转账成功");
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
			System.out.println("转账失败");
		}finally{
			conn.close();
		}
	}
}
