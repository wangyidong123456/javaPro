package com.igeek.ad1_8.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author ���� ����ʦ
 * @date ����ʱ�䣺2018��5��29�� ����9:56:13
 * @version 1.0
 */
public class UDPClick {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(9999);
		// ����һ�����ݰ�
		while (true) {
			byte b[] = new byte[1024];
			DatagramPacket dp = new DatagramPacket(b, b.length);
			ds.receive(dp);// һֱ������ִ��
			// ���յ����ݺ󣬿��Եõ����Ͷ˵�Ip��Ϣ
			InetAddress as = dp.getAddress();
			String ip = as.getHostAddress();
			String s = new String(dp.getData());
			System.out.println("��" + ip + "�õ�:" + s);
			ds.close();
		}
	}

}
