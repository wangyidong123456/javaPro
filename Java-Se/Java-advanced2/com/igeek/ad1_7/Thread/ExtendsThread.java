package com.igeek.ad1_7.Thread;

public class ExtendsThread {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("С��");
		Dog d2 = new Dog();
		d2.setName("С��");
		Dog d3 = new Dog();
		d3.setName("С��");
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
				System.out.println(this.getName() + "�ڳԹ�ͷ��ʣ" + total + "��");
				total--;
			} else {
				return;
			}

		}
	}
}