package com.igeek.jdbc.JAday04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;




/**  
* @ClassName: ApiDemo
* @Description: JDBC API详解--注解驱动
* @date 2018年2月7日 上午10:59:10    
* Company www.igeekhome.com
*    
*/
public class Test02 {
	/**  
	* @Title: demo01  
	* @Description: 测试注解驱动
	* @throws Exception    
	*/
	@Test
	public void demo01() throws Exception{
//		/* 获得驱动
//		 * 1. JDBC规范规定，如果需要连接数据库，必须提供驱动接口的实现类
//		 * 		驱动接口：java.sql.Driver
//		 * 		每一个数据库提供驱动jar 都实现该接口
//		 * 2. MySQL 提供实现类：com.mysql.jdbc.Driver
//		 * 		源码：public class com.mysql.jdbc.Driver implements java.sql.Driver {
//		 * 3. JDBC规范提供了，注册实现方式
//		 * 		DriverManager.registerDriver( new com.mysql.jdbc.Driver() );
//		 * 		但，如果遵循上面语句，Java代码与 mysql实现类耦合(直接关系)，之后切换数据库将不能进行。
//		 * 		希望提供方案时，只要切换数据驱动，就可以切换使用数据库
//		 * 4. 通常注册驱动使用标准写法
//		 * 		Class.forName("com.mysql.jdbc.Driver")
//		 * 		1) 使用反射的方式加载指定的类
//		 * 		2) 具体加载的类以字符串(类的全限定名称)体现，内容就可以存放到配置文件中，通过修改配置文件方便切换数据库
//		 * 		3) 一个类被加载到内存，静态代码块将执行，static{ ... }
//		 * 		4) com.mysql.jdbc.Driver 源码分析
//		 * 			static{
//		 * 				java.sql.DriverManager.registerDriver(new Driver());
//		 */				
		//结论：注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		/* 获得连接
//		 * JDBC提供工具类 DriverManager(驱动管理器) 
//		 * 		getConnection() 通过设置具体参数向不同的数据库创建新的连接
//		 * 			参数1：url ，数据访问路径
//		 * 			参数2：user ， 数据库用户名
//		 * 			参数3：password ， 数据库密码
//		 * 		url访问路径
//		 * 			格式  jdbc:mysql://ip地址:端口号/数据库名称
//		 * 			例如  jdbc:mysql://localhost:3306/mydb
//		 * 
//		 * 			jdbc固定
//		 * 			mysql 表示mysql数据库，一般情况会根据数据库不同而不同
//		 * 			localhost:3306 表示数据具体地址，为默认值，及可以省略
//		 * 			mydb 表示数据名称
//		 * 
//		 * 			路径简化版   jdbc:mysql:///mydb
//		 */
		//结论：获得连接
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
//		/* 获得语句执行者
//		 * 	通过Connection就可以获得针对不同数据库sql语句的执行对象，常用  createStatement()
//		 * 	通过Statement对象可以执行任意的SQL语句
//		 * 		st.executeUpdate(sql) 执行DML语句(增删改 insert、delete、update) ，返回为整形，表示影响行数。
//		 * 		st.executeQuery(sql) 执行DQL语句(查询 select) ，返回ResultSet结果集对象(查询所有数据)
//		 * 
//		 * 		st.execute(sql)  了解，可以执行任意sql语句。返回为boolean
//		 * 			true，表示执行DQL语句，需要通过ts.getResultSet() 获得查询结果
//		 * 			false，表示DML语句，需要通过 ts.getUpdateCount() 获得影响行数。
//		 */
		
		//结论：获得语句执行者
		Statement st = conn.createStatement();
//		st.execute(null);
//		int executeUpdate = 
		System.out.println(st.executeUpdate("insert into category(cname) values ('椅子')"));
		ResultSet rs = st.executeQuery("select*from category");
		while(rs.next()){
			System.out.println(rs.getInt("cid")+":"+rs.getString("cname"));
		}
	}


}
