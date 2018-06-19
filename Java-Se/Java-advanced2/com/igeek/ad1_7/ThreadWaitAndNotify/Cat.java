package com.igeek.ad1_7.ThreadWaitAndNotify;

public class Cat implements Runnable {
	Fish fish;

	Cat(Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (fish) {
				while (fish.isFlag() == false) {
					try {
						fish.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Сè��һ��" + fish.getName() + " ��ɫΪ" + fish.getColor());
				fish.setFlag(false);
				fish.notify();
			}

		}
	}

}
