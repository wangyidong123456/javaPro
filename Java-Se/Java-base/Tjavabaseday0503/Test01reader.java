package Tjavabaseday0503;

import java.io.FileReader;
import java.io.IOException;

public class Test01reader {

	public static void main(String[] args) throws IOException {
		//创建输入流对象
				//FileReader fr = new FileReader("fr.txt");
				FileReader fr = new FileReader("d:\\a.txt");			
				//调用输入流对象的读数据方法
//				int ch=fr. read();//:一次读取一个字符		
//				System.out.println(ch);
//				System.out.println((char)ch);
//				int ch1=fr. read();//:一次读取一个字符		
//				System.out.println(ch1);
//				System.out.println((char)ch1);
//				int ch2=fr. read();//:一次读取一个字符		
//				System.out.println(ch2);
//				System.out.println((char)ch2);
				/*
				//第一次读数据
				int ch = fr.read();
				System.out.println(ch);
				System.out.println((char)ch);			
				//第二次读数据
				ch = fr.read();
				System.out.println(ch);
				System.out.println((char)ch);			
				//第三次读数据
				ch = fr.read();
				System.out.println(ch);
				System.out.println((char)ch);
				//这是时候，我们发现代码的重复度很高，想用循环改进，但是不知道循环的结束条件是什么
				ch = fr.read();
				System.out.println(ch);	
				ch = fr.read();
				System.out.println(ch);
				//通过测试，我们知道，如果读取数据的返回值是-1的时候，就说明没有数据了，这也是我们循环的结束条件
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
				
				//释放资源
				fr.close();

	}

}
