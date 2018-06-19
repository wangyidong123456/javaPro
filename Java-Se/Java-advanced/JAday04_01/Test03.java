package JAday04_01;

import java.sql.DriverManager;
import org.junit.Test;
/**  
* @ClassName: ApiDemo  
* @Description: JDBC API���--��ȡ����
* @date 2018��2��7�� ����11:07:55    
* Company www.igeekhome.com
*    
*/
public class Test03 {
	/**  
	* @Title: demo01  
	* @Description: ���Ի�ȡ����
	* @throws Exception    
	*/
	@Test
	public void demo01() throws Exception{
		/* �������
		 * JDBC�ṩ������ DriverManager(����������) 
		 * 		getConnection() ͨ�����þ��������ͬ�����ݿⴴ���µ�����
		 * 			����1��url �����ݷ���·��
		 * 			����2��user �� ���ݿ��û���
		 * 			����3��password �� ���ݿ�����
		 * 		url����·��
		 * 			��ʽ  jdbc:mysql://ip��ַ:�˿ں�/���ݿ�����
		 * 			����  jdbc:mysql://localhost:3306/mydb
		 * 
		 * 			jdbc�̶�
		 * 			mysql ��ʾmysql���ݿ⣬һ�������������ݿⲻͬ����ͬ
		 * 			localhost:3306 ��ʾ���ݾ����ַ��ΪĬ��ֵ��������ʡ��
		 * 			mydb ��ʾ��������
		 * 
		 * 			·���򻯰�   jdbc:mysql:///mydb
		 * 
		 * 
		 */
		
		Class.forName("com.mysql.jdbc.Driver");
		//���ۣ��������
		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
	}

}
