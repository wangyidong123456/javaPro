package com.igeek.ad1_5.File;

import java.io.File;

import org.junit.Test;

public class Test01 {
	@Test
	//
	// * File: 文件可以持久化地存储数据
	// * File的一个对象就代表一个文件或文件夹(自己简单地定义,方便记忆的说法)
	// * 文档上说明File类代表文件或文件夹路径,但是我们可以通过路径找到对应的文件或文件夹.
	// * 可以认为File类就代表文件或文件夹(通过路径找到)
	// * 构造方法:public File(String pathname) 通过路径找到对应的文件或文件夹

	// * 绝对路径:从盘符开始到文件的全路径
	// * 相对路径:从某个参照路径开始到指定文件所经过的路径
	// * 在Eclipse中,所有的文件如果想使用相对路径,则其参照路径均为项目根目录
	// *
	// 如test.txt相对于javaadvanced1_d05_c04项目根目录经过了a/b/test.txt,则a/b/test.txt就是该文件的相对路径
	// * 在java当中对于路径的分隔符可以使用/或者\\,是通用的
	public void Te01() {
		// 查找文件
		File file = new File("D:\\other\\test.txt");
		
		File file1 = new File("Testt102.properties");
		System.out.println(file1.getAbsolutePath());
		
		// 查找文件夹
//		File dir = new File("D:\\other");
//		File file1 = new File("D:\\javaadvanced1_workspace\\javaadvanced1_d05_c04\\a\\b\\test.txt");
		// 通过相对路径在Eclipse中的某个项目当中创建一个文件对象
		// "a/b/test.txt"
		File file2 = new File("a\\b\\test.txt");
		// 获取文件大小,判断文件是否为test.txt
		System.out.println(file.length());
		System.out.println(file2.length());
	}
	// * File类的方法:
	// * 构造方法:
	// * 1:直接给于路径(绝对路径,相对路径)
	// * 2:路径分为父亲(该文件或文件夹所在的文件夹)与孩子(该文件或文件夹自己的名字)

	// * File类常见方法
	// * 1:获取文件/文件夹信息方法
	// * public String getAbsolutePath() 获取绝对路径
	// * public String getPath() 获取路径(用什么方式创建的对象,就返回什么方式的路径(绝对路径/相对路径))
	// * public String getName() 获取文件/文件夹的名称
	// * public String getParent() 返回所在文件夹路径(根据创建对象时是否为绝对路径/相对路径)
	
	//*  2:可以创建/删除该文件(Java删除时，不会使用windows的回收站)
	//*  public boolean delete()  删除文件
	//*  public boolean createNewFile() throws IOException  创建文件
	//*  		在创建文件时,如果文件所在的文件夹不存在,则报错系统找不到指定的路径.创建文件时,必须确保文件夹已经存在
	//*  public boolean mkdir()  使用mkdir方法创建文件夹时,必须保证其所在文件夹已经存在,否则创建失败(不会报错)
	//*  public boolean mkdirs() 一次性创建多级目录
	//*  public boolean delete()  删除文件夹不能为非空(有东西),否则删除失败
	
	//* 3:判断该File对象是否存在或者判断该File对象代表一个文件还是代表一个文件夹
	//* public boolean exists()  文件或者文件夹是否存在
	//* public boolean isDirectory()  判断文件对象是否为文件夹
	//* public boolean isFile()  判断文件对象是否为文件
	
	//* public File[] listFiles()  获取调用方法文件夹下的所有file对象(文件或文件夹)
}
