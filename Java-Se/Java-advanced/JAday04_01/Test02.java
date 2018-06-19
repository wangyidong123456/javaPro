package JAday04_01;

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
		/* �������
		 * 1. JDBC�淶�涨�������Ҫ�������ݿ⣬�����ṩ�����ӿڵ�ʵ����
		 * 		�����ӿڣ�java.sql.Driver
		 * 		ÿһ�����ݿ��ṩ����jar ��ʵ�ָýӿ�
		 * 2. MySQL �ṩʵ���ࣺcom.mysql.jdbc.Driver
		 * 		Դ�룺public class com.mysql.jdbc.Driver implements java.sql.Driver {
		 * 3. JDBC�淶�ṩ�ˣ�ע��ʵ�ַ�ʽ
		 * 		DriverManager.registerDriver( new com.mysql.jdbc.Driver() );
		 * 		���������ѭ������䣬Java������ mysqlʵ�������(ֱ�ӹ�ϵ)��֮���л����ݿ⽫���ܽ��С�
		 * 		ϣ���ṩ����ʱ��ֻҪ�л������������Ϳ����л�ʹ�����ݿ�
		 * 4. ͨ��ע������ʹ�ñ�׼д��
		 * 		Class.forName("com.mysql.jdbc.Driver")
		 * 		1) ʹ�÷���ķ�ʽ����ָ������
		 * 		2) ������ص������ַ���(���ȫ�޶�����)���֣����ݾͿ��Դ�ŵ������ļ��У�ͨ���޸������ļ������л����ݿ�
		 * 		3) һ���౻���ص��ڴ棬��̬����齫ִ�У�static{ ... }
		 * 		4) com.mysql.jdbc.Driver Դ�����
		 * 			static{
		 * 				java.sql.DriverManager.registerDriver(new Driver());
		 */				
		//���ۣ�ע������
		Class.forName("com.mysql.jdbc.Driver");
	}


}
