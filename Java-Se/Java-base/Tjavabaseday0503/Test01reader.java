package Tjavabaseday0503;

import java.io.FileReader;
import java.io.IOException;

public class Test01reader {

	public static void main(String[] args) throws IOException {
		//��������������
				//FileReader fr = new FileReader("fr.txt");
				FileReader fr = new FileReader("d:\\a.txt");			
				//��������������Ķ����ݷ���
//				int ch=fr. read();//:һ�ζ�ȡһ���ַ�		
//				System.out.println(ch);
//				System.out.println((char)ch);
//				int ch1=fr. read();//:һ�ζ�ȡһ���ַ�		
//				System.out.println(ch1);
//				System.out.println((char)ch1);
//				int ch2=fr. read();//:һ�ζ�ȡһ���ַ�		
//				System.out.println(ch2);
//				System.out.println((char)ch2);
				/*
				//��һ�ζ�����
				int ch = fr.read();
				System.out.println(ch);
				System.out.println((char)ch);			
				//�ڶ��ζ�����
				ch = fr.read();
				System.out.println(ch);
				System.out.println((char)ch);			
				//�����ζ�����
				ch = fr.read();
				System.out.println(ch);
				System.out.println((char)ch);
				//����ʱ�����Ƿ��ִ�����ظ��Ⱥܸߣ�����ѭ���Ľ������ǲ�֪��ѭ���Ľ���������ʲô
				ch = fr.read();
				System.out.println(ch);	
				ch = fr.read();
				System.out.println(ch);
				//ͨ�����ԣ�����֪���������ȡ���ݵķ���ֵ��-1��ʱ�򣬾�˵��û�������ˣ���Ҳ������ѭ���Ľ�������
				*/	
				int ch;
				//1:fr.read()
				//2:ch=fr.read()
				//3:ch != -1
				while((ch=fr.read())!=-1) {
					//System.out.println(ch);
					//System.out.println((char)ch);
					System.out.print((char)ch);
				}
				
				//�ͷ���Դ
				fr.close();

	}

}
