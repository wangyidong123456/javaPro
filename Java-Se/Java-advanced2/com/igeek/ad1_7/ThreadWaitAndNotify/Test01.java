package com.igeek.ad1_7.ThreadWaitAndNotify;

public class Test01 {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Farmer f = new Farmer(fish);
		Cat c = new Cat(fish);
		Thread farmer = new Thread(f);
		Thread cat = new Thread(c);
		farmer.start();
		cat.start();

	}
}
