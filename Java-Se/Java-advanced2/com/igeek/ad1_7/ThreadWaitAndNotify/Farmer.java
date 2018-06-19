package com.igeek.ad1_7.ThreadWaitAndNotify;

public class Farmer implements Runnable {
	Fish fish;

	Farmer(Fish fish) {
		this.fish = fish;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (fish) {
				while (fish.isFlag() == true) {
					try {
						fish.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
//				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int a = (int) (Math.random() * 100);
				if (a % 2 == 0) {
					fish.setName("����");
					fish.setColor("��ɫ");
				} else {
					fish.setName("����");
					fish.setColor("��ɫ");
				}
				System.out.println("ũ��������һ��" + fish.getName() + " ��ɫΪ" + fish.getColor());
				fish.setFlag(true);
				fish.notify();
			}
		}
	}

}
