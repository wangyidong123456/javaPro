package com.igeek.ad1_7.Thread;
public class TicketDemo {
	public static void main(String[] args) throws InterruptedException {
		//������Ʊ���߳�ִ��Ŀ�����
		Ticket ticket = new Ticket();
		
		//ʹ�ø���Ʊ�߳�ִ��Ŀ����󴴽�����߳�
		Thread thread = new Thread(ticket,"Jack");
		Thread thread2 = new Thread(ticket,"Rose");
		Thread thread3 = new Thread(ticket,"Trum");
		
		//��������߳�
		thread.start();
		thread2.start();
		thread3.start();

	}
}