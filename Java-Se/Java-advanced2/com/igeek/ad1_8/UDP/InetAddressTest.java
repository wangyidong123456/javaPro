package com.igeek.ad1_8.UDP;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		InetAddress ia= InetAddress.getLocalHost();
		System.out.println(ia.getHostName());
		System.out.println(ia.getHostAddress());
		InetAddress ia1=InetAddress.getByName("192.168.13.2");
		System.out.println(ia1.getHostName());
		InetAddress ia2=InetAddress.getByName("127.0.0.2");
		System.out.println(ia2.getHostName());
	}
}
