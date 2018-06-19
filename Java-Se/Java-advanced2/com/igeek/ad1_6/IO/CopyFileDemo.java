package com.igeek.ad1_6.IO;

import java.io.*;
import org.junit.Test;

/**
 * @ClassName: CopyFileDemo
 * @Description: 文件复制不使用字节数组
 * @date 2017年11月23日 上午8:58:46 Company www.igeekhome.com
 *
 *       分析： 1. 利用字节输入流关联ASCII码表完整版.doc文件 2. 利用字节输出流关联ASCII码表完整版(副本).doc文件 3.
 *       循环从ASCII码表完整版.doc读一个字节, 然后将这个字节写入到ASCII码表完整版(副本).doc,
 *       直到读到ASCII码表完整版.doc的末尾 即先读后写
 */
public class CopyFileDemo {
	@Test
	public void Te01() throws Exception {
		// 使用一次一个字节的方式完成复制
		// 创建IO流对象绑定IO资源
		FileInputStream fis = new FileInputStream("d:/javabase-day01.docx");
		FileOutputStream fos = new FileOutputStream("d:/javabase-day01(1).docx");
		// 读取数据,读一个字节,写一个字节
		// 先读
		// 定义变量c,用于存储每次读取到的字节
		int c = -1;
		while ((c = fis.read()) != -1) {
			// 后写
			fos.write(c);
			// System.out.println(c);
		}
		// 关闭流
		fos.close();
		fis.close();

	}

	@Test
	public void Te02() throws Exception {
		// 使用一次一个字节数组的方式完成复制
		// 创建IO流对象绑定IO资源
		FileInputStream fis = new FileInputStream("d:/PPT/1.jpg");
		FileOutputStream fos = new FileOutputStream("d:/1.jpg");
		// 读取数据,读一个字节数组,写一个字节数组
		// 定义字节数组,用于存储每次读取到的数据
		byte[] bytes = new byte[1024];
		// 定义变量,用于记录每次读取到数据的长度
		int len = -1;
		// 先读
		while ((len = fis.read(bytes)) != -1) {
			// 后写
			fos.write(bytes, 0, len);
		}
		// 关闭流
		fos.close();
		fis.close();
	}
	
	@Test
	public void Te03() throws Exception {
		//通过普通流对象创建高效流对象，这个过程加入了缓冲区
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/javabase-day01.docx"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/javabase-day01(3).docx"));
		byte[] bytes = new byte[1024];
		// 定义变量,用于记录每次读取到数据的长度
		int len = -1;
		// 先读
		while ((len = bis.read(bytes)) != -1) {
			// 后写
			bos.write(bytes, 0, len);
		}
		bis.close();
		bos.close();
	}
	@Test
	public void Te04 () throws Exception{
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("d:/student.txt"));
		//创建输出缓冲流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:/student(1).txt"));
		//读写数据
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//释放资源
		bw.close();
		br.close();
	}
}