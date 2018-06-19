package com.jiayuan.service;

import com.jiayuan.dao.BRRecordDao;
import com.jiayuan.dao.UserDao;
import com.jiayuan.entiy.User;

public class UserService {
	BRRecordDao brrd = new BRRecordDao();
	UserDao ud = new UserDao();

	// 注册新用户
	public int Adduser(User user) throws Exception {
		int r = ud.addUser(user);
		if (r > 0) {
			System.out.println("恭喜您注册成功");
		} else {
			System.out.println("对不起注册失败");
		}
		return r;
	}

	// 修改用户信息
	public int UpdateUser(User user) throws Exception {
		int r = ud.upUser(user);
		if (r > 0) {
			System.out.println("恭喜您修改成功");
		} else {
			System.out.println("对不起修改失败");
		}
		return r;
	}

	// 登陆用户landing
	public void Landing(String uid,String password) throws Exception {
	   User u1=ud.findById(uid);
	   if(u1.getPassword()==password){
		   System.out.println("恭喜您登陆成功！");
	   }else{
		   System.out.println("对不起，登陆失败！");
	   }
	}

	// 查询用户查阅记录ID
	public void InquireUidRecord(String uid) throws Exception {
		System.out.println(brrd.seUidRecord(uid));
	}

	// 查询用户查阅记录uname
	public void InquireUnameRecord(String uname) throws Exception {
		System.out.println(brrd.seUnameRecord(uname));
	}

	// 查询书籍查阅记录bname
	public void InquireBnameRecord(String bname) throws Exception {
		System.out.println(brrd.seUnameRecord(bname));
	}

	// 查询书籍查阅记录bid
	public void InquireBidRecord(String bid) throws Exception {
		System.out.println(brrd.seUidRecord(bid));
	}
}
