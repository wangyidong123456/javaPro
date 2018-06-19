package com.igeek.ad1_5.File;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
//		File file = new File("../text/text1.txt");
		File file0 = new File("E:\\holle\\.metadata\\Java-Se");
		File file1 = new File(file0,"Testt102.properties");
		//E:\\holle\\.metadata\\Java-Se\\Testt102.properties
		File file2 = new File("../../");
//		File file3 = new File("../../text");
		System.out.println(file0.getAbsolutePath());
//		System.out.println(file3.getAbsolutePath());
//		System.out.println(file.getPath());
//		System.out.println(file.length());
//		System.out.println(file.getName());
      System.out.println(file1.exists()); 
        System.out.println(file2.isFile()); 
        File[] list= file2.listFiles();
        for(File fl:list){
        	System.out.println(fl.getName());
        }
	}

}
