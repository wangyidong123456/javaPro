package com.igeek.service;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import com.igeek.dao.StudentDao;

public class StudentService {
	@Test
	public void testSeStudent() throws Exception {
		StudentDao sd = new StudentDao();
		System.out.println(sd.deStudent("1001"));
		System.out.println(sd.findById("1001"));
		System.out.println(sd.findMapId("1001"));
		System.out.println(Arrays.toString(sd.findArrayId("1001")));
		System.out.println(sd.findAll());
		System.out.println(sd.findMapAll());
		List<Object[]> list = sd.findArrayAll();
		for (Object[] arr : list) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(sd.findKeyAll());
		System.out.println(sd.findcount());
		System.out.println(sd.findColumnL("address"));

	}

	// public void testSeStudent1(){
	// BaseDao bd=new BaseDao();
	// String sql = "select s.*,c.cname ,ss.asco from stu s left join classes c
	// on s.cid=c.cid "
	// + "left join(select avg(score) asco,sid from scores group by sid) ss on
	// s.id=ss.sid where c.cid =?";
	// System.out.println("map:"+bd.getForMapList(sql, 1));
	//
	// }

}