package com.igeek.ad1_6.IO;

import java.io.File;

public class Test01 {

	public static void main(String[] args) {
		File fl = new File("d:/KGMusic");
		File newfl = new File("e:/");
		System.out.println(fl.getAbsolutePath());
		System.out.println(fl.getName());
		File newfl0=new File(newfl,fl.getName());
		newfl0.mkdir();
		System.out.println(newfl0.getAbsolutePath());

	}

}
