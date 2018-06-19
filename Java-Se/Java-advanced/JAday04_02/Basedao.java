package JAday04_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Basedao {
	public  int update(String sql, Object[] objs) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = dbUtils.getConn();
			st = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				st.setObject(i + 1, objs[i]);
			}
			return st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbUtils.close(conn, st, null);
		}
		return 0;
	}
      public  void select(String sql,Object[] objs){ 	
    	Connection conn = null;
  		PreparedStatement st = null;
  		ResultSet rs=null;
  		try {
  			conn = dbUtils.getConn();
  			st = conn.prepareStatement(sql);
  			for (int i = 0; i < objs.length; i++) {
				st.setObject(i + 1, objs[i]);
			}
  			rs = st.executeQuery();
  			if(rs.next()){
  				System.out.println("学生的ID为"+rs.getString("id"));
  				System.out.println("学生的名字为"+rs.getString("name"));
  				System.out.println("学生的年龄为"+rs.getString("age"));
  				System.out.println("学生的性别为"+rs.getString("sex"));
  				System.out.println("学生的地址为"+rs.getString("address"));			
  			}else{
  				System.out.println("查询不到学生信息！");
  			}
  		} catch (Exception e) {
  			e.printStackTrace();
  		} finally {
  			dbUtils.close(conn, st, rs);
  		}
	}
}
