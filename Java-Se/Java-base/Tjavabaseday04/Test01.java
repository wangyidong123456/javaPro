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
//		// 暴力反射获取私有成员
//		Field f = clazz.getDeclaredField("studentId");
//		System.out.println(f);
//		// 创建对象实例
//		Object obj = clazz.newInstance();
//		System.out.println(obj);
//		// 给实例赋值
//		f.setAccessible(true);
//		f.set(obj, "熊红");
//		System.out.println(obj);
//
//	}
//	
//	@Test
//	public void test01() throws Exception {
//		Class clazz = Class.forName("Tjavabaseday04.student");
//		//获取无参数的构造方法Student();
//		Constructor c1=clazz.getConstructor();
//		//获取带参数的构造方法Student(String,String,int)
//		Constructor c2=clazz.getConstructor(String.class,String.class,Integer.class);
//		System.out.println(c1.getParameterCount());
//		System.out.println(c2.getParameterCount());
//		Object obj=c2.newInstance("aa","王燚东",111);
//		System.out.println(obj);
//		
//	}
//	//获取，设置非public成员变量的值
//	
//	
//}
