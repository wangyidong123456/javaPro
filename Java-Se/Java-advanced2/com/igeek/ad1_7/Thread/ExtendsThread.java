package com.igeek.ad1_7.Thread;

public class ExtendsThread {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("小黑");
		Dog d2 = new Dog();
		d2.setName("小白");
		Dog d3 = new Dog();
		d3.setName("小黄");
		d1.start();
		d2.start();
		d3.start();
	}
}

class Dog extends Thread {
	static int total = 100;
	public void run() {
		while (true) {
			if (total > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.getName() + "在吃骨头还剩" + total + "根");
				total--;
			} else {
				return;
			}

		}
	}
}