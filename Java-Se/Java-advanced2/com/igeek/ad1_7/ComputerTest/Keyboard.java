package com.igeek.ad1_7.ComputerTest;

public class Keyboard extends Hardware implements USB{

	@Override
	public void work() {
      System.out.println("在键盘上按按键给电脑输入信息");
	}

	@Override
	public void poweron() {
		System.out.println("键盘的USB头插在电脑上开启");
	}

	@Override
	public void shutdown() {
		System.out.println("键盘的USB头从在电脑上抽下关闭");
	}

}
