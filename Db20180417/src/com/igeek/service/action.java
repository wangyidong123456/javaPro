package com.igeek.service;

public class action {
	public static void main(String[] args) {
		try {
			String outUser = "jack";
			String inUser = "rose";
			Double money = 100d;
			//2 转账
			AccountService accountService = new AccountService();
			accountService.transfer(outUser, inUser, money);
			//3 提示
//			System.out.println("转账成功");
		} catch (Exception e) {
			System.out.println("转账失败");
		}
	}

}
