package com.igeek.ad1_7.Thread;

public class ImplementsRunnable {
	public static void main(String[] args) {
		Cat1 cat = new Cat1();
		Thread t1 = new Thread(cat, "线程1");
		Thread t2 = new Thread(cat, "线程2");
		Thread t3 = new Thread(cat, "线程3");
		t1.start();
		t2.start();
		t3.start();
	}
}

class Cat1 implements Runnable {
	static int total = 100;

	public synchronized void run() {
		while (true) {
//			synchronized (this) {
				if (total > 0) {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "在吃鱼还剩" + total + "条");
					total--;
				} else {
					return;
				}

//			}
		}
	}

}