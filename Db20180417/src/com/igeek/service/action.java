package com.igeek.service;

public class action {
	public static void main(String[] args) {
		try {
			String outUser = "jack";
			String inUser = "rose";
			Double money = 100d;
			//2 ת��
			AccountService accountService = new AccountService();
			accountService.transfer(outUser, inUser, money);
			//3 ��ʾ
//			System.out.println("ת�˳ɹ�");
		} catch (Exception e) {
			System.out.println("ת��ʧ��");
		}
	}

}
