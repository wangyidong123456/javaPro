package com.jiayuan.utils;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

/**
 * @ClassName: JDBCUtils
 * @Description: TODO(������һ�仰��������������)
 * @date 2018��1��30�� ����4:21:30 Company www.igeekhome.com
 * 
 */
	// ���ӳ�
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	// ����ǰ�̰߳� ����
	private static ThreadLocal<Connection> local = new ThreadLocal<Connection>();

	/**
	 * �������
	 * 
	 * @return
	 */
	public static Connection getConnection() {
		try {
			// #1�ӵ�ǰ�߳��У� ����Ѿ��󶨵�����
			Connection conn = local.get();
			if (conn == null) {
				// #2 ��һ�λ�ã������� �C �����ӳػ��
				conn = dataSource.getConnection();
				// #3 �����Ӵ� ThreadLocal
				local.set(conn);
			}
			return conn; // �������
		} catch (Exception e) {
			// ������ʱ�쳣 ת�� ����ʱ �� �Ժ󿪷��� ����ʱ�쳣ʹ�ñȽ϶�ġ�
			// * �˴����Ա�д�Զ����쳣��
			throw new RuntimeException(e);
			// * ������֮�� �������ݽ���ʱ������ʹ��return����ֵ��Ҳ�����Զ����쳣����ֵ��������try{} catch(e){
			// e.getMessage() �����Ҫ������}
			// throw new MyConnectionException(e);
		}
	}


}
