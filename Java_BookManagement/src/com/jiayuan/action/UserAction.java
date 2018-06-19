package com.jiayuan.action;

import org.junit.Test;
import com.jiayuan.entiy.User;
import com.jiayuan.service.UserService;

public class UserAction {
	UserService us = new UserService();
	User user = new User("0916", "xh", "123", "f", "", "", 1, "", "1", 0);

	// 通过uid查询借阅记录
	@Test
	public void queryUid() throws Exception {
		// System.out.println(user.getId());
		us.InquireUidRecord(user.getId());
	}

}
