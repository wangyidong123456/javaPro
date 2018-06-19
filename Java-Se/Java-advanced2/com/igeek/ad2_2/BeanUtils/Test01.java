package com.igeek.ad2_2.BeanUtils;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class Test01 {
	@Test
	public void Te01(){
		User user=new User();
		user.setUid("u001");
		user.setUserName("jack");
		user.setPassword("1234");
		System.out.println(user);
	}
	@Test
	public void Te02() throws Exception{
		User user = new User();
		System.out.println("封装前：" + user);
		BeanUtils.setProperty(user, "uid", "u001");
		BeanUtils.setProperty(user, "userName", "rose");
		System.out.println("封装后："+user);
		System.out.println(BeanUtils.getProperty(user, "userName"));
	}
}
