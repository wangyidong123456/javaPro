package JAday04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class Test04 {

	/**
	 * @ClassName: ApiDemo
	 * @Description: JDBC API详解--获得语句执行者
	 * @date 2018年2月7日 上午11:13:12 Company www.igeekhome.com
	 * 
	 */

	/**
	 * @Title: demo01
	 * @Description: 测试获得语句执行者
	 * @throws Exception
	 */
	@Test
	public void demo01() throws Exception {
		/*
		 * 获得语句执行者 通过Connection就可以获得针对不同数据库sql语句的执行对象，常用 createStatement()
		 * 通过Statement对象可以执行任意的SQL语句 st.executeUpdate(sql) 执行DML语句(增删改
		 * insert、delete、update) ，返回为整形，表示影响行数。 st.executeQuery(sql) 执行DQL语句(查询
		 * select) ，返回ResultSet结果集对象(查询所有数据)
		 * 
		 * st.execute(sql) 了解，可以执行任意sql语句。返回为boolean
		 * true，表示执行DQL语句，需要通过ts.getResultSet() 获得查询结果 false，表示DML语句，需要通过
		 * ts.getUpdateCount() 获得影响行数。
		 */

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		// 结论：获得语句执行者
		Statement st = conn.createStatement();
		st.execute(null);
		// int executeUpdate =
		st.executeUpdate("");
		// ResultSet executeQuery =
		st.executeQuery("");
	}

}
