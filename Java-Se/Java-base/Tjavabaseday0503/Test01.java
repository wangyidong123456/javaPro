package Tjavabaseday0503;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d:\\a.txt", true);
		/*
		 * 创建输出流对象做了哪些事情: A:调用系统资源创建了一个文件 B:创建输出流对象 C:把输出流对象指向文件
		 */
		// 调用输出流对象的写数据的方法
		// 写一个字符串数据
		fw.write("IO流你好");
		// 数据没有直接写到文件，其实是写到了内存缓冲区
		fw.flush();
		fw.write("helloworld");
		fw.flush();
		fw.write("java");
		fw.flush();

		// void write(String str):写一个字符串数据
		fw.write("abcde");

		// void write(String str,int index,int len):写一个字符串中的一部分数据
		fw.write("abcde", 0, 5);
		fw.write("abcde", 1, 3);

		// void write(int
		// ch):写一个字符数据,这里写int类型的好处是既可以写char类型的数据，也可以写char对应的int类型的值。'a',97
		fw.write('a');
		fw.write(97);

		// void write(char[] chs):写一个字符数组数据
		char[] chs = { 'a', 'b', 'c', 'd', 'e' };
		fw.write(chs);

		// void write(char[] chs,int index,int len):写一个字符数组的一部分数据
		fw.write(chs, 0, 5);
		fw.write(chs, 1, 4);
		fw.flush();
		for (int x = 0; x < 10; x++) {
			fw.write("hello" + x);
			fw.write("\r\n");
		}

		// 释放资源
		// 通知系统释放和该文件相关的资源
		fw.close();
		// while(true) {}

	}

}
