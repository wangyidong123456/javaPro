package Tjavabaseday04;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//
//import org.junit.Test;
//
//public class Test01 {
//
//	@Test
//	public void test00() throws Exception {
//		Class clazz = Class.forName("Tjavabaseday04.student");
//		// ���������ȡ˽�г�Ա
//		Field f = clazz.getDeclaredField("studentId");
//		System.out.println(f);
//		// ��������ʵ��
//		Object obj = clazz.newInstance();
//		System.out.println(obj);
//		// ��ʵ����ֵ
//		f.setAccessible(true);
//		f.set(obj, "�ܺ�");
//		System.out.println(obj);
//
//	}
//	
//	@Test
//	public void test01() throws Exception {
//		Class clazz = Class.forName("Tjavabaseday04.student");
//		//��ȡ�޲����Ĺ��췽��Student();
//		Constructor c1=clazz.getConstructor();
//		//��ȡ�������Ĺ��췽��Student(String,String,int)
//		Constructor c2=clazz.getConstructor(String.class,String.class,Integer.class);
//		System.out.println(c1.getParameterCount());
//		System.out.println(c2.getParameterCount());
//		Object obj=c2.newInstance("aa","���D��",111);
//		System.out.println(obj);
//		
//	}
//	//��ȡ�����÷�public��Ա������ֵ
//	
//	
//}
