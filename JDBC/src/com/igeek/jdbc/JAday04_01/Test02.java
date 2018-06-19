package com.igeek.jdbc.JAday04_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;




/**  
* @ClassName: ApiDemo
* @Description: JDBC API���--ע������
* @date 2018��2��7�� ����10:59:10    
* Company www.igeekhome.com
*    
*/
public class Test02 {
	/**  
	* @Title: demo01  
	* @Description: ����ע������
	* @throws Exception    
	*/
	@Test
	public void demo01() throws Exception{
//		/* �������
//		 * 1. JDBC�淶�涨�������Ҫ�������ݿ⣬�����ṩ�����ӿڵ�ʵ����
//		 * 		�����ӿڣ�java.sql.Driver
//		 * 		ÿһ�����ݿ��ṩ����jar ��ʵ�ָýӿ�
//		 * 2. MySQL �ṩʵ���ࣺcom.mysql.jdbc.Driver
//		 * 		Դ�룺public class com.mysql.jdbc.Driver implements java.sql.Driver {
//		 * 3. JDBC�淶�ṩ�ˣ�ע��ʵ�ַ�ʽ
//		 * 		DriverManager.registerDriver( new com.mysql.jdbc.Driver() );
//		 * 		���������ѭ������䣬Java������ mysqlʵ�������(ֱ�ӹ�ϵ)��֮���л����ݿ⽫���ܽ��С�
//		 * 		ϣ���ṩ����ʱ��ֻҪ�л������������Ϳ����л�ʹ�����ݿ�
//		 * 4. ͨ��ע������ʹ�ñ�׼д��
//		 * 		Class.forName("com.mysql.jdbc.Driver")
//		 * 		1) ʹ�÷���ķ�ʽ����ָ������
//		 * 		2) ������ص������ַ���(���ȫ�޶�����)���֣����ݾͿ��Դ�ŵ������ļ��У�ͨ���޸������ļ������л����ݿ�
//		 * 		3) һ���౻���ص��ڴ棬��̬����齫ִ�У�static{ ... }
//		 * 		4) com.mysql.jdbc.Driver Դ�����
//		 * 			static{
//		 * 				java.sql.DriverManager.registerDriver(new Driver());
//		 */				
		//���ۣ�ע������
		Class.forName("com.mysql.jdbc.Driver");
		/* �������
//		 * JDBC�ṩ������ DriverManager(����������) 
//		 * 		getConnection() ͨ�����þ��������ͬ�����ݿⴴ���µ�����
//		 * 			����1��url �����ݷ���·��
//		 * 			����2��user �� ���ݿ��û���
//		 * 			����3��password �� ���ݿ�����
//		 * 		url����·��
//		 * 			��ʽ  jdbc:mysql://ip��ַ:�˿ں�/���ݿ�����
//		 * 			����  jdbc:mysql://localhost:3306/mydb
//		 * 
//		 * 			jdbc�̶�
//		 * 			mysql ��ʾmysql���ݿ⣬һ�������������ݿⲻͬ����ͬ
//		 * 			localhost:3306 ��ʾ���ݾ����ַ��ΪĬ��ֵ��������ʡ��
//		 * 			mydb ��ʾ��������
//		 * 
//		 * 			·���򻯰�   jdbc:mysql:///mydb
//		 */
		//���ۣ��������
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
//		/* ������ִ����
//		 * 	ͨ��Connection�Ϳ��Ի����Բ�ͬ���ݿ�sql����ִ�ж��󣬳���  createStatement()
//		 * 	ͨ��Statement�������ִ�������SQL���
//		 * 		st.executeUpdate(sql) ִ��DML���(��ɾ�� insert��delete��update) ������Ϊ���Σ���ʾӰ��������
//		 * 		st.executeQuery(sql) ִ��DQL���(��ѯ select) ������ResultSet���������(��ѯ��������)
//		 * 
//		 * 		st.execute(sql)  �˽⣬����ִ������sql��䡣����Ϊboolean
//		 * 			true����ʾִ��DQL��䣬��Ҫͨ��ts.getResultSet() ��ò�ѯ���
//		 * 			false����ʾDML��䣬��Ҫͨ�� ts.getUpdateCount() ���Ӱ��������
//		 */
		
		//���ۣ�������ִ����
		Statement st = conn.createStatement();
//		st.execute(null);
//		int executeUpdate = 
		System.out.println(st.executeUpdate("insert into category(cname) values ('����')"));
		ResultSet rs = st.executeQuery("select*from category");
		while(rs.next()){
			System.out.println(rs.getInt("cid")+":"+rs.getString("cname"));
		}
	}


}
