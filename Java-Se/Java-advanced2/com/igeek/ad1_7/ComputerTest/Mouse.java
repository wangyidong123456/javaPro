package com.igeek.ad1_7.ComputerTest;

public class Mouse extends Hardware implements USB{
	// 鼠标类:
	// 工作方法为点击
	// 属于硬件设备，但要符合USB接口
	@Override
	public void work() {
      System.out.println("鼠标在电脑上点击");
	}

	@Override
	public void poweron() {
		System.out.println("鼠标的USB头插在电脑上开启");
	}

	@Override
	public void shutdown() {
		System.out.println("鼠标的USB头从在电脑上抽下关闭");
	}

}
