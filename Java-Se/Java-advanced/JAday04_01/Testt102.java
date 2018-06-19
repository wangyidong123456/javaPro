package JAday04_01;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
    
public class Testt102 {
	public static void main(String[] args) throws Exception {
		System.out.println(getConn3());
	}
	//获取数据库链接
	public static Connection getConn3() throws Exception {
		Properties prop=new Properties();
		prop.load(new FileInputStream("Testt102.properties"));
//		prop.load(Testt102.class.getResourceAsStream("E:\\holle\\.metadata\\Java-Se\\config\\Testt102.properties"));
		String driver =prop.getProperty("driver");
		String url =prop.getProperty("url");
		String user =prop.getProperty("user");
		String password =prop.getProperty("password");
		// 1 加载驱动
		Class.forName(driver);
		// 2 获得连接
		Connection conn = DriverManager.getConnection(url,user,password);	
		return conn;
		
	}
}
