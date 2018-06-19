package com.igeek.jdbc.JAday04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

/**  
* @ClassName: JdbcDemo  
* @Description: JDBC入门案例
* @date 2018年2月7日 上午10:25:36    
* Company www.igeekhome.com
*    
*/
public class Test01 {
	
	/**  
	* @Title: demo01  
	* @Description: 了解JDBC开发步骤
	* @throws Exception    
	*/
	@Test
	public void demo01() throws Exception{
		// 查询所有的分类信息
		// 注意：使用JDBC规范，采用都是 java.sql包下的内容
		
		//1 注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2 获得连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
		//3获得语句执行者
		Statement st = conn.createStatement();
		
		//4执行SQL语句
		ResultSet rs = st.executeQuery("select * from category");
		
		//5处理结果集
		while(rs.next()){
//			// 获得一行数据
			Integer cid = rs.getInt("cid");
			String cname = rs.getString("cname");
//			
			System.out.println(cid + " ： " +cname );
		}
		//6释放资源
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

