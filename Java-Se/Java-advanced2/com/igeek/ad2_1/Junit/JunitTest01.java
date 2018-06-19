package com.igeek.ad2_1.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest01 {
	/*要求
	 * 1、导入JUnit jar包
	 * 2、import org.junit.Test;
	 * 3、方法上面加注解@Test
	 * 4、方法不能有形参
	 */
	@Test
	public void test01(){
		System.out.println("运行test01");
	}
	@Test
	public void test02(){
		System.out.println("运行test02");
	}
	@Before
	public void before(){
		System.out.println("Junit运行之前做的准备工作。比如打开资源等");
	}
	@After
	public void after(){
		System.out.println("Junit运行之后做的善后工作。比如关闭资源等");
	}
	@Test
	public void test03(){
		System.out.println("运行test03");
	}
}