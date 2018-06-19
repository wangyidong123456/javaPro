package com.igeek.ad1_6.IO;

import java.io.*;

public class CopyDirectory {
	// 写一个复制文件夹的程序
	public static void main(String[] args) throws Exception {
		CopyDirectory cd = new CopyDirectory();
		// 被复制的文件夹地址
		File fl = new File("d:/KGMusic");
		// 将要复制到的新地址
		File newfl = new File("e:/");
		cd.copydcy(fl, newfl);
	}

	// 打印所有文件地址
	public void copydcy(File fl, File newfl) throws Exception {
		// new fl=e:/KGMusic
		// 递归第二层时, fl=tempfl
		// tempfl.getName
		newfl = new File(newfl, fl.getName());
		//创建文件夹
		newfl.mkdirs();
		//获取所有文件
		File[] farr = fl.listFiles();
		for (File tempfl : farr) {
			System.out.println(tempfl.getAbsolutePath());
			if (tempfl.isFile()) {
				File tfl = new File(tempfl.getAbsolutePath());// 具体文件
				File newtfl = new File(newfl, tempfl.getName());// 具体文件D:/KGMusic/KuGou.exe
				copyFile(tfl, newtfl);
			} else {
				//判断是文件夹则递归
				copydcy(tempfl, newfl);
			}
		}
	}

	// 复制文件
	public void copyFile(File fl, File newfl) throws Exception {
		BufferedInputStream br = new BufferedInputStream(new FileInputStream(fl));
		BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(newfl));
		byte b[] = new byte[1024];
		int len;
		while ((len = br.read(b)) != -1) {
			bw.write(b, 0, len);
		}
		br.close();
		bw.close();
	}

}
