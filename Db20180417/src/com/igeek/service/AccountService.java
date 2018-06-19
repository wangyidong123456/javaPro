package com.igeek.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.igeek.dao.AccountDao;
import com.igeek.demo.C3p0Utils2;

public class AccountService {

	public void transfer(String outUser, String inUser, double money) throws SQLException {
		// ����dao����
		AccountDao accountDao = new AccountDao();
		// ����ת��ת�뷽��
		Connection conn = C3p0Utils2.getConnection();
		try{
		conn.setAutoCommit(false);
		
		int onum=accountDao.out(conn, outUser, money);
		int inum=accountDao.in(conn, inUser, money);
		if(onum<=0||inum<=0){
			conn.rollback();
			System.out.println("ת��ʧ��");
			return;
		}
		conn.commit();
		System.out.println("ת�˳ɹ�");
		}catch(Exception e){
			e.printStackTrace();
			conn.rollback();
			System.out.println("ת��ʧ��");
		}finally{
			conn.close();
		}
	}
}
