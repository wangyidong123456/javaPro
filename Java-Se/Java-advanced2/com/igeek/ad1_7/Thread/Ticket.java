package com.igeek.ad1_7.Thread;

public class Ticket implements Runnable {

	// �ڳ�Ա����λ�ý�Ʊ����Ϊ����100
	/**
	 * @Fields number :Ʊ��
	 */
	private static int number = 100;

	// �ڳ�Աλ�ö���������
	// private Object lock = new Object();

	// ����һ����־λ���ò�ͬ���߳�ִ�в�ͬ�Ĵ����
	private int x = 0;

	/**
	 * @Title: run
	 * @Description: �����Ʊ���߳��߼�
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// ��վ��ͣ������Ʊ
		while (true) {
			// T
			if (x % 2 == 0) {
				// ��һ����������ʹ��synchronizedͬ����������
				synchronized (Ticket.class) {
					// R
					// �߳���ͣ20����
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// ��Ʊ����Ʊ
					if (number > 0) {
						String threadName = Thread.currentThread().getName();
						System.out.println(threadName + "�������۵�" + (number) + "��Ʊ");

						number--;
					}
				}
			} else {
				// J
				// ����sell����
				sell();
			}

			if (number <= 0) {
				// û��Ʊ��������ѭ����������Ʊ
				break;
			}

			x++;
		}
	}

	/**
	 * @Title: sell
	 * @Description: ������Ʊ��ͬ������
	 */
	public static synchronized void sell() {
		// �߳���ͣ20����
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ��Ʊ����Ʊ
		if (number > 0) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "�������۵�" + (number) + "��Ʊ");

			number--;
		}
	}
}