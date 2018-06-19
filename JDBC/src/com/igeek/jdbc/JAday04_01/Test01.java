package com.igeek.jdbc.JAday04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

/**  
* @ClassName: JdbcDemo  
* @Description: JDBC���Ű���
* @date 2018��2��7�� ����10:25:36    
* Company www.igeekhome.com
*    
*/
public class Test01 {
	
	/**  
	* @Title: demo01  
	* @Description: �˽�JDBC��������
	* @throws Exception    
	*/
	@Test
	public void demo01() throws Exception{
		// ��ѯ���еķ�����Ϣ
		// ע�⣺ʹ��JDBC�淶�����ö��� java.sql���µ�����
		
		//1 ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//2 �������
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		//3������ִ����
		Statement st = conn.createStatement();
		
		//4ִ��SQL���
		ResultSet rs = st.executeQuery("select * from category");
		
		//5��������
		while(rs.next()){
//			// ���һ������
			Integer cid = rs.getInt("cid");
			String cname = rs.getString("cname");
//			
			System.out.println(cid + " �� " +cname );
		}
		//6�ͷ���Դ
		rs.close();
		st.close();
		conn.close();
	}

	}
//
//public class Driver extends NonRegisteringDriver implements java.sql.Driver{
//	static{
//		try {
//			java.sql.DriverManager.registerDriver(new Driver());
//		} catch (SQLException E) {
//			throw new RuntimeException("Can't register driver!");
//		}
//	}
//	....
// }

