package com.igeek.service;

import org.junit.Test;
import com.igeek.dao.ClassesDao;

public class ClassesService extends ClassesDao{
	   @Test
       public void testSeStudent(){
//		   Classes css =new Classes(0,"����","cc");
    	   ClassesDao cd=new ClassesDao();
    	   System.out.println(cd.findById(1));
//    	   System.out.println(cd.findAll());
       }
	   
}
