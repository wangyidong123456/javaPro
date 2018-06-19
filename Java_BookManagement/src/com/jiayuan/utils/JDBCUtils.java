package com.jiayuan.utils;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

/**
 * @ClassName: JDBCUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2018年1月30日 下午4:21:30 Company www.igeekhome.com
 * 
 */
	// 连接池
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	// 给当前线程绑定 连接
	private static ThreadLocal<Connection> local = new ThreadLocal<Connection>();

	/**
	 * 获得连接
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			// #1从当前线程中， 获得已经绑定的连接
			Connection conn = local.get();
			if (conn == null) {
				// #2 第一次获得，绑定内容 – 从连接池获得
				conn = dataSource.getConnection();
				// #3 将连接存 ThreadLocal
				local.set(conn);
			}
			return conn; // 获得连接
		} catch (Exception e) {
			// 将编译时异常 转换 运行时 ， 以后开发中 运行时异常使用比较多的。
			// * 此处可以编写自定义异常。
			throw new RuntimeException(e);
			// * 类与类之间 进行数据交换时，可以使用return返回值。也可以自定义异常返回值，调用者try{} catch(e){
			// e.getMessage() 获得需要的数据}
			// throw new MyConnectionException(e);
		}
	}


}
