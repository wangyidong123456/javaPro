package com.igeek.ad1_7.ComputerTest;

public class Keyboard extends Hardware implements USB{

	@Override
	public void work() {
      System.out.println("�ڼ����ϰ�����������������Ϣ");
	}

	@Override
	public void poweron() {
		System.out.println("���̵�USBͷ���ڵ����Ͽ���");
	}

	@Override
	public void shutdown() {
		System.out.println("���̵�USBͷ���ڵ����ϳ��¹ر�");
	}

}
