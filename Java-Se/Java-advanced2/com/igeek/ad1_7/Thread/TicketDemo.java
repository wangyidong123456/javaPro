package com.igeek.ad1_7.Thread;
public class TicketDemo {
	public static void main(String[] args) throws InterruptedException {
		//创建卖票的线程执行目标对象
		Ticket ticket = new Ticket();
		
		//使用该卖票线程执行目标对象创建多个线程
		Thread thread = new Thread(ticket,"Jack");
		Thread thread2 = new Thread(ticket,"Rose");
		Thread thread3 = new Thread(ticket,"Trum");
		
		//开启多个线程
		thread.start();
		thread2.start();
		thread3.start();

	}
}