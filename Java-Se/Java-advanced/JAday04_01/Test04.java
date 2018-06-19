package JAday04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class Test04 {

	/**
	 * @ClassName: ApiDemo
	 * @Description: JDBC API���--������ִ����
	 * @date 2018��2��7�� ����11:13:12 Company www.igeekhome.com
	 * 
	 */

	/**
	 * @Title: demo01
	 * @Description: ���Ի�����ִ����
	 * @throws Exception
	 */
	@Test
	public void demo01() throws Exception {
		/*
		 * ������ִ���� ͨ��Connection�Ϳ��Ի����Բ�ͬ���ݿ�sql����ִ�ж��󣬳��� createStatement()
		 * ͨ��Statement�������ִ�������SQL��� st.executeUpdate(sql) ִ��DML���(��ɾ��
		 * insert��delete��update) ������Ϊ���Σ���ʾӰ�������� st.executeQuery(sql) ִ��DQL���(��ѯ
		 * select) ������ResultSet���������(��ѯ��������)
		 * 
		 * st.execute(sql) �˽⣬����ִ������sql��䡣����Ϊboolean
		 * true����ʾִ��DQL��䣬��Ҫͨ��ts.getResultSet() ��ò�ѯ��� false����ʾDML��䣬��Ҫͨ��
		 * ts.getUpdateCount() ���Ӱ��������
		 */

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		// ���ۣ�������ִ����
		Statement st = conn.createStatement();
		st.execute(null);
		// int executeUpdate =
		st.executeUpdate("");
		// ResultSet executeQuery =
		st.executeQuery("");
	}

}
