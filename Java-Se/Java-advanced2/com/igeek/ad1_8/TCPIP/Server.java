package com.igeek.ad1_8.TCPIP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception {
		// ����������
		ServerSocket ssc = new ServerSocket(9999);
		// �����Ƿ������ˣ�����Ҫ���һ��������ͨ��Socket�����ȡSocket���ٻ�ȡ���е�IO��
		Socket sc = ssc.accept();
		// 3���������Ӻ�ͨ��Socket�е�IO��(Socket��)�������ݵĴ��䣻������
		Scanner scc=new Scanner(System.in);
		while (true) {
			// ��ȡ������������Ӧ����
			System.out.println("������Կͻ���˵�Ļ���");
			String str1 = scc.nextLine();
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
			pw.println(str1);
			// ���տͻ��˷�������Ϣ
			InputStreamReader isr = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println("���������յ�:" + s);
			if(s.equals("bye")){
				scc.close();
				ssc.close();
			}
		}
	}
}
