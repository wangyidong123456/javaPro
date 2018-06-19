package com.igeek.jdbc.liststusysjdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {
	// ��ɾ��
	public int update(String sql, Object... obj) {
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = MyUtils.getconn();
			pst = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				pst.setObject(i + 1, obj[i]);
			}
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MyUtils.close(conn, pst, null);
		}
		return 0;
	}

	public <T> List<T> getListValue(String sql, Class<T> clazz, Object... obj) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<T> list=new ArrayList<T>();
		try {
			//�������
			conn = MyUtils.getconn();
			//Ԥ����ִ�����
			pst = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				//Ԥ����ע��
				pst.setObject(i + 1, obj[i]);
			}
			//��ѯ��䷵�ؽ����
			rs = pst.executeQuery();
			//Ԫ���ݶ���
			ResultSetMetaData rsm=rs.getMetaData();
			while(rs.next()){
				//�������
				T t=clazz.newInstance();
				//�ֶ�������
				for(int i=0;i<rsm.getColumnCount();i++){
					//�ֶ�����
					String temp=rsm.getColumnLabel(i+1);
					//�����ֶ�����
					Object value=rs.getObject(temp);
					Field  field=clazz.getDeclaredField(temp);
					if(field!=null){
					//ǿ�Ʒ�������
					field.setAccessible(true);
					//��t����ֵ
					field.set(t,value);
					}
				}
				list.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyUtils.close(conn, pst, rs);
		}
		
		return list;
	}

}
