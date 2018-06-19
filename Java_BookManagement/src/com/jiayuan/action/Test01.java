package com.jiayuan.action;


import com.jiayuan.entiy.User;
import com.jiayuan.service.UserService;

public class Test01 {
	public static void main(String[] args) throws Exception {
//		Books books=new Books("1001","javase",1,"xiaoli","Î´½è");
		User user =new User("0916","xh","123","f","","",1,"","1",0);
		UserService us=new UserService();

		 System.out.println(user.getId());
		us.InquireUidRecord(user.getId());
	  	
	}
  
}
