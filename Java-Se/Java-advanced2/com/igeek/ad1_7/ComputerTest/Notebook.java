package com.igeek.ad1_7.ComputerTest;

public class Notebook  {
	// ����ʹ��USB�豸�Ĺ��ܣ�
	//Ҫ�󣺼���ʹ�����Ҳ��ʹ�ü��̣�ʹ�� USB�����ڲ����ÿ����͹رչ���
	
	//��������
	public void poweron(){
		System.out.println("��������");
		//�����ڹ���
  		Screen sc=new Screen();
  		sc.work();
	}
	//ʹ��USB����
	public void useUSB(USB usb) {
		usb.poweron();
		usb.work();
		usb.shutdown();
	}
	// �رչ���
	public void shutdown(){
		System.out.println("�رյ���");
	}
}
