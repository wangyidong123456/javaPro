package com.igeek.ad1_7.ComputerTest;

public class Notebook  {
	// 定义使用USB设备的功能，
	//要求：既能使用鼠标也能使用键盘，使用 USB功能内部调用开启和关闭功能
	
	//开启功能
	public void poweron(){
		System.out.println("开启电脑");
		//电脑在工作
  		Screen sc=new Screen();
  		sc.work();
	}
	//使用USB功能
	public void useUSB(USB usb) {
		usb.poweron();
		usb.work();
		usb.shutdown();
	}
	// 关闭功能
	public void shutdown(){
		System.out.println("关闭电脑");
	}
}
