package com.igeek.ad1_5.Recursion;

import java.io.File;

public class Test03 {

	public static void main(String[] args) {
        //��ӡһ���ļ��������е��ļ��к��ļ�·��
		Test03 ts=new Test03();
		File fl=new File("e:/holle");
		ts.method(fl);
	}
	
	public  void method(File fl){
		File[] farr=fl.listFiles();
		for(File tempfl:farr){
			System.out.println(tempfl.getAbsolutePath());
			if(tempfl.isDirectory()){
				method(tempfl);
			}
		}
	}

}
