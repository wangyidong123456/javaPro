package com.igeek.ad1_6.IO;

import java.io.*;

public class Serialize {
	public static void main(String[] args) {
		// 准备被序列化的对象
		Serialize sl = new Serialize();
		Person p = new Person("Jack", 18);
		File fl = new File("d:/person.txt");
		sl.objectSerialize(fl, p);
		sl.objectDeserialize(fl);
		System.out.println("aa");
	}

	// 对象序列化
	public void objectSerialize(File fl, Object... obj) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fl));
			// 序列化对象
			oos.writeObject(obj);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 对象反序列化
	public void objectDeserialize(File fl) {
		ObjectInputStream ois = null;
		boolean b=true;
		try {
			ois = new ObjectInputStream(new FileInputStream(fl));
			while(b){
			Object obj=ois.readObject();
			System.out.println(obj);
			}
		} catch (Exception e) {
			b=false;
//			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
