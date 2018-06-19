package com.igeek.ad1_7.Thread;

public class Ticket implements Runnable {

	// 在成员变量位置将票定义为数字100
	/**
	 * @Fields number :票数
	 */
	private static int number = 100;

	// 在成员位置定义锁对象
	// private Object lock = new Object();

	// 定义一个标志位，让不同的线程执行不同的代码块
	private int x = 0;

	/**
	 * @Title: run
	 * @Description: 完成卖票的线程逻辑
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// 车站不停地在卖票
		while (true) {
			// T
			if (x % 2 == 0) {
				// 将一个完整动作使用synchronized同步代码块包裹
				synchronized (Ticket.class) {
					// R
					// 线程暂停20毫秒
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// 有票就买票
					if (number > 0) {
						String threadName = Thread.currentThread().getName();
						System.out.println(threadName + "正在销售第" + (number) + "张票");

						number--;
					}
				}
			} else {
				// J
				// 调用sell方法
				sell();
			}

			if (number <= 0) {
				// 没有票，就跳出循环，不再卖票
				break;
			}

			x++;
		}
	}

	/**
	 * @Title: sell
	 * @Description: 定义卖票的同步方法
	 */
	public static synchronized void sell() {
		// 线程暂停20毫秒
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 有票就买票
		if (number > 0) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + "正在销售第" + (number) + "张票");

			number--;
		}
	}
}