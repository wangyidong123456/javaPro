package com.igeek.ad2_1.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTest01 {
	/*Ҫ��
	 * 1������JUnit jar��
	 * 2��import org.junit.Test;
	 * 3�����������ע��@Test
	 * 4�������������β�
	 */
	@Test
	public void test01(){
		System.out.println("����test01");
	}
	@Test
	public void test02(){
		System.out.println("����test02");
	}
	@Before
	public void before(){
		System.out.println("Junit����֮ǰ����׼���������������Դ��");
	}
	@After
	public void after(){
		System.out.println("Junit����֮�������ƺ���������ر���Դ��");
	}
	@Test
	public void test03(){
		System.out.println("����test03");
	}
}