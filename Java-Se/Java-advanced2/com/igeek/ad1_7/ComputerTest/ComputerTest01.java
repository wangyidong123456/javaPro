package com.igeek.ad1_7.ComputerTest;

public class ComputerTest01 {

	public static void main(String[] args) {
          Notebook nb=new Notebook();
          Mouse ms=new Mouse();
          Keyboard kb=new Keyboard();
          nb.poweron();
          nb.useUSB(ms);
          nb.useUSB(kb);
          nb.shutdown();
	}
}
