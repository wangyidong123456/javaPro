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
	// 增删改
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
			//获得连接
			conn = MyUtils.getconn();
			//预处理执行语句
			pst = conn.prepareStatement(sql);
			for (int i = 0; i < obj.length; i++) {
				//预处理注入
				pst.setObject(i + 1, obj[i]);
			}
			//查询语句返回结果集
			rs = pst.executeQuery();
			//元数据对象
			ResultSetMetaData rsm=rs.getMetaData();
			while(rs.next()){
				//反射对象
				T t=clazz.newInstance();
				//字段列数量
				for(int i=0;i<rsm.getColumnCount();i++){
					//字段名称
					String temp=rsm.getColumnLabel(i+1);
					//该行字段内容
					Object value=rs.getObject(temp);
					Field  field=clazz.getDeclaredField(temp);
					if(field!=null){
					//强制访问设置
					field.setAccessible(true);
					//给t对象赋值
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
