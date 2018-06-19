package com.igeek.ad1_8.TCPIP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception {
		// 建立服务器
		ServerSocket ssc = new ServerSocket(9999);
		// 由于是服务器端，则需要添加一步操作：通过Socket服务获取Socket，再获取其中的IO流
		Socket sc = ssc.accept();
		// 3、建立连接后，通过Socket中的IO流(Socket流)进行数据的传输；输入流
		Scanner scc=new Scanner(System.in);
		while (true) {
			// 获取输出流，输出响应数据
			System.out.println("请输入对客户端说的话：");
			String str1 = scc.nextLine();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			pw.println(str1);
			// 接收客户端发来的消息
			InputStreamReader isr = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println("服务器接收到:" + s);
			if(s.equals("bye")){
				scc.close();
				ssc.close();
			}
		}
	}
}
