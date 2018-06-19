package com.jiayuan.utils;

import java.io.*;

public class Copy {
	// 写一个复制文件夹的程序
	public static void main(String[] args) throws Exception {
		Copy cd = new Copy();
		// 被复制的文件夹地址
		File fl = new File("d:/KGMusic");
		// 将要复制到的新地址
		File newfl = new File("e:/");
		cd.copydcy(fl, newfl);
	}

	// 打印所有文件地址
	public void copydcy(File fl, File newfl) throws Exception {
		newfl = new File(newfl, fl.getName());
		if (fl.isFile()) {
			copyFile(fl, newfl);
		} else {
			// new fl=e:/KGMusic
			// 递归第二层时, fl=tempfl
			// 获得新文件夹路径
			// 创建文件夹
			newfl.mkdirs();
			// 获取所有文件
			File[] farr = fl.listFiles();
			for (File tempfl : farr) {
				System.out.println(tempfl.getAbsolutePath());
				// 判断是文件则复制
				if (tempfl.isFile()) {
					File newtfl = new File(newfl, tempfl.getName());// 具体文件D:/KGMusic/KuGou.exe
					copyFile(tempfl, newtfl);
				} else {
					// 判断是文件夹则递归
					copydcy(tempfl, newfl);
				}
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
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
