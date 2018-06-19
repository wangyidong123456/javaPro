package com.igeek.ad1_6.IO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**  
* @ClassName: CharsetDemo  
* @Description: 字符编码问题
* @date 2017年11月23日 上午10:59:47    
* Company www.igeekhome.com
*  编码表:
*  		编码表即字符与存储数据的对应关系表，每一个字符都对应一个数字。
*  		字符 = 字节 + 编码表
*  转换的构造方法当中:
*  		public Output StreamWriter(OutputStream out, String charsetName)
*  		public Input StreamReader(InputStream in, String charsetName)
*  默认都会使用GBK码表,也可以自己指定编码表
*  乱码:
*  		用一个A编码表将字符转成字节,又用B编码表与将字节转回字符,两个码表对应的关系不同,查到了不相同的结果
*  保证不乱码的方式:编码与解码保持相同.
*  中后期,所有的码表均为UTF-8
*/
public class IOTransform {
	public static void main(String[] args) throws IOException {
		//使用UTF-8的方式将字符输出到文件中,文件使用GBK观看会乱码,使用UTF-8观看时正常的
		
		OutputStreamWriter osw = new OutputStreamWriter( new FileOutputStream("d:/student(1).txt",true),"UTF-8");
		osw.write("你好");
		osw.close();
		
		//如果用UTF-8的方式写出两个汉字(6个字节),在那个写出的文件中观看时乱码了.这时再使用UTF-8的方式从那个文件中读回,还会乱码么?
		InputStreamReader isr = new InputStreamReader( new FileInputStream("d:/student(1).txt"),"UTF-8");
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		isr.close();

	}
}