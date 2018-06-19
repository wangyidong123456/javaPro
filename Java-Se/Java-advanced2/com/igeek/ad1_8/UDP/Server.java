package com.igeek.ad1_8.UDP;

import java.net.*;

public class Server {
	public static void main(String[] args) throws Exception {
		InetAddress ia= InetAddress.getByName("192.168.13.7");
		String s="发送端发送消息";
		byte buf []=s.getBytes();
		DatagramSocket ds=new DatagramSocket();
		DatagramPacket dp=new DatagramPacket(buf, buf.length,ia,9999);
		ds.send(dp);
		ds.close();
	}
}
