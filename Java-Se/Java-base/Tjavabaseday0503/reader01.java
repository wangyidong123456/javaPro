package Tjavabaseday0503;

import java.io.FileReader;
import java.io.IOException;

public class reader01 {

	public static void main(String[] args) throws IOException {
		//创建输入流对象
		//FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("d:\\a.txt");
		
		//调用输入流对象的读数据方法
				
		
		char[] chs=new char[5];
		//第一次读取
		int len=fr.read(chs);
		System.out.println(len);
		System.out.println(fr.read(chs));
		System.out.println(new String(chs, 0, len));
		/*
		//第二次读取
		len=fr.read(chs);
		System.out.println(len);
		//System.out.println(chs);
		System.out.println(new String(chs, 0, len));
		
		//第三次读取
		len=fr.read(chs);
		System.out.println(len);
		//System.out.println(chs);
		System.out.println(new String(chs, 0, len));
		
		//我们发现读取代码的方式相似度很高，想用循环改进，但是不知道什么时候会结束循环
		len=fr.read(chs);
		System.out.println(len);
		len=fr.read(chs);
		System.out.println(len);
		//通过测试，我们知道，如果实际读取长度是-1的时候，说明没有数据了
		 
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
		//释放资源
		fr.close();

	}

}
