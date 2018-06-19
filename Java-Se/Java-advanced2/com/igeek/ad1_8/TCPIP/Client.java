package com.igeek.ad1_8.TCPIP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		// 建立客户端
		Socket sc = new Socket("192.168.13.7", 9999);
		// 2、建立连接后，通过Socket中的IO流(Socket流)进行数据的传输；
        Scanner scc=new Scanner(System.in);
		while (true) {
			// 获取输入流，输入响应数据
			InputStreamReader isr = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("客户端接收到：" + str);
			// 客户端输出
			System.out.println("请输入对服务端说的话：");
			String str1 = scc.nextLine();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			pw.println(str1);
			if(str1.equals("bye")){
				scc.close();
				sc.close();
				break;
			}
		}
	}
}
