package com.igeek.ad1_6.IO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**  
* @ClassName: CharsetDemo  
* @Description: �ַ���������
* @date 2017��11��23�� ����10:59:47    
* Company www.igeekhome.com
*  �����:
*  		������ַ���洢���ݵĶ�Ӧ��ϵ��ÿһ���ַ�����Ӧһ�����֡�
*  		�ַ� = �ֽ� + �����
*  ת���Ĺ��췽������:
*  		public Output StreamWriter(OutputStream out, String charsetName)
*  		public Input StreamReader(InputStream in, String charsetName)
*  Ĭ�϶���ʹ��GBK���,Ҳ�����Լ�ָ�������
*  ����:
*  		��һ��A������ַ�ת���ֽ�,����B������뽫�ֽ�ת���ַ�,��������Ӧ�Ĺ�ϵ��ͬ,�鵽�˲���ͬ�Ľ��
*  ��֤������ķ�ʽ:��������뱣����ͬ.
*  �к���,���е�����ΪUTF-8
*/
public class IOTransform {
	public static void main(String[] args) throws IOException {
		//ʹ��UTF-8�ķ�ʽ���ַ�������ļ���,�ļ�ʹ��GBK�ۿ�������,ʹ��UTF-8�ۿ�ʱ������
		
		OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream("d:/student(1).txt",true),"UTF-8");
		osw.write("���");
		osw.close();
		
		//�����UTF-8�ķ�ʽд����������(6���ֽ�),���Ǹ�д�����ļ��йۿ�ʱ������.��ʱ��ʹ��UTF-8�ķ�ʽ���Ǹ��ļ��ж���,��������ô?
		InputStreamReader isr = new InputStreamReader( new FileInputStream("d:/student(1).txt"),"UTF-8");
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		isr.close();

	}
}