package com.jiayuan.service;

import com.jiayuan.dao.BRRecordDao;
import com.jiayuan.dao.UserDao;
import com.jiayuan.entiy.User;

public class UserService {
	BRRecordDao brrd = new BRRecordDao();
	UserDao ud = new UserDao();

	// ע�����û�
	public int Adduser(User user) throws Exception {
		int r = ud.addUser(user);
		if (r > 0) {
			System.out.println("��ϲ��ע��ɹ�");
		} else {
			System.out.println("�Բ���ע��ʧ��");
		}
		return r;
	}

	// �޸��û���Ϣ
	public int UpdateUser(User user) throws Exception {
		int r = ud.upUser(user);
		if (r > 0) {
			System.out.println("��ϲ���޸ĳɹ�");
		} else {
			System.out.println("�Բ����޸�ʧ��");
		}
		return r;
	}

	// ��½�û�landing
	public void Landing(String uid,String password) throws Exception {
	   User u1=ud.findById(uid);
	   if(u1.getPassword()==password){
		   System.out.println("��ϲ����½�ɹ���");
	   }else{
		   System.out.println("�Բ��𣬵�½ʧ�ܣ�");
	   }
	}

	// ��ѯ�û����ļ�¼ID
	public void InquireUidRecord(String uid) throws Exception {
		System.out.println(brrd.seUidRecord(uid));
	}

	// ��ѯ�û����ļ�¼uname
	public void InquireUnameRecord(String uname) throws Exception {
		System.out.println(brrd.seUnameRecord(uname));
	}

	// ��ѯ�鼮���ļ�¼bname
	public void InquireBnameRecord(String bname) throws Exception {
		System.out.println(brrd.seUnameRecord(bname));
	}

	// ��ѯ�鼮���ļ�¼bid
	public void InquireBidRecord(String bid) throws Exception {
		System.out.println(brrd.seUidRecord(bid));
	}
}
