package Tjavabaseday0503;

import java.io.FileReader;
import java.io.IOException;

public class reader01 {

	public static void main(String[] args) throws IOException {
		//��������������
		//FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("d:\\a.txt");
		
		//��������������Ķ����ݷ���
				
		
		char[] chs=new char[5];
		//��һ�ζ�ȡ
		int len=fr.read(chs);
		System.out.println(len);
		System.out.println(fr.read(chs));
		System.out.println(new String(chs, 0, len));
		/*
		//�ڶ��ζ�ȡ
		len=fr.read(chs);
		System.out.println(len);
		//System.out.println(chs);
		System.out.println(new String(chs, 0, len));
		
		//�����ζ�ȡ
		len=fr.read(chs);
		System.out.println(len);
		//System.out.println(chs);
		System.out.println(new String(chs, 0, len));
		
		//���Ƿ��ֶ�ȡ����ķ�ʽ���ƶȺܸߣ�����ѭ���Ľ������ǲ�֪��ʲôʱ������ѭ��
		len=fr.read(chs);
		System.out.println(len);
		len=fr.read(chs);
		System.out.println(len);
		//ͨ�����ԣ�����֪�������ʵ�ʶ�ȡ������-1��ʱ��˵��û��������
		 
		*/
		
//		char[] chs=new char[5];
//		int len;
//		//A:fr.read(chs)
//		//B:len=fr.read(chs)
//		//C:len!=-1
//		while((len=fr.read(chs))!=-1){
//			//System.out.println(new String(chs,0,len));
//			System.out.print(new String(chs,0,len));
//		}
//		
		//�ͷ���Դ
		fr.close();

	}

}
