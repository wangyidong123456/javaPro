package com.igeek.ad1_7.ComputerTest;

public class Mouse extends Hardware implements USB{
	// �����:
	// ��������Ϊ���
	// ����Ӳ���豸����Ҫ����USB�ӿ�
	@Override
	public void work() {
      System.out.println("����ڵ����ϵ��");
	}

	@Override
	public void poweron() {
		System.out.println("����USBͷ���ڵ����Ͽ���");
	}

	@Override
	public void shutdown() {
		System.out.println("����USBͷ���ڵ����ϳ��¹ر�");
	}

}
