package com.igeek.ad1_8.TCPIP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		// �����ͻ���
		Socket sc = new Socket("192.168.13.7", 9999);
		// 2���������Ӻ�ͨ��Socket�е�IO��(Socket��)�������ݵĴ��䣻
        Scanner scc=new Scanner(System.in);
		while (true) {
			// ��ȡ��������������Ӧ����
			InputStreamReader isr = new InputStreamReader(sc.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println("�ͻ��˽��յ���" + str);
			// �ͻ������
			System.out.println("������Է����˵�Ļ���");
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
