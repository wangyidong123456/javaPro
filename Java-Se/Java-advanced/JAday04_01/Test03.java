package JAday04_01;

import java.sql.DriverManager;
import org.junit.Test;
/**  
* @ClassName: ApiDemo  
* @Description: JDBC API详解--获取连接
* @date 2018年2月7日 上午11:07:55    
* Company www.igeekhome.com
*    
*/
public class Test03 {
	/**  
	* @Title: demo01  
	* @Description: 测试获取连接
	* @throws Exception    
	*/
	@Test
	public void demo01() throws Exception{
		/* 获得连接
		 * JDBC提供工具类 DriverManager(驱动管理器) 
		 * 		getConnection() 通过设置具体参数向不同的数据库创建新的连接
		 * 			参数1：url ，数据访问路径
		 * 			参数2：user ， 数据库用户名
		 * 			参数3：password ， 数据库密码
		 * 		url访问路径
		 * 			格式  jdbc:mysql://ip地址:端口号/数据库名称
		 * 			例如  jdbc:mysql://localhost:3306/mydb
		 * 
		 * 			jdbc固定
		 * 			mysql 表示mysql数据库，一般情况会根据数据库不同而不同
		 * 			localhost:3306 表示数据具体地址，为默认值，及可以省略
		 * 			mydb 表示数据名称
		 * 
		 * 			路径简化版   jdbc:mysql:///mydb
		 * 
		 * 
		 */
		
		Class.forName("com.mysql.jdbc.Driver");
		//结论：获得连接
		DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		
	}

}
